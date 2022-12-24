Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
   // Seção de Declarações das variáveis
   n: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o código do produto desejado: ")
   leia (n)

   escolha (n)
           caso 1
                escreva ("Alimento Não Perecível")
                
           caso 2,3,4
                escreva ("Alimento Perecível")
                
           caso 5,6
                escreva ("Vestuário")
                
           caso 7,8,9,10,11,12
                escreva ("Limpeza")
                
           outrocaso
                    escreva ("Opção Inválida")

   fimescolha


Fimalgoritmo