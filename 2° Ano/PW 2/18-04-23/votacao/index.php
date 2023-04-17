<?php 
    if(isset($_POST['feijoada'])){
        $arquivo = fopen("dados.txt" , "a");
        fwrite($arquivo , $_POST['feijoada'] . "\n");
        fclose($arquivo);
    }else if(isset($_POST['moqueca'])){
        $arquivo = fopen("dados.txt" , "a");
        fwrite($arquivo , $_POST['moqueca'] . "\n");
        fclose($arquivo);
    }else if(isset($_POST['baiao'])){
        $arquivo = fopen("dados.txt" , "a");
        fwrite($arquivo , $_POST['baiao'] . "\n");
        fclose($arquivo);
    }

    function calcularVotos(){
        $arquivo = "dados.txt";
        $arq = fopen($arquivo , "r");
        $votosTotais = fread($arq , filesize($arquivo));

        $votoFeijoada = 0;
        $votoMoqueca = 0;
        $votoBaiao = 0;

        $votoFeijoada = substr_count($votosTotais , "Feijoada");
        $votoMoqueca = substr_count($votosTotais , "Moqueca");
        $votoBaiao = substr_count($votosTotais , "Baião");

        if($votoFeijoada > $votoBaiao && $votoFeijoada > $votoMoqueca){
            echo "<div style='display: flex; justify-content: center;'>";
            echo "<p style='color: #A55C25; font-size: 1.2rem;'>O vencedor foi Feijoada com $votoFeijoada votos</p>";
            echo "</div>";
        }else if($votoBaiao > $votoFeijoada && $votoBaiao > $votoMoqueca){
            echo "<div style='display: flex; justify-content: center;'>";
            echo "<p style='color: #A55C25; font-size: 1.2rem;'>O vencedor foi Baião de Dois com $votoBaiao votos</p>";
            echo "</div>";
        }else if($votoMoqueca > $votoFeijoada && $votoMoqueca > $votoBaiao){
            echo "<div style='display: flex; justify-content: center;'>";
            echo "<p style='color: #A55C25; font-size: 1.2rem;'>O vencedor foi Moqueca com $votoMoqueca votos</p>";
            echo "</div>";
        }
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
            <form action="" method="POST" class="formulario">
                <div class="card">
                    <img src="assets/img/feijoada.png" alt="Feijoada" class="card__imagem">
                    <h1 class="card__titulo">Feijoada</h1>
                    <p class="card__descricao">Feijoada é um prato brasileiro que consiste em um ensopado de feijão preto com carnes variadas, acompanhado por arroz, farofa, couve e laranja. É uma refeição saborosa e completa, bastante popular no Brasil e em outros países.</p>
                    <label for=""><input type="submit" value="Feijoada" class="card__link" name="feijoada"></label>
                </div>
            </form>
            <form action="" method="POST">
                <div class="card card__baiao">
                    <img src="assets/img/baiao de dois.jpg" alt="Baião de Dois" class="card__imagem">
                    <h1 class="card__titulo">Baião de Dois</h1>
                    <p class="card__descricao">Baião de dois é um prato típico da culinária nordestina brasileira, que consiste em um refogado de arroz e feijão-de-corda, cozido com diversos ingredientes, como carne seca, linguiça, bacon, cebola, alho, coentro e pimenta. É uma refeição completa e muito saborosa, geralmente acompanhada por farofa, vinagrete e salada.</p>
                    <label for=""><input type="submit" class="card__link" name="baiao" value="Baião"></label>
                </div>
            </form>
            <form action="" method="POST">
                <div class="card card__moqueca">
                    <img src="assets/img/moqueca.jpg" alt="Moqueca" class="card__imagem">
                    <h1 class="card__titulo">Moqueca</h1>
                    <p class="card__descricao">Moqueca é um prato típico da culinária brasileira, originário do estado da Bahia, que consiste em um ensopado de peixe ou frutos do mar cozido com tomates, cebola, pimentão, leite de coco e dendê. É servido com arroz e pirão, uma mistura de farinha e caldo do cozimento.</p>
                    <label for=""><input type="submit" value="Moqueca" class="card__link" name="moqueca"></label>
                </div>
            </form>
        </div>
        <form class="enviar" action="resultado.php">
            <input type="submit" value="Terminar Votação" class="enviar__botao">
        </form>
    </main>
</body>
</html>