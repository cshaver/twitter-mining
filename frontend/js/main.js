$(function() {
  // add search/filter column toggling
  // changes class of parent div to give correct sizing
  // and positioning to all columns
  $(".toggle").click(function(){
    toggleElement($(this));
  });

  function toggleElement($element){
    $element.parent().parent().toggleClass("collapsed");
    
    var $contentDiv = $element.parents("#content");
    var state = $contentDiv.attr("class");
    var toggledClass = $element.parents("#content > div").attr("id").replace("-column", "");
    
    switch(state){
      case "none-up":
        if (toggledClass == "filter"){
          $contentDiv.attr("class", "one-up-filter");
        }
        if (toggledClass == "search"){
          $contentDiv.attr("class", "one-up-search");
        }
        break;
      case "one-up-filter":
        if (toggledClass == "filter"){
          $contentDiv.attr("class", "none-up");
        }
        if (toggledClass == "search"){
          $contentDiv.attr("class", "two-up");
        }
        break;
      case "one-up-search":
        if (toggledClass == "filter"){
          $contentDiv.attr("class", "two-up");
        }
        if (toggledClass == "search"){
          $contentDiv.attr("class", "none-up");
        }
        break;
      case "two-up":
        if (toggledClass == "filter"){
          $contentDiv.attr("class", "one-up-search");
        }
        if (toggledClass == "search"){
          $contentDiv.attr("class", "one-up-filter");
        }
        break;
    }
  }

  // start tagsinput
  $('#tags').tagsInput({
    width: "",
    height: "",
    defaultText: "keywords",
    placeholderColor: "#999"
  });

  // add tooltips to everything
  $(".tooltip-link").tooltip();

  // add nice focus shadow used in bootstrap to tag input (since it uses a div)
  $("#tags-div > div").children().focusin(function(){
    $(this).parents("#tags-div > div").addClass("inputShadow");
  }).focusout(function(){
    $(this).parents("#tags-div > div").removeClass("inputShadow");
  });

  // start jquery ui datepicker
  $(".date").datepicker();

  // filtrify callback that:
  // - changes filter icon
  // - moves filtered data to other views
  // - counts filtered data
  function filtrifyCallback(query, match, mismatch){
    getVisibleFilterData();

    // change face based on sentiment selected
    var face = "smile";
    if (query.sentiment.length == 1){
      var sentiment = query.sentiment[0];
      switch(sentiment){
        case "positive":
            face = "smile";
          break;
        case "negative":
          face = "frown";
          break;
        case "neutral":
          face = "meh";
          break;
      }
    }
    $("#filtrify-filter-container .ft-label").each(function(i){
      var text = $(this).text();
      if (text == "sentiment")
      {
        $(this).children("i").attr("class", "icon-"+face);
      }
    });
  }

  // add display type (table, map, graph, cloud) switching
  $("#display-links > button").click(function(e){
    e.preventDefault();
    $(this).siblings("button").removeClass("active");
    $(this).addClass("active");
    $("#results-column > .show-content").children().hide();
    $("#results-column > .show-content > #"+$(this).val()).show();
    if($(this).val() == "graph-view"){
      var data = getVisibleFilterData();
      createGraphs(data);
    }
  });

  $("#search-submit").click(function(e){
    e.preventDefault();
    var $form = $(this).parent();
    var data = {};
    // iterate over inputs and selects and add their data
    // ignore add criteria select
    // do keywords div separately
    $("#search-form").find("input:visible, select:visible").each(function(index, element){
      if ($(this).attr("id") != "tags_tag" && $(this).attr("id") != "add-criteria"){
        var name = $(this).attr("name");
        data[name] = $(this).val();
      }
    });

    data["keywords"] = [];
    $("#tags-div").find("span.tag").each(function(index, element){
      data["keywords"].push($(this).text);
    });

    search(data);
    return false;
  });

  // get count of filter data from visible elements
  function getVisibleFilterData(){
    data = [];
    var parentVisible = $("#table-view").is(":visible");
    if(!parentVisible){
      $("#table-view").show();
    }
    $("#filtrify-data-container").children(":visible").each(function( index, element ) {
      attr = element.attributes;
      item = {};
      for ( i = 0 ; i < attr.length; i++ ) {
        name = attr[i].name;
        if ( name.indexOf( "data-" ) === 0) {
          field = name.replace(/data-/gi, "").replace(/-/gi, " ");
          tags = element.getAttribute( name ).split(", ");
          item[field] = tags;
        }
      }
      data.push(item);
    });
    if(!parentVisible){
      $("#table-view").hide();
    }
    return data;
  }

  function search(criteria){
    $.ajax({
        type: 'POST',
        url: 'search.php',
        datatype: "json",
        data: { criteria: criteria },
        beforeSend:function(){
          // this is where we append a loading image
          //$('#ajax-panel').html('<div class="loading"><img src="/images/loading.gif" alt="Loading..." /></div>');
        },
        success:function(data){
          // successful request; do something with the data
          //$('#ajax-panel').empty();
          //$(data).find('item').each(function(i){
          //  $('#ajax-panel').append('<h4>' + $(this).find('title').text() + '</h4><p>' + $(this).find('link').text() + '</p>');
          //});
          searchCallback(data);
          if(!$("#search-column").hasClass("collapsed")){
            toggleElement($("#search-column .toggle:visible"));
          }
          if($("#filter-column").hasClass("collapsed")){
            toggleElement($("#filter-column .toggle:visible"));
          }
          //searchCallback($.parseJSON(data));
        },
        error:function(){
          // failed request; give feedback to user
          //$('#ajax-panel').html('<p class="error"><strong>Oops!</strong> Try that again in a few moments.</p>');
        }
      });
  }

  function searchCallback(data){
    for (var id in data){
      $row = $("<tr/>");
      for (var attr in data[id]){
        $row.attr("data-"+attr, data[id][attr]);
        if (attr != "keywords")
        {
          $cell = $("<td/>");
          $cell.text(data[id][attr]);
          $row.append($cell);
        }
      }
      $("#filtrify-data-container").append($row);
    }

    startFiltrify();
    propagateDataFromTables();
  }

  function startFiltrify(){
    // start filtrify
    $.filtrify("filtrify-data-container", "filtrify-filter-container",
    {
      callback: filtrifyCallback,
      block: ["data-text", "data-date", "data-flightnumber"]
    });

    // use relevant icons on filtrify filters
    $("#filtrify-filter-container .ft-label").each(function(i){
      var text = $(this).text();
      var $icon = $("<i/>");
      switch(text){
        case "sentiment":
          $icon.addClass("icon-smile");
          break;
        case "airline":
          $icon.addClass("icon-plane");
          break;
        case "keywords":
          $icon.addClass("icon-tag");
          break;
      }
      $(this).prepend($icon);
    });
  }

  // copy filtered data from table view to otherviews
  function propagateDataFromTables(){
    var data = getVisibleFilterData();
    createGraphs(data);
    createCloud(data);
    createMap(data);
  }

  function createGraphs(data){

    //Get context with jQuery - using jQuery's .get() method.
    var sentimentDoughnutCtx = $("#keyword-doughnut").get(0).getContext("2d");
    var sentimentLineCtx = $("#sentiment-line").get(0).getContext("2d");
    //This will get the first returned node in the jQuery collection.
    //var myNewChart = new Chart(sentimentRadarCtx);


    // count sentiment overall
    var count = {};
    count.positive = 0;
    count.negative = 0;
    count.neutral = 0;

    // compute sentiments over time
    var dateSentiment = {};
    for (var i = 0; i < data.length; i++)
    {
      if (typeof dateSentiment[data[i].date] == "undefined"){
        dateSentiment[data[i].date] = {};
      }

      if (typeof dateSentiment[data[i].date][data[i].sentiment] == "undefined"){
        dateSentiment[data[i].date][data[i].sentiment] = 0;
      }
      count[data[i].sentiment]++;
      dateSentiment[data[i].date][data[i].sentiment]++;

    }
    var keys = Object.keys(dateSentiment);
    keys.sort();
    var posArr = [],
        negArr = [],
        neuArr = [];
    for (var i = 0; i < keys.length; i++)
    {
      posArr.push(typeof dateSentiment[keys[i]].positive != "undefined"? dateSentiment[keys[i]].positive : 0);
      negArr.push(typeof dateSentiment[keys[i]].negative != "undefined"? dateSentiment[keys[i]].negative : 0);
      neuArr.push(typeof dateSentiment[keys[i]].neutral != "undefined"? dateSentiment[keys[i]].neutral : 0);
    }

    var total = count.positive + count.negative + count.neutral;
    count.positive = count.positive * 360 / total;
    count.negative = count.negative * 360 / total;
    count.neutral = count.neutral * 360 / total;


    new Chart(sentimentDoughnutCtx).Doughnut([
      {
        value: count.negative,
        color:"#F7464A"
      },
      {
        value : count.neutral,
        color : "#D4CCC5"
      },
      {
        value : count.positive,
        color : "#4D5360"
      }]);

    new Chart(sentimentLineCtx).Line( {
      labels : keys,
      datasets : [
        { // positive - F7464A
          fillColor : "rgba(247, 70, 74,0.5)",
          strokeColor : "rgba(247, 70, 74,1)",
          pointColor : "rgba(247, 70, 74,1)",
          pointStrokeColor : "#fff",
          data : posArr
        },
        { // negative D4CCC5
          fillColor : "rgba(212, 204, 197,0.5)",
          strokeColor : "rgba(212, 204, 197,1)",
          pointColor : "rgba(212, 204, 197,1)",
          pointStrokeColor : "#fff",
          data : negArr
        },
        { //neutral 4D5360
          fillColor : "rgba(77, 83, 96,0.5)",
          strokeColor : "rgba(77, 83, 96,1)",
          pointColor : "rgba(77, 83, 96,1)",
          pointStrokeColor : "#fff",
          data : neuArr
        }
      ]
    });
  
  }

  function createCloud(data){
    // count keywords
    var keywordsCount = {};
    for (var i = 0; i < data.length; i++)
    {
      var keywords = data[i].keywords;
      for (var j = 0; j < keywords.length; j++){
        if (typeof keywordsCount[keywords[j]] == "undefined"){
          keywordsCount[keywords[j]] = 0;
        }
        keywordsCount[keywords[j]]++;
      }
    }

    var word_array = [];
    for (var key in keywordsCount){
      word_array.push({text: key, weight: keywordsCount[key]});
    }

    $(function() {
      // When DOM is ready, select the container element and call the jQCloud method, passing the array of words as the first argument.
      $("#jqcloud").jQCloud(word_array);
    });
  }

  function createMap(data){
    var w = 600,
        h = 400;

    var projection = d3.geo.azimuthal()
        .mode("equidistant")
        .origin([-98, 38])
        .scale(700)
        .translate([300, 200]);

    var path = d3.geo.path()
        .projection(projection);

    var svg = d3.select("#map").append("svg:svg")
        .attr("width", w)
        .attr("height", h);

    var states = svg.append("svg:g")
        .attr("id", "states");

    var circles = svg.append("svg:g")
        .attr("id", "circles");

    var cells = svg.append("svg:g")
        .attr("id", "cells");

    d3.select("input[type=checkbox]").on("change", function() {
      cells.classed("voronoi", this.checked);
    });

    d3.json("us-states.json", function(collection) {
      states.selectAll("path")
          .data(collection.features)
        .enter().append("svg:path")
          .attr("d", path);
    });

    d3.csv("flights-airport.csv", function(flights) {
      var linksByOrigin = {},
          countByAirport = {},
          locationByAirport = {},
          positions = [];

      var arc = d3.geo.greatArc()
          .source(function(d) { return locationByAirport[d.source]; })
          .target(function(d) { return locationByAirport[d.target]; });

      flights.forEach(function(flight) {
        var origin = flight.origin,
            destination = flight.destination,
            links = linksByOrigin[origin] || (linksByOrigin[origin] = []);
        links.push({source: origin, target: destination});
        countByAirport[origin] = (countByAirport[origin] || 0) + 1;
        countByAirport[destination] = (countByAirport[destination] || 0) + 1;
      });

      d3.csv("airports.csv", function(airports) {

        // Only consider airports with at least one flight.
        airports = airports.filter(function(airport) {
          if (countByAirport[airport.iata]) {
            var location = [+airport.longitude, +airport.latitude];
            locationByAirport[airport.iata] = location;
            positions.push(projection(location));
            return true;
          }
        });

        // Compute the Voronoi diagram of airports' projected positions.
        var polygons = d3.geom.voronoi(positions);

        var g = cells.selectAll("g")
            .data(airports)
          .enter().append("svg:g");

        g.append("svg:path")
            .attr("class", "cell")
            .attr("d", function(d, i) { return "M" + polygons[i].join("L") + "Z"; })
            .on("mouseover", function(d, i) { d3.select("#footer span").text(d.name); });

        g.selectAll("path.arc")
            .data(function(d) { return linksByOrigin[d.iata] || []; })
          .enter().append("svg:path")
            .attr("class", "arc")
            .attr("d", function(d) { return path(arc(d)); });

        circles.selectAll("circle")
            .data(airports)
          .enter().append("svg:circle")
            .attr("cx", function(d, i) { return positions[i][0]; })
            .attr("cy", function(d, i) { return positions[i][1]; })
            .attr("r", function(d, i) { return Math.sqrt(countByAirport[d.iata]); })
            .sort(function(a, b) { return countByAirport[b.iata] - countByAirport[a.iata]; });
      });
    });
  }

});