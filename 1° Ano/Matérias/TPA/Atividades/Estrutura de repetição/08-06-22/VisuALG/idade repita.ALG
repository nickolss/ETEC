Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Se??o de Declara??es das vari?veis 
anoat, anonasc, ida, ada2050: inteiro
resp: caracter

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
anoat<-2022

repita
      escreva ("Digite o ano em que voc? nasceu: ")
      leia (anonasc)
      ida<-anoat-anonasc
      ida2050<-2050-anonasc
      escreval ("Sua idade ? " ,ida)
      escreval ("Sua idade em 2050 ? " ,ida2050)
      
      escreva ("Deseja calcular novamente? [S/N]")
      leia (resp)

ate (resp="N")
Fimalgoritmo