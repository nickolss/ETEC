<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
    <title>Projeto Web</title>
</head>

<body class="bg-secondary-subtle">
    <div class="container rounded-2">
        <div class="row secondary">
            <div class="col">
                <nav class="navbar navbar-expand-lg bg-primary">
                    <div class="container-fluid">
                        <a class="navbar-brand text-white" href="#">Sistema Web</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                            <div class="navbar-nav">
                                <a class="nav-link active" aria-current="page" href="#">Cadastrar</a>
                                <a class="nav-link" href="consulta.php">Consulta</a>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
        </div>

        <div class="row mx-0 bg-white">
            <div class="col text-start">
                <form name="cadastro" method="POST" action="resposta.php">
                    <div class="mb-3">
                        <label for="nome" class="form-label">Nome:</label>
                        <input type="nome" class="form-control" id="nome" name='nome' placeholder="Digite o seu nome completo.">
                    </div>
                    <div class="mb-3">
                        <label for="telefone" class="form-label">Telefone:</label>
                        <input type="telefone" class="form-control" id="telefone" name='telefone' placeholder="(XX)XXXXX-XXXX">
                    </div>
                    <div class="mb-3">
                        <label for="origem" class="form-label">Origem:</label>
                        <select class="form-select" aria-label="Selecione a origem do dispositivo." name='origem'>
                            <option selected value="celular">Celular</option>
                            <option value="fixo">Fixo</option>
                            <option value="whatsapp">Whatsapp</option>
                            <option value="facebook">Facebook</option>
                            <option value="instagram">Instagram</option>
                            <option value="googleMeuNegocio">Google Meu Negócio</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="dataContato" class="form-label">Data do Contato:</label>
                        <input type="nome" class="form-control" id="dataContato" name='dataContato' placeholder="Digite o seu nome completo">
                    </div>
                    <div class="mb-3">
                        <label for="observacao" class="form-label">Observação:</label>
                        <textarea class="form-control" id="observacao" rows="3" name='observacao'></textarea>
                    </div>
                    <div class="mb-3">
                        <button type="submit" class="btn btn-primary">Cadastrar</button>
                    </div>
                </form>
            </div>
        </div>

        <div class="row">
            <div class="col">

            </div>
        </div>
    </div>
</body>

</html>