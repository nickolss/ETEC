<?php
if (isset($_POST)) {

	$user = $_POST['username'] ?? "";
	$senha = $_POST['pass'] ?? "";

	if (!isset($_COOKIE['user'])) {
		setcookie("user", $user, time() + 3600, "/");
		setcookie("senha", $senha, time() + 3600, "/");
	}

    header("Location: ../../perfil.php");
}
?>
