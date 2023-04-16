<?php 
    include_once('index.php');
    if($votoBaiao > $votoFeijoada && $votoBaiao > $votoMoqueca){
        echo "Baião é o prato vencedor com $votoBaiao de votos";
    }else if($votoFeijoada > $votoBaiao && $votoFeijoada > $votoMoqueca){
        echo "Feijoada é o prato vencedor com $votoFeijoada de votos";
    }else if($votoMoqueca > $votoFeijoada && $votoMoqueca > $votoBaiao){
        echo "Moqueca é o prato vencedor com $votoMoqueca de votos";
    }
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Votação</title>
    <link rel="stylesheet" href="assets/styles/reset.css">
    <link rel="stylesheet" href="assets/styles/style.css">
    <script src="exibirTexto.js"></script>
</head>
<body>
    <main class="main">
    <h1 class="main__titulo">Melhores Pratos Brasileiros</h1>
        <div class="cards">
            <div class="card">
                <img src="assets/img/feijoada.png" alt="Feijoada" class="card__imagem">
                <h1 class="card__titulo">Feijoada</h1>
                <p class="card__descricao">Feijoada é um prato brasileiro que consiste em um ensopado de feijão preto com carnes variadas, acompanhado por arroz, farofa, couve e laranja. É uma refeição saborosa e completa, bastante popular no Brasil e em outros países.</p>
                <a href="index.php?id=1" class="card__link">Vote</a>
            </div>
            <div class="card card__moqueca">
                <img src="assets/img/moqueca.jpg" alt="Moqueca" class="card__imagem">
                <h1 class="card__titulo">Moqueca</h1>
                <p class="card__descricao">Moqueca é um prato típico da culinária brasileira, originário do estado da Bahia, que consiste em um ensopado de peixe ou frutos do mar cozido com tomates, cebola, pimentão, leite de coco e dendê. É servido com arroz e pirão, uma mistura de farinha e caldo do cozimento.</p>
            <a href="index.php?id=2" class="card__link" >Vote</a>
            </div>
            <div class="card card__baiao">
                <img src="assets/img/baiao de dois.jpg" alt="Baião de Dois" class="card__imagem">
                <h1 class="card__titulo">Baião de Dois</h1>
                <p class="card__descricao">Baião de dois é um prato típico da culinária nordestina brasileira, que consiste em um refogado de arroz e feijão-de-corda, cozido com diversos ingredientes, como carne seca, linguiça, bacon, cebola, alho, coentro e pimenta. É uma refeição completa e muito saborosa, geralmente acompanhada por farofa, vinagrete e salada.</p>
                <a href="index.php?id=3" class="card__link" >Vote</a>
            </div>
        </div>
        <div class="enviar">
            <a href="" class="enviar__botao">Terminar Votação</a>
        </div>
    </main>
</body>
</html>