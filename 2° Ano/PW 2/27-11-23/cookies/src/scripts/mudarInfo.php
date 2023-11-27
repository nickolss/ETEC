<?php
if (!empty($_POST)) {
	$user = $_POST['username'];
	$senha = $_POST['pass'];

	setcookie("user", $user, time() + 3600, "/");
	setcookie("senha", $senha, time() + 3600, "/");

	header("Location: ../../perfil.php");
}
