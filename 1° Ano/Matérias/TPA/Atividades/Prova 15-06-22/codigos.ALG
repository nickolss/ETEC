Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
   // Se??o de Declara??es das vari?veis
   n: inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva ("Digite o c?digo do produto desejado: ")
   leia (n)

   escolha (n)
           caso 1
                escreva ("Alimento N?o Perec?vel")
                
           caso 2,3,4
                escreva ("Alimento Perec?vel")
                
           caso 5,6
                escreva ("Vestu?rio")
                
           caso 7,8,9,10,11,12
                escreva ("Limpeza")
                
           outrocaso
                    escreva ("Op??o Inv?lida")

   fimescolha


Fimalgoritmo