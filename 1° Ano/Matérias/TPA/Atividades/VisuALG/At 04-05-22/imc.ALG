Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor    : Antonio Carlos Nicolodi
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/05/2022
Var
   // Se??o de Declara??es das vari?veis
   peso, imc, altura: real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva ("Digite seu peso:")
   leia (peso)
   escreva ("Digite sua altura:")
   leia (altura)

   imc <- peso/(altura*altura)

   se (imc<18) entao
      escreva ("Magreza")
      
      senao
           se (imc>=18) e (imc<=24.9)entao
         escreva ("Saud?vel")
      fimse
      
      se (imc>=25) e (imc<=29.9)entao
         escreva ("SObrepeso")
      fimse

      se (imc>=30)entao
      escreva ("Obesidade")

   fimse
   fimse

Fimalgoritmo