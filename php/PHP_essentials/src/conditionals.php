<?php
	$number = 8;

	if ($number < 10) {
	   	echo "True";
	} else {
	   	echo "False";
	}
	echo "</br>";

	$anotherNumber = 10;

	if ($anotherNumber < 10) {
		echo "Less than 10";
	} elseif ($anotherNumber == 10) {
	   	echo "Equal to 10";
	} else {
	    echo "More than 10";
	}
	echo "</br>";

	$and_another = 9;

	switch ($and_another) {
		case 7:
			echo "That must be _seven_";
			break;
		case 8:
			echo "That must be _eight_";
		  	break;
		case 9:
			echo "That must be _nine_";
			break;
		default:
			echo "I have trouble to recognize that number...";
	}
	echo "</br>";
?>
