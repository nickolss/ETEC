Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor    : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/04/2022
Var
// Se??o de Declara??es das vari?veis 
alt , imc1 , imc2:real
sexo:inteiro

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
escreva ("Digite a sua altura:")
leia (alt)
escreval ("Se voc? for Homem digite 1, se for mulher 2")
leia (sexo)
escreval("")

se (alt=1) entao
         imc1<-(72.7*alt)-58
         escreva ("Seu peso ideal ? de " , imc1)
         
senao
       imc2<-(62.1*alt)-44.7
       escreva ("Seu peso ideal ? de " , imc2)



fimse

Fimalgoritmo