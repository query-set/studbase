<?php
    include '../utils.php';

    # exercise 2
    $txt = "Programming in PHP";
    echo "Length of $txt: ";
    betterEcho((strlen($txt)));

    $wronglyFormattedTxt = "Programming in PhP";
    betterEcho($wronglyFormattedTxt);
    betterEcho(strtolower($wronglyFormattedTxt));
    betterEcho(strtoupper($wronglyFormattedTxt));

    $shortTxt = "chestnut ";
    betterEcho(str_repeat($shortTxt, 5));

    $anotherTxt = "platypus";
    betterEcho(str_repeat($anotherTxt, 15));

    # exercise 3
    $txtToReverse = "text";
    betterEcho($txtToReverse);
    betterEcho(strrev($txtToReverse));
    betterEcho(strrev(strrev($txtToReverse)));

    $txtToMix = "Text to mix";
    betterEcho($txtToMix);
    betterEcho(str_shuffle($txtToMix));

    $txtToPick = "First part, second part";
    betterEcho($txtToPick);
    betterEcho(substr($txtToPick, 16, 20));

    # exercise 4
    $txtToReplace = "lemon";
    betterEcho($txtToReplace);
    betterEcho(str_replace($txtToReplace, "lemon", "kiwi"));

    $longTxt = "That text could be really long if you want it to...";
    betterEcho(wordwrap($longTxt, 5, "\n", false));

?>