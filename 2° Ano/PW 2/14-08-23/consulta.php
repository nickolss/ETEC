<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consulta</title>
</head>

<body>
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
                            <a class="navbar-brand text-white" href="index.php">Sistema Web</a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                                <div class="navbar-nav">
                                    <a class="nav-link active text-white" aria-current="page" href="index.php">Cadastrar</a>
                                    <a class="nav-link" href="#">Consulta</a>
                                </div>
                            </div>
                        </div>
                    </nav>
                </div>
            </div>

            <div class="row mx-0 bg-white">
                <div class="col">
                    <h2 class="fs-2 py-3">CONSULTA - CLIENTES</h2>
                    <table class="table ">
                        <thead>
                            <tr>
                                <th scope="col">Nome</th>
                                <th scope="col">Telefone</th>
                                <th scope="col">Ação</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Mark</td>
                                <td>11954757510</td>
                                <td>
                                    <button type="button" class="btn btn-primary">Editar</button>
                                    <button type="button" class="btn btn-danger">Excluir</button>
                                </td>
                            </tr>
                            <tr>
                                <td>José</td>
                                <td>11989548575</td>
                                <td>
                                    <button type="button" class="btn btn-primary">Editar</button>
                                    <button type="button" class="btn btn-danger">Excluir</button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>

    </html>
</body>

</html>