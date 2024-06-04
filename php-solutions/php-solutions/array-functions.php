<?php
// 1. array_push()
$fruits = ["Apple", "Banana", "Cherry"];
array_push($fruits, "Date", "Elderberry");
echo "After array_push: ";
print_r($fruits);
echo "<br>";

// 2. array_pop()
$poppedFruit = array_pop($fruits);
echo "Popped fruit: " . $poppedFruit . "<br>";
echo "After array_pop: ";
print_r($fruits);
echo "<br>";

// 3. array_merge()
$vegetables = ["Carrot", "Lettuce"];
$groceries = array_merge($fruits, $vegetables);
echo "After array_merge: ";
print_r($groceries);
echo "<br>";

// 4. array_keys()
$person = ["first_name" => "John", "last_name" => "Doe", "age" => 30];
$keys = array_keys($person);
echo "Array keys: ";
print_r($keys);
echo "<br>";

// 5. array_slice()
$slicedArray = array_slice($groceries, 1, 3);
echo "Array slice: ";
print_r($slicedArray);
echo "<br>";
?>
