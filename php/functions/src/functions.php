<?php
    function firstFunction () {
        return "Message from first function! <br>";
    }

    function functionMultiArity() {
        return "Number of given arguments: " . count(func_get_args()) . "<br>";
    }

    function functionWithReference(&$name) {
        echo "Function that handles variable reference has been called! <br>";
        $name = "Bob";
    }
?>