Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Se??o de Declara??es das vari?veis 
anoat, anonasc, ida, ida2050: inteiro
resp: caracter
Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
escreva ("Deseja executar o programa? [S/N]")
leia (resp)

anoat<-2022

enquanto (resp="S")faca
         escreva ("Digite seu ano de nascimento: ")
         leia (anonasc)
         ida<-anoat-anonasc
         ida2050<-2050-anonasc
         escreval ("Sua idade ? " ,ida)
         escreval ("Sua idade em 2050 ? de " ,ida2050)
         
         escreva ("Deseja continuar? [S/N]")
         leia (resp)

fimenquanto

Fimalgoritmo