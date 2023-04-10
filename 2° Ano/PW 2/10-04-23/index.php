<?php 
    if(isset($_POST['nome']) && $_POST['nome'] != ""){
        $arquivo = fopen("nomes.txt" , "a");
        fwrite($arquivo, "Nome: " . $_POST['nome'] . "\n");
        fclose($arquivo);
    }else{
        echo "Digite algum nome";
    }
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulário</title>
</head>
<body style="background-color: 
<?php  if(isset($_POST['nome'])){ echo "#ccc"; }else{echo "red";}?>"


<?php 
?>
>
    <form action="" method="POST" name="form">
        Nome: <input type="text" name="nome" id="nome"> <br>
        <input type="submit" value="Cadastrar" id="cadastrar">
    </form>
</body>
</html>