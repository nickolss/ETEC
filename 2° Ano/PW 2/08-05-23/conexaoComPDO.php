<?php 
    define('MYSQL_HOST' , 'localhost:3306');
    define('MYSQL_USER' , 'root');
    define('MYSQL_PASSWORD' , '');
    define('MYSQL_DB_NAME' , 'bd_sistema');

    //Define é uma constante de ambiente 
    try {
        $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD); //Para criar um PDO é mysql:host'(NOME_HOST no caso localhost)';dbname='(NOME_BANCO_DADOS)' , $username, $senha
    } catch (PDOException $ex) {
        echo "Erro ao tentar fazer a conexão com MYSQL: " . e->getMessage() ;
    }
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PDO</title>
</head>
<body>
    <?php 
        $sql = "SELECT * FROM clientes where";
        $result = $pdo->query($sql);
        $rows = $result->fetchAll();

        for($i=0 ; $i < count($rows); $i++){
            echo "Nome: " . $rows[$i]['nome'] . "<br>";
            echo "Endereço: " . $rows[$i]['endereco'] . "<br>";
            echo "Bairro: " . $rows[$i]['bairro'] . "<br>";
            echo "Cep: " . $rows[$i]['cep'] . "<br>";
            echo "Cidade: " . $rows[$i]['cidade'] . "<br>";
            echo "Estado: " . $rows[$i]['estado'];
        }
    ?>
</body>
</html>