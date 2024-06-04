<?php
// Set cookie values
$cookie_name = "user";
$cookie_value = "John Doe";
setcookie($cookie_name, $cookie_value, time() + (86400 * 30), "/"); // 86400 seconds = 1 day

echo "Cookie named '" . $cookie_name . "' has been set with the value '" . $cookie_value . "'.";
?>
