
    <?php
    header('Content-type: text/plain');

    $person = array(
        "first_name" => "John",
        "last_name" => "Doe",
        "age" => 30,
        "email" => "john.doe@example.com"
    );

    // Alternative syntax 
    $person = [
        "first_name" => "John",
        "last_name" => "Doe",
        "age" => 30,
        "email" => "john.doe@example.com"
    ];

    
    $person["occupation"] = "Software Developer";

    // Updating an element in the associative array
    $person["age"] = 31;

    // Removing an element from the associative array
    unset($person["email"]);

    // Iterating over an associative array
    echo "Iterating array\n";
    foreach ($person as $key => $value) {
        echo $key . ": " . $value . "\n";
    }

    echo "\n\n";
    // Accessing elements in the associative array
    echo "First Name: " . $person["first_name"] . "\n";
    echo "Age: " . $person["age"] . "\n";

    // Checking if a key exists in the associative array
    if (array_key_exists("last_name", $person)) {
        echo "Last Name: " . $person["last_name"] . "\n";
    } else {
        echo "Last Name key does not exist\n";
    }

    // Counting the number of elements in the associative array
    echo "Number of elements: " . count($person) . "\n";
    ?>

