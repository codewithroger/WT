<?php
// Retrieve cookie values
if (isset($_COOKIE['user'])) {
    $cookie_value = $_COOKIE['user'];
    echo "Value of cookie 'user' is: " . $cookie_value;
} else {
    echo "Cookie named 'user' is not set.";
}
?>
