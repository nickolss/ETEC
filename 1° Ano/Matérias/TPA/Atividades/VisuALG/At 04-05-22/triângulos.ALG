Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor    : Antonio Carlos Nicolodi
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/05/2022
Var
   // Se??o de Declara??es das vari?veis
   A, B, C:inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreval ("***************************")
   escreval ("Identifica??o de tri?ngulos")
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
         escreval ("? um tri?ngulo equil?tero")
      senao
         se (A<>B)e (B<>C)e (A<>C)entao
            escreval ("? um tri?ngulo escaleno")
         senao
            se (A=B) e (A<>C) ou (A=C) e (A<>B)ou (C=B) e (C<>A)entao
               escreval ("? um tri?ngulo Is?sceles")
               fimse
            fimse
         fimse
      fimse


Fimalgoritmo