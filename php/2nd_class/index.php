<!DOCTYPE html>
<html lang="en">
    <head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>2nd class</title>
    </head>
    <body>
	<div class="section">
	    <form method="POST" action="src/post_cookie.php">
		<div>
		    <h3>Form for cookie creation:</h3>
		    <label for="name">Name</label>
		    <br>
		    <input name="name">
		</div>
		<button type="submit" name="send" value="send">
		    Send
		</button>
	    </form>
	    <?php
	    include 'src/post_cookie.php';
	    ?>
	</div>
	<br>
	<div class="section">
	    <form method="POST" action="src/post_session.php">
		<div>
		    <h3>Form for session creation:</h3>
		    <label for="surname">Surname</label>
		    <br>
		    <input name="surname">
		</div>
		<button type="submit" name="send2" value="send2">
		    Send
		</button>
	    </form>
	    <?php
	    include 'src/post_session.php';
	    ?>
	</div>
    </body>
</html>
