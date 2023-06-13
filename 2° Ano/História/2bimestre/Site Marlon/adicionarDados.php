<?php
require_once('conexao.php');

$resiliencia = $_POST['resiliencia'];
$inteligencia = $_POST['inteligencia'];
$curso = $_POST['curso'];
$faculdade = $_POST['faculdade'];
$dataCadastro = date('Y-m-d');

$sql = "INSERT INTO `estudante`(`resiliencia` , `inteligencia` , `curso` , `faculdade` , `dataCadastro`) VALUES('$resiliencia' , '$inteligencia' , '$curso' , '$faculdade' , '$dataCadastro')";

$cadastrarDados = $pdo->prepare($sql);

if($cadastrarDados->execute()){
    header("Location: resultado.html");
}