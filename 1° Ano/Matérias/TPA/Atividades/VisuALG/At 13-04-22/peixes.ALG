Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor    : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/04/2022
Var
// Se??o de Declara??es das vari?veis 
mult, quiloP, quilomult: inteiro

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
escreva ("Quantos quilos voc? pescou:")
leia (quiloP)

se (quiloP>=50) entao
   quilomult<-quiloP-50
   mult<-quilomult*4
   escreva ("O valor da multa ? de" , mult)
   
senao

     escreva ("Voc? n?o excedeu a quantidade de peixes")

     
     
fimse

Fimalgoritmo