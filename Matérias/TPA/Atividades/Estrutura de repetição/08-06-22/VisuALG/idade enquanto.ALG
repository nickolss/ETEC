Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Seção de Declarações das variáveis 
anoat, anonasc, ida, ida2050: inteiro
resp: caracter
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva ("Deseja executar o programa? [S/N]")
leia (resp)

anoat<-2022

enquanto (resp="S")faca
         escreva ("Digite seu ano de nascimento: ")
         leia (anonasc)
         ida<-anoat-anonasc
         ida2050<-2050-anonasc
         escreval ("Sua idade é " ,ida)
         escreval ("Sua idade em 2050 é de " ,ida2050)
         
         escreva ("Deseja continuar? [S/N]")
         leia (resp)

fimenquanto

Fimalgoritmo