Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor    : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/04/2022
Var
// Se??o de Declara??es das vari?veis 
sexo : caracter

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
escreval ("Digite seu sexo:")
escreval ("M - Masculino")
escreval ("F - Feminino")
leia (sexo)
//decis?o encadeada

se (sexo="M") entao
   escreva ("Sexo masculino")

senao
     se(sexo="F")entao
            escreva("Sexo feminino")
     senao
          escreva ("Op??o inv?lida")
     fimse

fimse

Fimalgoritmo
