<?php
    include '../utils.php';

    function prettyPrintArr($arr) {
        foreach($arr as $key => $val) {
            echo "$key = $val <br>";
        }
    }

    # exercise 2
    $arr = array("first", "second", "third");

    echo "Second element from array: ";
    betterEcho($arr[1]);

    echo "Printing all elements of array: <br>";
    foreach ($arr as $element) {
        betterEcho($element) . "<br>";
    }

    echo "Print array in human-readable way: <br>";
    betterEcho(print_r($arr));

    echo "<br> Count of array: ";
    betterEcho(count($arr));

    # exercise 3
    $newArray = array(
        "PHP" => "Phahaha",
        "ROR" => "Ruby on Rails",
        "AWS" => "Amazon Web Services",
    );

    echo "<br>Created new array, getting second element from array: <br>";
    betterEcho($newArray["ROR"]) . "<br>";

    echo "Overwriting second element in the array... <br>";
    $replacement = array("PHP" => "PHP: Hypertext Preprocessor");
    $newArray = array_replace($newArray, $replacement);
    echo "Printing out changed array: <br>";
    print_r($newArray);  

    echo "<br> Reversing array... <br>";
    print_r(array_reverse($newArray));
    echo "<br>";

    # exercise 4
    function isIn($arr, $element) {
        foreach($arr as $e) {
            if ($e == $element) {
                echo "Found the desired element: $element <br>";
                return;
            }
        }
        echo "Cannot find the desired element: $element <br>";
    }

    betterEcho("Searching through the array...");
    $a = array("C#", "C++", "C");
    isIn($a, "C++");
    isIn($a, "PHP");

    # exercise 5
    $names = array("Casey", "Ronald", "Monica", "Patrick");
    echo "Using `natcasesort` function on array of names... <br>";
    natcasesort($names);
    print_r($names);
    echo "<br>";

    $num_arr = array(1, 2, 4, 9, 8, 7, 6);

    echo "Using `rsort` function on array of numbers... <br>";
    rsort($num_arr);
    prettyPrintArr($num_arr);
    echo "<br>";
    
    echo "Using `shuffle` function on array of numbers... <br>";
    shuffle($num_arr);
    prettyPrintArr($num_arr);
    echo "<br>";

    # exercise 6
    $fruits = array(
        "g" => "grapes",
        "b" => "banana",
        "l" => "lemon"
    );

    $vegetables = array(
        "c" => "carrot",
        "p" => "potato"
    );

    echo "Using `array_merge` function to create one big array... <br>";
    $food = array_merge($fruits, $vegetables);
    print_r($food);
    echo "<br>";

    echo "Using `array_map` function to make those words bigger... <br>";
    $small = array("all", "those", "words", "are", "uppercase");
    $big = array_map('strtoupper', $small);
    print_r($big);
    echo "<br>";
    


?>