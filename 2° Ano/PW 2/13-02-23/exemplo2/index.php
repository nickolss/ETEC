<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo 2</title>
</head>
<body>
    <?php
         // Declarando variáveis
         $var1 = 1;   // inteiro
         $varX = 9.50; // ponto flutuante
         $varY = 9.50; // ponto flutuante
         $var2 = $varX + $varY; //recebendo o resultado de uma expressão
         $varSTR = "Atribui String";  // variável texto –string
         $varletra = "a";  // variável caracter
         $varbool = true; // atribuição lógica


         echo "Exemplo de uma aplicação em PHP";               print "<P>";
         echo "Conteúdo de var1: ";
         echo $var1;

         print "<P>";
         echo "Conteúdo de varX: ";
         echo $varX;

         print "<P>";
         echo "Conteúdo de varY: ";
         echo $varY;

         print "<P>";
         echo "Conteúdo de var2: ";
         echo $var2;

         print "<P>";
         echo "Conteúdo de varSTR: ";
         echo $varSTR;

         print "<P>";
         echo "Conteúdo de varletra: ";
         echo $varletra;
         
         print "<P>";
         echo "Conteúdo de varbool: ";
         echo $varbool;
    ?>
</body>
</html>