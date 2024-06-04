<?php
// Start the session
session_start();

// Retrieve values from session variables
$username = $_SESSION['username'];
$email = $_SESSION['email'];
$loggedIn = $_SESSION['logged_in'];

// Display retrieved values
echo "Username: " . $username . "<br>";
echo "Email: " . $email . "<br>";
echo "Logged In: " . ($loggedIn ? 'Yes' : 'No') . "<br>";
?>
