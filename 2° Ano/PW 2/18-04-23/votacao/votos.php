<?php 

    $votoFeijoada = 0;
    $votoBaiao = 0;
    $votoMoqueca = 0;

    function confirmarVoto(){
        echo "<p>Voto realizado com sucesso!</p>";
    }

    if(isset($_GET['id']) == 1){
        $votoFeijoada++;
        confirmarVoto();
    }else if(isset($_GET['id']) == 2){
        $votoMoqueca++;
        confirmarVoto();
    }else if(isset($_GET['id']) == 3){
        $votoBaiao++;
        confirmarVoto();
    }
?>