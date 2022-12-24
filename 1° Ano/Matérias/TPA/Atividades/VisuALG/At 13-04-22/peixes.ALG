Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/04/2022
Var
// Seção de Declarações das variáveis 
mult, quiloP, quilomult: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva ("Quantos quilos você pescou:")
leia (quiloP)

se (quiloP>=50) entao
   quilomult<-quiloP-50
   mult<-quilomult*4
   escreva ("O valor da multa é de" , mult)
   
senao

     escreva ("Você não excedeu a quantidade de peixes")

     
     
fimse

Fimalgoritmo