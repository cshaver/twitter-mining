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
  /*$('#tags').tagsInput({
    width: "",
    height: "",
    defaultText: "Keywords",
    placeholderColor: "#999"
  });*/

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

    propagateDataFromTables();
  }

  // add display type (table, map, graph, cloud) switching
  $("#display-links > button").click(function(e){
    e.preventDefault();
    $(this).siblings("button").removeClass("active");
    $(this).addClass("active");
    $("#results-column > .show-content").children().hide();
    $("#results-column > .show-content > #"+$(this).val()).show();
    var data = getVisibleFilterData();
    if($(this).val() == "graph-view"){
      createGraphs(data);
    }
    // if($(this).val() == "cloud-view"){
    //   createCloud(data);
    // }
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

  $("#doughnut-selector > li").click(function(){
    var selected = $(this).attr("class");
    var data = getVisibleFilterData();
    $(this).siblings().children("span").removeClass("icon-2x").removeClass("icon-3x").addClass("icon-2x");
    $(this).children("span").removeClass("icon-2x").addClass("icon-3x");
    createDoughnut(data, selected);
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
          // console.log("hello");
          // console.log(data);
          searchCallback(data);

          var totalReturned = Object.keys(data).length;
          $("#total-returned").text(totalReturned);

          if(!$("#search-column").hasClass("collapsed")){
            toggleElement($("#search-column .toggle:visible"));
          }
          if($("#filter-column").hasClass("collapsed")){
            toggleElement($("#filter-column .toggle:visible"));
          }
          //searchCallback($.parseJSON(data));
        },
        error:function( jqXHR,  textStatus,  errorThrown){
          // failed request; give feedback to user
          console.log("error" + errorThrown);
          //$('#ajax-panel').html('<p class="error"><strong>Oops!</strong> Try that again in a few moments.</p>');
        }
      });
  }

  function allTweets(){$.ajax({
        type: 'GET',
        url: 'search.php&total=true',
        datatype: "json",
        beforeSend:function(){
        },
        success:function(data){
          console.log(data);

        },
        error:function(){
        }
      });
  }

  function searchCallback(data){
    $("#filtrify-data-container").empty();
    for (var id in data){
      $row = $("<tr/>");
      for (var attr in data[id]){
        $row.attr("data-"+attr, data[id][attr]);
        if (attr != "keywords" && attr != "airline_data")
        {
          $cell = $("<td/>");
          if (attr == "text"){
            $cell.attr("colspan", "2");
          }
          $cell.text(data[id][attr]);
          $row.append($cell);
        }

        if (attr == "airline_data")
        {
          if (Object.keys(data[id][attr]).length > 0)
          {
            $row.append($("<td class='row-details'><i class='icon-chevron-down'></i></td>"));
            $("#filtrify-data-container").append($row);
            var $subTableRow = $("<tr style='display: none;'><td colspan=11><div style='display:none;'></div></td></tr>");
            var $subTable = $("<table class='table table-details'><thead><tr><th>Airline</th><th>Flight Number</th><th>Origin</th><th>Origin City</th><th>Destination</th><th>Destination City</th><th>Confidence</th></tr></thead><tbody></tbody></table>");
            //var $subRows  $("");
            $subTableRow.find("div").append($subTable);
            for (var airline_data in data[id][attr]){
              $row = $("<tr/>");
              //console.log(data[id][attr][airline_data]);
              for (var airline_attr in data[id][attr][airline_data])
              {
                $cell = $("<td/>");
                $cell.text(data[id][attr][airline_data][airline_attr]);
                $row.append($cell);
              }
              $subTable.find("tbody").append($row);
            }
            $("#filtrify-data-container").append($subTableRow);
            //<tr><td>something</td><td>something</td><td>something</td><td>something</td></tr><tr><td>something</td><td>something</td><td>something</td><td>something</td></tr><tr><td>something</td><td>something</td><td>something</td><td>something</td></tr></tbody></table></div></td></tr>"));
        
          }
        }
      }
    }

    $(".row-details").click(function(){
      var next = $(this).parent().next()
      if(next.is(":visible")){
        $(this).children().attr("class", "icon-chevron-down");
        next.find("div").slideUp(400, function(){next.hide();});
      }
      else{
        $(this).children().attr("class", "icon-chevron-up");
        next.show();
        next.find("div").slideDown();    
      }
    });

    startFiltrify();
    propagateDataFromTables();
  }

  function startFiltrify(){
    // start filtrify
    $.filtrify("filtrify-data-container", "filtrify-filter-container",
    {
      callback: filtrifyCallback,
      block: ["data-keywords","data-airline", "data-text", "data-date", "data-flightnumber", "data-origin", "data-destination", "data-airline_data", "data-followers", "data-username"]
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
    var totalFiltered = Object.keys(data).length;
    $("#total-filtered").text(totalFiltered);
    createGraphs(data);
    //createCloud(data);
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

    createDoughnut(count);

    new Chart(sentimentLineCtx).Line( {
      labels : keys,
      datasets : [
        { // positive - 4D5360
          fillColor : "rgba(77, 83, 96,0.5)",
          strokeColor : "rgba(77, 83, 96,1)",
          pointColor : "rgba(77, 83, 96,1)",
          pointStrokeColor : "#fff",
          data : posArr
        },
        { // negative F7464A
          fillColor : "rgba(247, 70, 74,0.5)",
          strokeColor : "rgba(247, 70, 74,1)",
          pointColor : "rgba(247, 70, 74,1)",
          pointStrokeColor : "#fff",
          data : negArr
        },
        { //neutral D4CCC5
          fillColor : "rgba(162, 154, 147,0.5)",
          strokeColor : "rgba(162, 154, 147,1)",
          pointColor : "rgba(162, 154, 147,1)",
          pointStrokeColor : "#fff",
          data : neuArr
        }
      ]
    }, {animation: false, scaleShowLabels: false});
  }

  function createDoughnut(data, selected){
    // if selected, we need to do data
    // if not solected, we have data

    //Get context with jQuery - using jQuery's .get() method.
    var sentimentDoughnutCtx = $("#keyword-doughnut").get(0).getContext("2d");

    // count sentiment overall
    var count = {};
    count.positive = 0;
    count.negative = 0;
    count.neutral = 0;

    var blue = "77, 83, 96";
    var red = "247, 70, 74";
    var gray = "162, 154, 147";

    var color = {
      positive : "rgba("+blue+", 1.0)",
      negative : "rgba("+red+", 1.0)",
      neutral : "rgba("+gray+", 1.0)",
      positiveTransparent : "rgba("+blue+", 0.4)",
      negativeTransparent : "rgba("+red+", 0.4)",
      neutralTransparent : "rgba("+gray+", 0.4)",
    }

    var animation = false;

    $("#graph-center").hide();

    if (selected != null){
      for (var i = 0; i < data.length; i++)
      {
        count[data[i].sentiment]++;
      }

      var total = count.positive + count.negative + count.neutral;

      var percentSelected = count[selected] / total * 100;
      percentSelected = Math.round(percentSelected);
      count.positive = count.positive * 360 / total;
      count.negative = count.negative * 360 / total;
      count.neutral = count.neutral * 360 / total;

      $("#graph-center > span").text(selected);
      $("#graph-center > h1").text(percentSelected + "%")
      $("#graph-center").show().css("color", color[selected]);

      switch (selected){
        case "positive":
          color.negative = color.negativeTransparent;
          color.neutral = color.neutralTransparent;
          break;
        case "negative":
          color.positive = color.positiveTransparent;
          color.neutral = color.neutralTransparent;
          break;
        case "neutral":
          color.positive = color.positiveTransparent;
          color.negative = color.negativeTransparent;
          break;
      }

      animation = false;
    }
    else{
      count = data;
      $("#doughnut-selector > li").children("span").removeClass("icon-2x").removeClass("icon-3x").addClass("icon-2x");
    }

    new Chart(sentimentDoughnutCtx).Doughnut([
      {
        value: count.negative,
        color: color.negative
      },
      {
        value : count.neutral,
        color : color.neutral
      },
      {
        value : count.positive,
        color : color.positive
      }],
      {
        animation : animation
      });

  }

  // function createCloud(data){
  //   // count keywords
  //   var keywordsCount = {};
  //   for (var i = 0; i < data.length; i++)
  //   {
  //     var keywords = data[i].keywords;
  //     for (var j = 0; j < keywords.length; j++){
  //       if (typeof keywordsCount[keywords[j]] == "undefined"){
  //         keywordsCount[keywords[j]] = {}
  //         keywordsCount[keywords[j]].count = 0;
  //         keywordsCount[keywords[j]].positive = 0;
  //         keywordsCount[keywords[j]].negative = 0;
  //         keywordsCount[keywords[j]].neutral = 0;
  //       }
  //       keywordsCount[keywords[j]].count++;
  //       keywordsCount[keywords[j]][data[i].sentiment]++;
  //     }
  //   }

  //   var word_array = [];

  //   var color = {
  //     positive : "blue",
  //     negative : "red",
  //     neutral : "gray"
  //   }
  //   for (var key in keywordsCount){
  //     var avg = ((keywordsCount[key].negative * -1) + (keywordsCount[key].positive * 1))/(keywordsCount[key].count);
  //     var sentiment = "";
  //     switch (true){
  //       case avg < -0.33:
  //         sentiment = "negative";
  //         break;
  //       case avg >= -0.33 && avg <= 0.33:
  //         sentiment = "neutral";
  //         break;
  //       case avg > 0.33:
  //         sentiment = "positive";
  //         break;
  //     }
  //     word_array.push({text: key, weight: keywordsCount[key].count, html: {class: color[sentiment]}});
      
  //   }

  //   $("#jqcloud").empty();
  //   $("#jqcloud").jQCloud(word_array);  
  // }

  function createMap(data){
    $("#map").empty();
    var w = 900,
        h = 600;

    var projection = d3.geo.azimuthal()
        .mode("equidistant")
        .origin([-98, 38])
        .scale(1100)
        .translate([450, 375]);

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

    var flights = data;
    var linksByOrigin = {},
        countByAirport = {},
        locationByAirport = {},
        positions = [],
        sentimentAvgByOrigin = {},
        pathCountByOrigin = {};

    var arc = d3.geo.greatArc()
        .source(function(d) { return locationByAirport[d.source]; })
        .target(function(d) { return locationByAirport[d.target]; });

    flights.forEach(function(flight) {
      var origin = flight.origin[0],
          destination = flight.destination[0];

      if (origin.length != 3){
        origin = origin.substring(1, 4)
      }
      if (destination.length != 3){
        destination = destination.substring(1, 4)
      }
      var originInAirports = false;
      var destInAirports = false;
      d3.csv("airports.csv", function(airports) {
        //console.log(airports);
      // Only consider airports with at least one flight.
        for(var airport in airports){
          if (airport.iata == origin) {
            originInAirports = true;
          }
          if (airport.iata == destination) {
            destInAirports = true;
          }
        }
      });
      console.log((destInAirports && originInAirports));
      if (destInAirports && originInAirports){
        var sentiment = flight.sentiment[0],
            sentimentNum = 0,
            links = linksByOrigin[origin] || (linksByOrigin[origin] = []);

        switch (sentiment){
          case "positive":
            sentimentNum = 1;
            break;
          case "negative":
            sentimentNum = -1;
            break;
        }
        links.push({source: origin, target: destination});
        countByAirport[origin] = (countByAirport[origin] || 0) + 1;
        countByAirport[destination] = (countByAirport[destination] || 0) + 1;
        sentimentAvgByOrigin[origin] = sentimentAvgByOrigin[origin] || {};
        sentimentAvgByOrigin[origin][destination] = (sentimentAvgByOrigin[origin][destination] || 0) + sentimentNum;
        pathCountByOrigin[origin] = pathCountByOrigin[origin] || {};
        pathCountByOrigin[origin][destination] = (pathCountByOrigin[origin][destination] || 0) + 1;
      }
    });

    for(var origin in sentimentAvgByOrigin){
      for (var destination in sentimentAvgByOrigin[origin]){
        sentimentAvgByOrigin[origin][destination] = sentimentAvgByOrigin[origin][destination] / pathCountByOrigin[origin][destination];
        
        if (sentimentAvgByOrigin[origin][destination] < -0.33){
          sentimentAvgByOrigin[origin][destination] = "red";
        }
        if (sentimentAvgByOrigin[origin][destination] >= -0.33 && sentimentAvgByOrigin[origin][destination] <= 0.33){
          sentimentAvgByOrigin[origin][destination] = "gray";
        }
        if (sentimentAvgByOrigin[origin][destination] > 0.33){
          sentimentAvgByOrigin[origin][destination] = "blue";
        }
      }
    }

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

    console.log("positions: ");
    console.log(positions);

      var g = cells.selectAll("g")
          .data(airports)
        .enter().append("svg:g");

      g.append("svg:path")
          .attr("class", "cell")
          .attr("d", function(d, i) { return "M" + polygons[i].join("L") + "Z"; })
          .on("mouseover", function(d, i) { d3.select("#map-text").text(d.name); });

      console.log(linksByOrigin);
      // color the arc red based on avg of flights in that path
      g.selectAll("path.arc")
          .data(function(d) { return linksByOrigin[d.iata] || []; })
        .enter().append("svg:path")
          .attr("class", function(d) { return "arc " + sentimentAvgByOrigin[d.source][d.target]; })
          .attr("d", function(d) { return path(arc(d)); });

      circles.selectAll("circle")
          .data(airports)
        .enter().append("svg:circle")
          .attr("cx", function(d, i) { return positions[i][0]; })
          .attr("cy", function(d, i) { return positions[i][1]; })
          .attr("r", function(d, i) { return 2 + Math.sqrt(countByAirport[d.iata]); })
          .sort(function(a, b) { return countByAirport[b.iata] - countByAirport[a.iata]; });
    });
  }
});