<?php
require_once('conexao.php');

$email = $_POST['email'];
$senha = $_POST['senha'];

$sqlConsulta = "SELECT * FROM `estudante` WHERE email='$email' AND senha='$senha'";

$realizarConsulta = $pdo->query($sqlConsulta);

$registros = $realizarConsulta->fetchAll();


if (isset($_SESSION['id'])) {
    header("Location: index.php");
} else {
    if (sizeof($registros) == 1) {
        if (!isset($_SESSION)) {
            session_start();
        }

        $_SESSION['id'] = $registros[0]['id'];
        $_SESSION['user'] = $registros[0]['nome'];
        header("Location: perfil.php");
    } else {
        header("Location: falha.html");
    }
}
