<?php
// Include the database connection file
include 'connect.php';

// Sample data
$name = "John Doe";
$email = "john.doe@example.com";
$age = 30;

// SQL query to insert data into a table
$sql = "INSERT INTO users (name, email, age) VALUES ('$name', '$email', '$age')";

// Execute the query and check if insertion was successful
if ($conn->query($sql) === TRUE) {
    echo "New record inserted successfully.";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}


// Close the database connection
$conn->close();
?>
