<?php
require_once('conexao.php');

$nome = $_POST['nome'];
$email = $_POST['email'];
$senha = $_POST['senha'];
$resiliencia = $_POST['resiliencia'];
$inteligencia = $_POST['inteligencia'];
$curso = $_POST['curso'];
$faculdade = $_POST['faculdade'];
$dataCadastro = date('Y-m-d');

$sql = "INSERT INTO `estudante`(`nome` , 'email' , 'senha' ,`resiliencia` , `inteligencia` , `curso` , `faculdade` , `dataCadastro`) VALUES('$nome' , $email , $senha , '$resiliencia' , '$inteligencia' , '$curso' , '$faculdade' , '$dataCadastro')";

$cadastrarDados = $pdo->prepare($sql);

if($cadastrarDados->execute()){
    header("Location: perfil.html");
}   