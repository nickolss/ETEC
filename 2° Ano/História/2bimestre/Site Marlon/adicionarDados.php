<?php
require_once('conexao.php');
session_start();

if (isset($_SESSION['id'])) {
    header("Location: index.php");
} else {
    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $senha = $_POST['senha'];
    $resiliencia = (int)$_POST['resiliencia'];
    $inteligencia = (int)$_POST['inteligencia'];
    $curso = (int)$_POST['curso'];
    $faculdade = (int)$_POST['faculdade'];
    $dataCadastro = date('Y-m-d');

    //Verifica se não existe um usuário no BD com o mesmo email
    $sqlConsultaEmail = "SELECT * FROM `estudante` WHERE email='$email'";
    $realizarConsultaEmail = $pdo->query($sqlConsultaEmail);
    $linhas = $realizarConsultaEmail->rowCount();


    if ($linhas >= 1) {
        header("Location: falha.html");
    } else {
        $sqlInserir = "INSERT INTO `estudante`(`nome` , `email` , `senha` ,`resiliencia` , `inteligencia` , `curso` , `faculdade` , `dataCadastro`) VALUES('$nome' , '$email' , '$senha' , '$resiliencia' , '$inteligencia' , '$curso' , '$faculdade' , '$dataCadastro')";

        $cadastrarDados = $pdo->prepare($sqlInserir);

        if ($cadastrarDados->execute()) {
            if (!isset($_SESSION)) {
                session_start();
            }
            $sqlConsulta = "SELECT * FROM `estudante` WHERE email='$email' AND senha='$senha'";
            $realizarConsulta = $pdo->query($sqlConsulta);
            $registros = $realizarConsulta->fetchAll();
            var_dump($registros);
            $_SESSION['id'] = $registros[0]['id'];
            $_SESSION['user'] = $registros[0]['nome'];
            header("Location: perfil.php");
        }
    }
}
