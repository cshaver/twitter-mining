<?php
function searchFlightNumbers($flightNum) {
                
                                mysql_connect("localhost", "root", "") or die(mysql_error()); 
                                mysql_select_db("twitter_data") or die(mysql_error()); 
                                
                                $airlines = array();

                                $result = mysql_query("SELECT * FROM airline_data WHERE flightNumber='$flightNum'");
                                while($row = mysql_fetch_array( $result )) {
                                                $id = $row["tweet_id"];

                                                $airlines[$id]["airline"] = substr($row["flightNumber"], 0, 3); 
                                                $airlines[$id]["flightNumber"] = $row["flightNumber"];
                                                $airlines[$id]["date_from"] = $row["departure_time"];
                                                $airlines[$id]["date_to"] = $row["arrival_time"];
                                                $airlines[$id]["metric"] = $row["Metric"];
                                }
                                
                                echo json_encode($airlines);
                }
                
    function searchAirline($airline) {
    
                    mysql_connect("localhost", "root", "") or die(mysql_error()); 
                    mysql_select_db("twitter_data") or die(mysql_error()); 
                    
                    $airline12 = array();
                    $flightnum = substr($row["flightNumber"]);

                    $result = mysql_query("SELECT * FROM airline_data WHERE field LIKE '%$flightnum%'");
                    while($row = mysql_fetch_array( $result )) {
                                    $id = $row["tweet_id"];

                                    $airlines12[$id]["airline"] = $flightnum; 
                                    $airlines12[$id]["flightNumber"] = $row["flightNumber"];
                                    $airlines12[$id]["date_from"] = $row["departure_time"];
                                    $airlines12[$id]["date_to"] = $row["arrival_time"];
                                    $airlines12[$id]["metric"] = $row["Metric"];
                    }
                    
                    echo json_encode($airlines12);
    }
                

	header('Content-type: application/json');

	mysql_connect("localhost", "root", "") or die(mysql_error()); 
 	mysql_select_db("twitter_data") or die(mysql_error()); 

 	//searchFlightNumbers($_POST['criteria']['flightNum']);
 	//searchFlightNumbers('qtr927');

 	$tweets = array();
 	$query ="SELECT * FROM airline_tweets";
 	// if (isset($_POST['criteria'])){
	 // 	$flightNum = $_POST['criteria']['flightNum'];
	 // 	$airline = $_POST['criteria']['airline'];

 	// }
	// if (isset($_POST['criteria']['flightNum'])){
	// 	$query = $query . "WHERE flightNumber='".$_POST['criteria']['flightNum']."'";
	// } 
 	$result = mysql_query($query);

 	//$result = mysql_query("SELECT * FROM airline_tweets LIMIT 10000");
    while($row = mysql_fetch_array( $result )) 
	{ 
		//print_r($row);
		// build the array
		$id = $row["ID"];
		$tweets[$id] = array();

		$tweets[$id]["text"] = $row["Tweet"];
		$tweets[$id]["date"] = $row["Date"];
		$tweets[$id]["username"] = $row["Username"];
		$tweets[$id]["followers"] = $row["Num_Follower"];
		$tweets[$id]["sentiment"] = $row["Sentiment_Type"];
		$tweets[$id]["airline"] = "";
		$tweets[$id]["flightNumber"] = "";
		$tweets[$id]["origin"] = "";
		$tweets[$id]["destination"] = "";
		$tweets[$id]["keywords"] = $row["Keywords"];
		$tweets[$id]["airline_data"] = array();

		$max_metric = 0;
 		$airline_result = mysql_query("SELECT * FROM airline_data where tweet_id = ".$row["ID"]);
    	while($airline_row = mysql_fetch_array( $airline_result )){
			//print_r($airline_row);
			$airline_id = $airline_row["id"];
			$tweets[$id]["airline_data"][$airline_id]["airline"] = "";
			$tweets[$id]["airline_data"][$airline_id]["flightNumber"] = $airline_row["flightNumber"];
			$tweets[$id]["airline_data"][$airline_id]["origin"] = $airline_row["origin_airport"];
			$tweets[$id]["airline_data"][$airline_id]["origin_city"] = $airline_row["origin_city"];
			$tweets[$id]["airline_data"][$airline_id]["destination"] = $airline_row["dest_airport"];
			$tweets[$id]["airline_data"][$airline_id]["destination_city"] = $airline_row["dest_city"];
			$tweets[$id]["airline_data"][$airline_id]["metric"] = $airline_row["Metric"];

			if ($airline_row["Metric"] > $max_metric)
			{
				$max_metric = $airline_row["Metric"];
				$tweets[$id]["airline"] = "";
				$tweets[$id]["flightNumber"] = $airline_row["flightNumber"];
				$tweets[$id]["origin"] = $airline_row["origin_airport"];
				$tweets[$id]["destination"] = $airline_row["dest_airport"];
			}
    	}

	} 

	//print_r($tweets);

	/*$tweets = array(
		"1234" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"origin" => "DFW",
			"destination" => "SJC",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding",
			"airline_data" => array (
					
				)
			)
		);
		*/
	echo json_encode($tweets);


?>