<?php

$user = $_POST['username'];
$senha = $_POST['pass'];

if (!isset($_COOKIE['user'])) {
    setcookie("user", $user, time() + 3600, "/");
    setcookie("senha", $senha, time() + 3600, "/");
}

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<title>Sign Up</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<link rel="icon" type="image/png" href="src/images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="src/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="src/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="src/fonts/iconic/css/material-design-iconic-font.min.css">
	<link rel="stylesheet" type="text/css" href="src/vendor/animate/animate.css">

	<link rel="stylesheet" type="text/css" href="src/vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="src/vendor/animsition/css/animsition.min.css">
	<link rel="stylesheet" type="text/css" href="src/vendor/select2/select2.min.css">

	<link rel="stylesheet" type="text/css" href="src/vendor/daterangepicker/daterangepicker.css">
	<link rel="stylesheet" type="text/css" href="src/css/util.css">
	<link rel="stylesheet" type="text/css" href="src/css/main.css">
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('src/images/bg-01.jpg');">
			<div class="wrap-login100">
				<form class="login100-form validate-form" method="POST">
					<span class="login100-form-logo">
						<i class="zmdi zmdi-landscape"></i>
					</span>

					<span class="login100-form-title p-b-34 p-t-27">
						Registre-se
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Enter username">
						<input class="input100" type="text" name="username" placeholder="Usuário">
						<span class="focus-input100" data-placeholder="&#xf207;"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Enter password">
						<input class="input100" type="password" name="pass" placeholder="Senha">
						<span class="focus-input100" data-placeholder="&#xf191;"></span>
					</div>

					<div class="contact100-form-checkbox">
						<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
						<label class="label-checkbox100" for="ckb1">
							Lembre-se de mim
						</label>
					</div>

					<div class="container-login100-form-btn">
						<button class="login100-form-btn">
							Registrar
						</button>
					</div>

					<div class="text-center p-t-90">
						<a class="txt1" href="index.php">
							Já tem conta? Entre
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
	

	<div id="dropDownSelect1"></div>
	
<!--===============================================================================================-->
	<script src="src/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="src/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="src/vendor/bootstrap/js/popper.js"></script>
	<script src="src/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="src/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="src/vendor/daterangepicker/moment.min.js"></script>
	<script src="src/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="src/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="src/js/main.js"></script>

</body>
</html>