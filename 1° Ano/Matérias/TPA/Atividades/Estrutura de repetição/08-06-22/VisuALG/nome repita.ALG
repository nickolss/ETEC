Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Se??o de Declara??es das vari?veis 
idade: inteiro
nome, resp: caracter

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
repita
      escreva ("Informe o nome: ")
      leia (nome)
      escreva ("Informe a idade: ")
      leia (idade)
      
      escreval (nome, " tem " ,idade, " anos.")
      
      escreva ("Deseja continuar? [S/N]")
      leia (resp)
ate (resp="N")

Fimalgoritmo