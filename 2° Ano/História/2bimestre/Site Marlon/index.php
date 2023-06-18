<?php
if ($_SERVER['HTTP_REFERER'] == 'http://localhost/Site%20Marlon/cadastrar.html' || $_SERVER['HTTP_REFERER'] == 'http://localhost/Site%20Marlon/verificarLogin.php') {
	echo "<script>alert('Usuário já logado, saia da conta para cadastrar outra')</script>";
}
?>

<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Home</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous" />

	<link rel="stylesheet" href="assets/css/cabecalho.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</head>

<body class="bg-dark text-white">
	<nav class="navbar navbar-dark bg-dark fixed-top cabecalho-mobile">
		<div class="container-fluid">
			<img src="assets/img/logo.png" alt="" sizes="" srcset="">
			<button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
				<div class="offcanvas-header">
					<h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Projeto Planeja</h5>
					<button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
				</div>
				<div class="offcanvas-body">
					<ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
						<li class="nav-item">
							<a class="nav-link active" aria-current="page" href="index.php">Home</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="cadastrar.html">Inscrever-se</a>
						</li>
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="motivacao.html">Motivação do Trabalho</a>
						</li>
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
								Créditos
							</a>
							<ul class="dropdown-menu dropdown-menu-dark">
								<li><a class="dropdown-item" href="desenvolvedor.html">Desenvolvedor</a></li>
							</ul>
						</li>

						<button class="btn bg-black text-white my-2">
							<a href="login.html" class="text-white text-decoration-none">
								<li class="nav-item">Login</li>
							</a>
						</button>

						<button class="btn bg-black text-white my-2">
							<a href="perfil.php" class="text-white text-decoration-none">
								<li class="nav-item">Meu Perfil</li>
							</a>
						</button>
					</ul>
				</div>
			</div>
		</div>
	</nav>



	<header class="cabecalho-desktop">
		<img src="assets/img/logo.png" alt="Logo do Projeto Planejar" />
		<nav class="menu">
			<ul class="menu__lista">
				<a href="index.php" class="menu__link">
					<li class="menu__item">Home</li>
				</a>

				<a href="cadastrar.html" class="menu__link">
					<li class="menu__item">Inscreva-se</li>
				</a>

				<a href="motivacao.html" class="menu__link">
					<li class="menu__item">Motivação do Trabalho</li>
				</a>

				<a href="desenvolvedor.html" class="menu__link">
					<li class="menu__item">Desenvolvedor</li>
				</a>

				<a href="login.html" class="menu__link">
					<li class="menu__item">Login</li>
				</a>

				<a href="perfil.php" class="menu__link">
					<span class="material-symbols-outlined">
						account_circle
					</span>
				</a>
			</ul>
		</nav>
	</header>

	<main class="container text-white mt-5">
		<section class="descricao row">
			<div class="col">
				<h2 class="descricao__titulo">
					Veja se entraria na sua faculdade dos sonhos?
				</h2>
				<p class="descricao__texto">
					Descubra suas chances de ingressar na faculdade e no curso dos seus
					sonhos com nossa plataforma de verificação! Nosso teste exclusivo
					avalia suas características atuais e calcula a probabilidade de você
					ser admitido, mostrando o quão próximo você está de alcançar seu
					objetivo acadêmico. Não deixe de conferir!
				</p>
				<p class="descricao__texto">
					Esse teste foi feito pelo professor Marlon Marques da Silva para a
					turma de 2DS AMS tarde da Etec Zona Leste com o objetivo de
					direcionar os alunos e agora disponibilizado por Nickolas Maia de
					Araujo você também poderá realizar o teste.
				</p>
			</div>
		</section>
		<section class="formula row">
			<div class="col">
				<h2 class="formula__titulo">Essa será a formula usada</h2>
				<code class="formula__codigo"><abbr title="Tamanho da Chance">TC</abbr> = (<abbr title="Resiliência">R</abbr>
					+ <abbr title="Inteligência">I</abbr> = X) _ (<abbr title="Curso Desejado">C</abbr>
					+ <abbr title="Instituição desejada">I</abbr> = Y) != X/Y</code>
			</div>
			<div class="definicao-formula row">
				<div class="col">
					<h2 class="definicao-formula__titulo py-2">
						Explicação das Siglas
					</h2>
					<p class="definicao-formula__sigla">TC = Tamanho da Chance</p>
					<p class="definicao-formula__sigla">R = Sua resiliência</p>
					<p class="definicao-formula__sigla">I = Sua Inteligência</p>
					<p class="definicao-formula__sigla">C = O curso desejado</p>
					<p class="definicao-formula__sigla">I = A instituição desejada</p>
				</div>
			</div>
		</section>

		<section class="cta">
			<h2 class="cta__titulo">Se junte a nós</h2>
			<p class="cta__texto">
				Quer descobrir suas chances de entrar na faculdade e no curso dos seus
				sonhos? Crie uma conta agora mesmo em nosso site e tenha acesso ao
				teste exclusivo que irá avaliar suas chances de admissão! Não perca
				tempo, inscreva-se e comece a traçar seu caminho para o sucesso
				acadêmico hoje mesmo!
			</p>

			<div class="d-flex justify-content-center">
				<a href="cadastrar.html">
					<buttton class="btn bg-black text-white">Descubra suas chances de ingresso!</buttton>
				</a>
			</div>
		</section>
	</main>

	<footer class="rodape row text-center py-4">
		<div class="col">
			<p class="rodape__creditos">
				Site desenvolvido por
				<a href="https://github.com/nickolss" target="_blank">Nickolas Maia de Araujo</a>
			</p>
		</div>
	</footer>
</body>

</html>