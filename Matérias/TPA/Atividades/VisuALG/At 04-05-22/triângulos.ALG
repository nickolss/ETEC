Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor    : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/05/2022
Var
   // Seção de Declarações das variáveis
   A, B, C:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval ("***************************")
   escreval ("Identificação de triângulos")
   escreval ("***************************")
   escreval ("")

   escreva ("Digite o primeiro valor:")
   leia (A)

   escreva ("Digite o segundo valor:")
   leia (B)

   escreva ("Digite o terceiro valor:")
   leia (C)


   se (A<B+C) ou (B<A+C) ou (C<A+C)entao
      se (A=B)e (B=C) e (A=C)entao
         escreval ("É um triângulo equilátero")
      senao
         se (A<>B)e (B<>C)e (A<>C)entao
            escreval ("É um triângulo escaleno")
         senao
            se (A=B) e (A<>C) ou (A=C) e (A<>B)ou (C=B) e (C<>A)entao
               escreval ("É um triângulo Isósceles")
               fimse
            fimse
         fimse
      fimse


Fimalgoritmo