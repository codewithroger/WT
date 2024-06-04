<?php

include 'connect.php';

$sql = "SELECT name, email, age FROM users";
$result = $conn->query($sql);

// Check if there are any rows in the result set
if ($result->num_rows > 0) {
    
    while ($row = $result->fetch_assoc()) {
        echo " Name: " . $row["name"] . " - Email: " . $row["email"] . " - Age: " . $row["age"] . "<br>";
    }
} else {
    echo "No records found.";
}

$conn->close();
?>
