Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Seção de Declarações das variáveis 
cont,num,resp:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
cont<-0
escreva ("Informe um número para o cálculo da tabuada:")
leia (num)

repita
      resp<-cont*num
      escreval (cont, "*" ,num, "=" ,resp)
      cont<-cont+1
ate cont>10


Fimalgoritmo