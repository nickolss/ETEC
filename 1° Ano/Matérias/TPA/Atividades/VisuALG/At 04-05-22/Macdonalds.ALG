Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/05/2022
Var
// Seção de Declarações das variáveis 
lanche: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval ("*****************")
escreval("Pedidos MacDonalds")
escreval ("*****************")
escreval ("")

escreval ("Lanches")
escreval ("1-BigMac")
escreval ("2-Quarteirão")
escreval ("3-MacChicken")
escreval ("4-Cheddar Macmelt")
escreval ("5-MacMax")
escreval ("")
escreva ("Digite um número de 1 à 5:")
leia (lanche)

escolha (lanche)
caso 1
     escreva ("Seu lanche é um BigMac")
caso 2
     escreva ("Seu lanche é um Quarteirão")
caso 3
     escreva ("Seu lanche é um MacChicken")
caso 4
     escreva ("Seu lanche é um Cheddar MacMelt")
caso 5
     escreva ("Seu lanche é um MacMax")
outrocaso
         escreva ("OPção inválida")
fimescolha
Fimalgoritmo