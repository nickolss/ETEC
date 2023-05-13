<?php 
require_once("pessoa.class.php");

class Teste{
    private $pessoa;

    public function __construct(){
        $pessoa = new Pessoa();

        $pessoa->setNome($_POST['nome']);
        echo "Nome:" . $pessoa->getNome();
        echo "<br>";

        $pessoa->setTelefone($_POST['telefone']);
        echo "Telefone: " . $pessoa->getTelefone();
        echo "<br>";        

        $pessoa->setOrigem($_POST['origem']);
        echo "Origem: " . $pessoa->getOrigem();
        echo "<br>";
        
        $pessoa->setData($_POST['data']);
        echo "Data: " . $pessoa->getData();
        echo "<br>";

        $pessoa->setObservacao($_POST['observacao']);
        echo "Observação: " . $pessoa->getObservacao();
    }
}new Teste();

?>