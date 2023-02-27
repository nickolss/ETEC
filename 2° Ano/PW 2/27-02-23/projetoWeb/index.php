<?php 

//Criação de Variável
$a = 0;

$b = 10;

//Sistema de Decisão
if ($b <= 10) {
    echo "O valor da variável é menor ou igual a 10 <br>";
}else{
    echo "O valor da variável é maior que 10";
}


//Laços de Repetição
for ($i=0; $i <= 10 ; $i++) { 
    echo $i;
}

echo "<br>";

$x = 0;

while ($x <= 10) {
    echo $x;    
    $x++;
}

echo "<br>";

$y = 0;
do {
    echo $y;
    $y++;
} while ($y <= 10);

?>