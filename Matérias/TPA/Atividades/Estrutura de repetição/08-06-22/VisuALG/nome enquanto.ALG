Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Seção de Declarações das variáveis 
idade:inteiro
resp, nome: caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva ("Deseja realizar o teste? [S/N]")
leia (resp)

enquanto (resp="S") faca
         limpatela
         escreval ("Informe o nome: ")
         leia (nome)
         escreval ("Informe a idade: ")
         leia (idade)
         escreval (nome, " tem " ,idade, " anos.")

         escreva ("Deseja continuar [S/N]")
         leia (resp)
fimenquanto

Fimalgoritmo