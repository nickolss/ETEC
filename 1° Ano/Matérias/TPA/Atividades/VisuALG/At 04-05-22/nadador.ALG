Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor    : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/05/2022
Var
// Se??o de Declara??es das vari?veis 
idade: inteiro

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 

escreva ("Escreva a idade do Nadador para entrar no campeonato:")
leia (idade)
se (idade>=18) entao
   escreva ("Voc? esta no campeonato Senior")

senao
     se (idade>=14) e (idade<=17)entao
     escreva ("Voc? esta no campeonato Juvenil B")
     fimse
     
     se (idade>=11) e (idade<=13)entao
     escreva ("Voc? esta no campeonato Juvenil A")
     fimse
     
     se (idade>=9) e (idade<=10)entao
     escreva ("Voc? esta no campeonato Infantil B")
     fimse
     
     se (idade>=5) e (idade<=7)entao
     escreva ("Voc? esta no campeonato Infantil A")
fimse
fimse



Fimalgoritmo