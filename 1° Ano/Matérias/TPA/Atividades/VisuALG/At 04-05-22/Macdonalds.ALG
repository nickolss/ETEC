Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor    : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/05/2022
Var
// Se??o de Declara??es das vari?veis 
lanche: inteiro

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
escreval ("*****************")
escreval("Pedidos MacDonalds")
escreval ("*****************")
escreval ("")

escreval ("Lanches")
escreval ("1-BigMac")
escreval ("2-Quarteir?o")
escreval ("3-MacChicken")
escreval ("4-Cheddar Macmelt")
escreval ("5-MacMax")
escreval ("")
escreva ("Digite um n?mero de 1 ? 5:")
leia (lanche)

escolha (lanche)
caso 1
     escreva ("Seu lanche ? um BigMac")
caso 2
     escreva ("Seu lanche ? um Quarteir?o")
caso 3
     escreva ("Seu lanche ? um MacChicken")
caso 4
     escreva ("Seu lanche ? um Cheddar MacMelt")
caso 5
     escreva ("Seu lanche ? um MacMax")
outrocaso
         escreva ("OP??o inv?lida")
fimescolha
Fimalgoritmo