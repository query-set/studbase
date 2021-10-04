<?php
    echo "`for` loop: <br>";
    for ($x = 0; $x <= 10; $x++) {
        echo "The number is $x <br>";
    }
    echo "<br>";

    $i = 0;
    $j = 5;

    echo "`while` loop: <br>";
    while ($i < $j) {
        echo "The number is $i <br>";
        $i++;
    }
    echo "<br>";

    echo "Loop rendering HTML: <br>";
    echo "Base operators available in PHP: <br>";
    $operators = array("+", "-", "*", "/");

    echo "<ul>";
    for ($i = 0; $i < 4; $i++) {
        echo "<li>" . $operators[$i] . "</li>";
    }
    echo "</ul>";
?>