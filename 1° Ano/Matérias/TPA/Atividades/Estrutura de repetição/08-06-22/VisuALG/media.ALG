Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Se??o de Declara??es das vari?veis 
n1, n2, n3, n4, media: real
nome:caracter
alunos:inteiro

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
para aluno de 1 ate 7 passo 1 faca
     escreva ("Digite seu nome:")
     leia (nome)
     escreva ("Digite a primeira nota: ")
     leia (n1)
     escreva ("Digite a segunda nota: ")
     leia (n2)
     escreva ("Digite a terceira nota: ")
     leia (n3)
     escreva ("Digite a quarta nota: ")
     leia (n4)
     media<-(n1+n2+n3+n4)/4
     escreva (nome, " sua m?dia ? " ,media)
fimpara


Fimalgoritmo