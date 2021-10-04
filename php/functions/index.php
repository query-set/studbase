<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Functions</title>
  </head>
  <body>
    <div class="section">
	    <h3>Functions</h3>
	      <?php

	        include 'src/functions.php';
            echo firstFunction();
            echo "<br>";

            echo "Sending four arguments: <br>";
            echo functionMultiArity(1, 2, 3, 4);
            echo "Sending nine arguments: <br>";
            echo functionMultiArity(6, 7, 8, 9, 10, 11, 12, 13, 14);
            echo "<br>";

            $nameWithReference = "Mark";
            echo "Name before function call: $nameWithReference <br>";
            echo functionWithReference($nameWithReference);
            echo "Name after function call: $nameWithReference <br>"; 
            echo "<br>";
	      ?>
    </div>
  </body>
</html>
