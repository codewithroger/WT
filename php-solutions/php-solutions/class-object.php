<?php

class Car {
    // Properties
    public $make;
    public $model;
    public $year;

    // Constructor
    public function __construct($make, $model, $year) {
        $this->make = $make;
        $this->model = $model;
        $this->year = $year;
    }

    public function getDescription() {
        return $this->year . " " . $this->make . " " . $this->model;
    }

    public function start() {
        return "The " . $this->getDescription() . " is starting.";
    }

    public function stop() {
        return "The " . $this->getDescription() . " is stopping.";
    }
}

// Instantiate objects of the Car class
$car1 = new Car("Toyota", "Corolla", 2020);
$car2 = new Car("Honda", "Civic", 2018);


echo $car1->getDescription() . "<br>"; 
echo $car1->start() . "<br>"; 
echo $car1->stop() . "<br>"; 

echo $car2->getDescription() . "<br>"; 
echo $car2->start() . "<br>"; 
echo $car2->stop() . "<br>"; 
?>
