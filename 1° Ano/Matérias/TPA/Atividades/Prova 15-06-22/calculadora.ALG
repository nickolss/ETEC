Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
   // Seção de Declarações das variáveis
   n1, n2, result: real
   tipcalc: caracter

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o primeiro número: ")
   leia (n1)

   escreva ("Digite o segundo número: ")
   leia (n2)

   escreval ("")

   escreval ("OPerações aritméticas disponíveis")

   escreval ("Adição +")
   escreval ("Subtração -")
   escreval ("Multiplicação *")
   escreval ("Divisão /")

   escreva ("Escolha a operação digitando o símbolo correspondente: ")
   leia (tipcalc)

   se (tipcalc="+")entao
      result<-n1+n2
   senao
      se (tipcalc="-")entao
         result<-n1-n2
      senao
         se(tipcalc="*")entao
            result<-n1*n2
         senao
            se (tipcalc="/")entao
               result<-n1/n2
            fimse
         fimse
      fimse
   fimse
   
   escreva ("O resultado é " ,result)
Fimalgoritmo