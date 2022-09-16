Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor    : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/04/2022
Var
   // Seção de Declarações das variáveis
   val01, val02, val03: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o primeiro valor:")
   leia (val01)
   escreva ("Digite o segundo valor:")
   leia (val02)
   escreva ("Digite o terceiro valor:")
   leia (val03)

   se (val01<val02) e (val01<val03) entao
      se (val02<val03) entao
         escreval("A ordem é" ,val01,"" ,val02,"" ,val03)
      senao
         escreval("A ordem é" ,val01,"" ,val03,"" ,val02)
      fimse
   senao

      se(val02<val01) e (val02<val03) entao
         se (val01<val03)entao
            escreval ("A ordem é" ,val02,"" ,val01,"" ,val03)
         senao
            escreval ("A ordem é" ,val02,"" ,val03,"" ,val02)
         fimse
      senao
      
         se (val03<val01) e (val03<val02)entao
            se (val01<val02)entao
               escreval ("A ordem é" ,val03,"" ,val01,"" ,val02)
            senao
               escreval ("A ordem é" ,val03,"" ,val02,"" ,val01)
            fimse

         fimse
      fimse
   fimse

Fimalgoritmo