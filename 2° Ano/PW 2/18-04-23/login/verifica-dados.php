<?php 
    function verificaDados($emailLogin, $senhaLogin){
        $arquivo = 'registro.txt'; //Caminho do arquivo txt
        if(file_exists($arquivo)){
            $arq = fopen($arquivo , 'r');

            $texto = fread($arq , filesize($arquivo));

            if(isset($emailLogin) && isset($senhaLogin)){
                if(str_contains($texto , $emailLogin) && str_contains($texto , $senhaLogin)){
                    echo "<p class='login__resposta'>Bem vindo/a ao site</p>";    
                }else{
                    echo "Registro não encontrado";
                }
            }else{
                echo "Não conseguimos receber sua senha e/ou email cadastrado";
            }
        }else{
            echo "Nenhum registro foi encontrado no sistema";
        }
    }
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign in</title>
    <link rel="stylesheet" href="assets/styles/reset.css">
    <link rel="stylesheet" href="assets/styles/style.css">
</head>
<body>
    <main class="main">
        <form action="verifica-dados.php" method="POST">
            <div class="login">
                <h2 class="login__titulo">Login</h2>
                <input type="email" name="emailLogin" id="emailLogin" placeholder="Email" class="login__input" required>
                <input type="password" name="senhaLogin" id="senhaLogin" placeholder="Senha" class="login__input" required>
                <div class="informacoes-extras">
                    <label for="remember" class="login__lembre">Lembre-se de  mim<input type="checkbox" name="remember" id="remember"></label>
                    <a href="index.php" class="login__link">Fazer Cadastro</a>
                </div>
                <?php 
                    require_once('verifica-dados.php');
                    $emailLogin = $_POST['emailLogin'];
                    $senhaLogin = $_POST['senhaLogin'];
                    verificaDados($emailLogin, $senhaLogin)
                ?>
            </div>
        </form>
    </main>
</body>
</html>