<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body style="background-color: #eff2eb;">
	<h1 style="">Login</h1>

	<div>
		<a href="index.jsp">home </a>
	</div>

	<div>
		<a href="signup.jsp">sign up </a>
	</div>

	<form method="post" action="LoginServlet">

		<div style="background-color: #D4B34A; width: 20em;">
			<div style="margin-bottom: 2em; width: 20em;">
				<input
					style="margin-left: 2em; margin-top: 2em; padding-bottom: 2em; padding-top: 2em; width: 20em;"
					type="text" name="email" placeholder="input email" />
			</div>
			<div style="margin-bottom: 2em;">
				<input
					style="margin-left: 2em; margin-top: 2em; padding-bottom: 2em; padding-top: 2em; width: 20em;"
					type="password" name="password" placeholder="input password" />
			</div>


			<div>
				<input
					style="margin-left: 2em; margin-top: 2em; padding-bottom: 2em; padding-top: 15em; width: 20em;"
					type="submit" name="submit" value="submit" />
			</div>
		</div>

	</form>

</body>
</html>