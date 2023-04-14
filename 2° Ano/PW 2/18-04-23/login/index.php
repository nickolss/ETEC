<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign up</title>
    <link rel="stylesheet" href="assets/styles/reset.css">
    <link rel="stylesheet" href="assets/styles/style.css">
</head>
<body>
    <main class="main">
        <div class="formulario">
            <div class="formulario__imagem">
                <img src="assets/img/computer.png" alt="" class="imagem">
            </div>

            <form class="formulario__perguntas" action="processa-dados.php" method="POST">
                <legend class="perguntas__titulo">Cadastro</legend>
                <input type="email" name="email" id="email" placeholder="Email" class="perguntas__input" required>
                <input type="password" name="senha" id="senha" placeholder="Senha" class="perguntas__input" required>
                <input type="submit" value="Cadastrar" class="perguntas__submit">
                <a href="login.php" class="formulario__login">Já é cadastrado?</a>
            </form>
        </div>
    </main>
</body>
</html>