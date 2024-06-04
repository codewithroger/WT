<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Collect and sanitize input data
    $name = htmlspecialchars($_POST['name']);
    $email = htmlspecialchars($_POST['email']);

    // Validate the input (basic example)
    if (!empty($name) && filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "Name: " . $name . "<br>";
        echo "Email: " . $email . "<br>";
    } else {
        echo "Invalid input.";
    }
} else {
    echo "Form not submitted.";
}
?>
