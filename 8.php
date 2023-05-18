<!-- DELETE FROM QUERY USING MySQLi-->
<html>
<body>
<span>Hello World!</span>
<?php
$servername = "localhost";
$username = "admin";
$password = "admin";
$dbname = "myDB";



// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

// sql to delete a record
$sql = "DELETE FROM MyGuests WHERE firstname='John'";

if ($conn->query($sql) === TRUE) {
    echo "Record deleted successfully";
} else {
    echo "Error deleting record: " . $conn->error;
}

$conn->close();
?>
</body>
</html>