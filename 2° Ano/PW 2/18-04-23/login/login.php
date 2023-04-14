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
        <form>
            <div class="login">
                <h2 class="login__titulo">Login</h2>
                <input type="email" name="emailLogin" id="emailLogin" placeholder="Email" class="login__input" required>
                <input type="password" name="senhaLogin" id="senhaLogin" placeholder="Senha" class="login__input" required>
                <div class="informacoes-extras">
                    <label for="remember" class="login__lembre">Lembre-se de  mim<input type="checkbox" name="remember" id="remember"></label>
                    <a href="index.php" class="login__link">Fazer Cadastro</a>
                </div>
                <input type="submit" value="Login" class="login__submit">
            </div>
        </form>
    </main>
</body>
</html>