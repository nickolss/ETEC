Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Se??o de Declara??es das vari?veis 
mes, depo:inteiro
juros, depfinal:real

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
mes<-1
depo<-500
juros<-(500*1)/100

para mes de 1 ate 3 passo 1 faca
     depfinal<-depo+(mes*juros)
     mes<-mes+1
fimpara

escreval ("O valor no final de tr?s meses ? de" ,depfinal)

Fimalgoritmo