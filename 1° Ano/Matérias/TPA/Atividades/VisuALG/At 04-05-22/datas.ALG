Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor    : Antonio Carlos Nicolodi
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/05/2022
Var
   // Se??o de Declara??es das vari?veis
   dia1, dia2, mes1, mes2, ano1, ano2: inteiro

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   //datas 01
   escreva ("Digite o primeiro dia:")
   leia (dia1)
   escreval ("")

   escreva ("Digite o primeiro m?s:")
   leia (mes1)
   escreval ("")

   escreva ("Digite o primeiro ano:")
   leia (ano1)
   escreval ("")

   //datas02
   escreva ("Digite o segundo dia:")
   leia (dia2)
   escreval ("")

   escreva ("Digite o segundo m?s:")
   leia (mes2)
   escreval ("")

   escreva ("Digite o segundo ano:")
   leia (ano2)
   escreval ("")

   //Se

   se(ano1<ano2)entao
      escreva ("A ordem das datas ?:" ,dia1,"/" ,mes1,"/" ,ano1, " e a segunda data ?" ,dia2,"/" ,mes2,"/" ,ano2)
   senao
        se(ano2<ano1) entao
        escreva ("A ordem das datas ?:" ,dia2,"/" ,mes2,"/" ,ano2, " e a segunda data ?" ,dia1,"/" ,mes1,"/" ,ano1)
        fimse
        
        se (ano1=ano2)entao
           se (mes1<mes2) entao
           escreva ("A ordem das datas ?:" ,dia1,"/" ,mes1,"/" ,ano1, " e a segunda data ?" ,dia2,"/" ,mes2,"/" ,ano2)
           fimse

           se (mes2<mes1) entao
           escreva ("A ordem das datas ?:" ,dia2,"/" ,mes2,"/" ,ano2, " e a segunda data ?" ,dia1,"/" ,mes1,"/" ,ano1)
           fimse
           
           se (mes1=mes2) entao
              se (dia1<dia2)entao
              escreva ("A ordem das datas ?:" ,dia1,"/" ,mes1,"/" ,ano1, " e a segunda data ?" ,dia2,"/" ,mes2,"/" ,ano2)
              fimse
              
              se (dia2<dia1) entao
              escreva ("A ordem das datas ?:" ,dia2,"/" ,mes2,"/" ,ano2, " e a segunda data ?" ,dia1,"/" ,mes1,"/" ,ano1)
              fimse
              
              se (dia1=dia2)entao
              escreva ("As datas s?o iguais")
              fimse
           fimse
fimse
fimse
Fimalgoritmo


