<?php
require_once('conexao.php');

if (!isset($_SESSION)) {
	session_start();
}

if (!isset($_SESSION['id'])) {
	die("<p>Você precisa fazer login para acessar o perfil</p>");
}


$id = $_SESSION['id'];
$sqlConsulta = "SELECT `resiliencia` , `inteligencia` , `curso` , `faculdade`FROM `estudante` WHERE id=$id";

$realizarConstulta = $pdo->query($sqlConsulta);
$registros = $realizarConstulta->fetchAll();

?>


<!DOCTYPE html>
<html lang="pt-br">

<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Perfil</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous" />

	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	<script type="text/javascript">
		//Carrega a API do google
		google.charts.load('current', {
			'packages': ['corechart']
		});

		//Executa uma função de callback que retorna os gráficos
		google.charts.setOnLoadCallback(drawChartX);
		google.charts.setOnLoadCallback(drawChartY);

		function drawChartX() {
			//É inserido através de PHP os dados dos campos
			let data = google.visualization.arrayToDataTable([
				['Campo', 'Valores'],
				['Resiliência', <?= $registros[0]['resiliencia'] ?>],
				['Inteligência', <?= $registros[0]['inteligencia'] ?>]
			]);

			let options = {
				backgroundColor: 'transparent',

				title: "Suas competências",

				slices: {
					0: {
						color: '#7126dd'
					}
				},

				pieSliceText: 'value',

				titleTextStyle: {
					color: 'white'
				},

				'tooltip.textStyle': {
					color: 'white'
				},

				pieSliceTextStyle: {
					color: 'white',
					fontSize: 16
				},

				chartArea: {
					width: '100%',
					height: '100%',
					left: 10,
					top: 20
				},
				legend: {
					textStyle: {
						color: '#fff',
						fontSize: 12
					}
				},
			};

			//Define onde será inserido o gráfico
			let graficoX = new google.visualization.PieChart(document.getElementById('graficoX'));

			graficoX.draw(data, options);
		}

		function drawChartY() {
			let data = google.visualization.arrayToDataTable([
				['Campo', 'Valores'],
				['Curso', <?= $registros[0]['curso'] ?>],
				['Instituição', <?= $registros[0]['curso'] ?>]
			]);

			let opcoes = {
				backgroundColor: 'transparent',

				title: "Seu objetivo",

				slices: {
					0: {
						color: '#7126dd'
					}
				},

				pieSliceText: 'value',

				titleTextStyle: {
					color: 'white'
				},

				'tooltip.textStyle': {
					color: 'white'
				},

				pieSliceTextStyle: {
					color: 'white',
					fontSize: 16
				},

				chartArea: {
					width: '100%',
					height: '100%',
					left: 10,
					top: 20
				},
				legend: {
					textStyle: {
						color: '#fff',
						fontSize: 12
					}
				},
			};

			let graficoY = new google.visualization.PieChart(document.getElementById('graficoY'));
			graficoY.draw(data, opcoes);
		}
	</script>
</head>

<body class="bg-dark">
	<header class="cabecalho">
		<nav class="navbar navbar-dark bg-dark fixed-top navbar-celular">
			<div class="container-fluid">
				<img src="assets/img/logo.png" alt="Logo do Projeto Planejar" />
				<button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
					<div class="offcanvas-header">
						<h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">
							Projeto Planejar
						</h5>
						<button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
					</div>
					<div class="offcanvas-body">
						<ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
							<li class="nav-item">
								<a class="nav-link" aria-current="page" href="index.php">Home</a>
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
									<li class="nav-item active">Meu Perfil</li>
								</a>
							</button>
						</ul>
					</div>
				</div>
			</div>
		</nav>
	</header>

	<main class="principal pt-5 container">
		<section class="perfil row">
			<div class="col text-white">
				<div class="graficos py-4">
					<div id="graficoX" class="img-fluid"></div>
					<div id="graficoY" class="img-fluid"></div>
				</div>
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

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</body>

</html>