<!DOCTYPE html>
<html lang="en">
    <head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.9.3/css/bulma.min.css">
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>2nd class</title>
    </head>
    <body>
	<div class="container">
	    <div class="columns">
		<div class="column is-mobile">
		    <div class="box">
			<form method="POST" action="src/post_cookie.php">
			    <div>
				<h3>Form for cookie creation:</h3>
				<input name="name" placeholder="Name">
			    </div>
			    <button class="button is-outlined" type="submit" name="send" value="send">
				Send
			    </button>
			</form>
			<?php
			include 'src/post_cookie.php';
			?>
		    </div>
		</div>
		<br>
		<div class="column is-mobile">
		    <div class="box">
			<form method="POST" action="src/post_session.php">
			    <div>
				<h3>Form for session creation:</h3>
				<input name="surname" placeholder="Surname">
			    </div>
			    <button class="button is-outlined" type="submit" name="send2" value="send2">
				Send
			    </button>
			</form>
			<?php
			include 'src/post_session.php';
			?>
		    </div>
		</div>
	    </div>
	</div>
    </body>
</html>
