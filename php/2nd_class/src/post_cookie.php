<?php
// 7th exercise from `web elements` class
if (isset($_POST['send']) && $_POST['send']) {
    $cookie_value = $_POST['name'];
    setcookie("my-cookie", $cookie_value);
    header("Location: localhost:8000");
}

// The closing tag of a PHP block at the end of a file is optional, and in
// some cases omitting it is helpful when using include or require, so
// unwanted whitespace will not occur at the end of files, and you will
// still be able to add headers to the response later. It is also handy
// if you use output buffering, and would not like to see added unwanted
// whitespace at the end of the parts generated by the included files.
