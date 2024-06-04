<?php
// Start the session
session_start();

// Store values in session variables
$_SESSION['username'] = 'john_doe';
$_SESSION['email'] = 'john.doe@example.com';
$_SESSION['logged_in'] = true;

echo "Values stored in session.";
?>
