Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor   : Antonio Carlos Nicolodi
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/06/2022
Var
   // Se??o de Declara??es das vari?veis
   n1, n2, result: real
   tipcalc: caracter

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva ("Digite o primeiro n?mero: ")
   leia (n1)

   escreva ("Digite o segundo n?mero: ")
   leia (n2)

   escreval ("")

   escreval ("OPera??es aritm?ticas dispon?veis")

   escreval ("Adi??o +")
   escreval ("Subtra??o -")
   escreval ("Multiplica??o *")
   escreval ("Divis?o /")

   escreva ("Escolha a opera??o digitando o s?mbolo correspondente: ")
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
   
   escreva ("O resultado ? " ,result)
Fimalgoritmo