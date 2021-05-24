<?php

$cleardb_url = parse_url(getenv("CLEARDB_DATABASE_URL"));
$cleardb_server = $cleardb_url["eu-cdbr-west-01.cleardb.com"];
$cleardb_username = $cleardb_url["bcfd2372366099"];
$cleardb_password = $cleardb_url["a80abaef"];
$cleardb_db = substr($cleardb_url["path"],1);
$active_group = 'default';
$query_builder = TRUE;
// Connect to DB
$conn = mysqli_connect($cleardb_server, $cleardb_username, $cleardb_password, $cleardb_db);

/*
$sname= "localhost";
$uname= "root";
$password = "";

$db_name = "demo";

$conn = mysqli_connect($sname,$uname, $password, $db_name);


if (!$conn) {
	echo "Connection failed!";
}*/
?>