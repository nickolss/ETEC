Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Se??o de Declara??es das vari?veis 
anoat, anonasc, ida, ida2050, cont: inteiro
Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
anoat<-2022

escreval ("Calcular a idade de 10 pessoas em 2050")

para cont de 1 ate 10 passo 1 faca
     escreva ("Doigite o ano em que voc? nasceu: ")
     leia (anonasc)
     
     ida<-anoat-anonasc
     ida2050<- 2050-anonasc
     
     escreval ("Sua idade ? " ,ida)
     escreval ("Sua idade em 2050 ? " ,ida2050)
     
     
     
fimpara

Fimalgoritmo