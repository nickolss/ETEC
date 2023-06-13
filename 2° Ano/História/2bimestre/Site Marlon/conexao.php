<?php 
    define("MYSQL_HOST" , 'localhost');
    define('MYSQL_DB_NAME', 'db_master');
    define("MYSQL_USER" , 'root');
    define("MYSQL_PASSWORD" , '');

    try {
        $pdo = new PDO('mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME . MYSQL_USER . MYSQL_PASSWORD);
    } catch (PDOException $th) {
        echo "Erro na conexão : " . $th->getMessage();
    }
?>