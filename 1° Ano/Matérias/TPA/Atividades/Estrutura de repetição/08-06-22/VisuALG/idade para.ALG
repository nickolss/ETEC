Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Seção de Declarações das variáveis 
anoat, anonasc, ida, ida2050, cont: inteiro
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
anoat<-2022

escreval ("Calcular a idade de 10 pessoas em 2050")

para cont de 1 ate 10 passo 1 faca
     escreva ("Doigite o ano em que você nasceu: ")
     leia (anonasc)
     
     ida<-anoat-anonasc
     ida2050<- 2050-anonasc
     
     escreval ("Sua idade é " ,ida)
     escreval ("Sua idade em 2050 é " ,ida2050)
     
     
     
fimpara

Fimalgoritmo