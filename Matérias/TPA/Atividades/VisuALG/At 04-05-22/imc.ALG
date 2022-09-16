Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor    : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/05/2022
Var
   // Seção de Declarações das variáveis
   peso, imc, altura: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite seu peso:")
   leia (peso)
   escreva ("Digite sua altura:")
   leia (altura)

   imc <- peso/(altura*altura)

   se (imc<18) entao
      escreva ("Magreza")
      
      senao
           se (imc>=18) e (imc<=24.9)entao
         escreva ("Saudável")
      fimse
      
      se (imc>=25) e (imc<=29.9)entao
         escreva ("SObrepeso")
      fimse

      se (imc>=30)entao
      escreva ("Obesidade")

   fimse
   fimse

Fimalgoritmo