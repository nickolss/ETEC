Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Se??o de Declara??es das vari?veis 
cont,num,resp:inteiro

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
cont<-0
escreva ("Informe um n?mero para o c?lculo da tabuada:")
leia (num)

repita
      resp<-cont*num
      escreval (cont, "*" ,num, "=" ,resp)
      cont<-cont+1
ate cont>10


Fimalgoritmo