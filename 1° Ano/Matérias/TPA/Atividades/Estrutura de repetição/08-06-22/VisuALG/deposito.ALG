Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Seção de Declarações das variáveis 
mes, depo:inteiro
juros, depfinal:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
mes<-1
depo<-500
juros<-(500*1)/100

para mes de 1 ate 3 passo 1 faca
     depfinal<-depo+(mes*juros)
     mes<-mes+1
fimpara

escreval ("O valor no final de três meses é de" ,depfinal)

Fimalgoritmo