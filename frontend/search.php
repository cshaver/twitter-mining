<?php
	header('Content-type: application/json');
	$tweets = array(
		"1234" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"1111" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"2222" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"2345" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"3456" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"4567" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"5678" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"5679" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"6789" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"7890" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"227822" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"8907" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"0987" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"9876" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"8765" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"7654" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"6543" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"5432" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"4321" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"124334" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"321" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"123482" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"383" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"1" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"2" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"3" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"4" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"5" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"6" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"7" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"8" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"9" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"0" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"11" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"22" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"33" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"44" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"55" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"66" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"667" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"77" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"88" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"888" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"99" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		"000" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/13/2013",
			"sentiment" => "positive",
			"airline" => "Spirit",
			"flightNumber" => "1234",
			"keywords" => "hello, flight, boarding"
			),
		"123" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/14/2013",
			"sentiment" => "neutral",
			"airline" => "American",
			"flightNumber" => "234",
			"keywords" => "hello, something, boarding"
			),
		"718" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/15/2013",
			"sentiment" => "positive",
			"airline" => "Southwest",
			"flightNumber" => "7532",
			"keywords" => "what, plane, landing"
			),
		"381" => array (
			"text" => "Hello i have a flight boarding",
			"date" => "7/16/2013",
			"sentiment" => "negative",
			"airline" => "Southwest",
			"flightNumber" => "0987",
			"keywords" => "okay, cry, angry"
			),
		);
	echo json_encode($tweets);
?>