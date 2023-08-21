
<?php
//Conexão usando PDO

    define('MYSQL_HOST' , 'localhost');
    define('MYSQL_USER' , 'root');
    define('MYSQL_PASSWORD' , '');
    define('MYSQL_DB_NAME' , 'projetoWeb');

    try {
        $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD);
    } catch (PDOException $error) {
        echo $error->getMessage();
    }
    

//Conexão usando Mysqli
// define('SERVIDOR', 'localhost');
// define('USUARIO', 'root');
// define('SENHA', '');
// define('BANCO', 'projetoWeb');

// class Conexao
// {
//     protected $mysqli;

//     public function __contruct()
//     {
//         try {
//             $this->conexaoMysqli();
//         } catch (Exception $th) {
//             echo "Erro na conexão -> " . $th->getMessage();
//         }
//     }

//     public function conexaoMysqli()
//     {
//         $this->mysqli = new mysqli(SERVIDOR, USUARIO, SENHA, BANCO);
//     }

//     public function setAgendamento($nome, $telefone, $origem, $dataContato, $observacao)
//     {
//         $stmt = $this->mysqli->prepare("INSERT INTO agendamentos('nome' , 'telefone' , 'origem' , 'dataContato' , 'observacao') VALUES(?,?,?,?,?)");

//         $stmt->bind_param("SSSSS", $nome, $telefone, $origem, $dataContato, $observacao);
//         $stmt->execute();
//     }
// }
?>