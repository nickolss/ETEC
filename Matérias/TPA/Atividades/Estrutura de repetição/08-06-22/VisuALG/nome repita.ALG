Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Seção de Declarações das variáveis 
idade: inteiro
nome, resp: caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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