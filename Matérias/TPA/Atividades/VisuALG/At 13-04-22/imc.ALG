Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 13/04/2022
Var
// Seção de Declarações das variáveis 
alt , imc1 , imc2:real
sexo:inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva ("Digite a sua altura:")
leia (alt)
escreval ("Se você for Homem digite 1, se for mulher 2")
leia (sexo)
escreval("")

se (alt=1) entao
         imc1<-(72.7*alt)-58
         escreva ("Seu peso ideal é de " , imc1)
         
senao
       imc2<-(62.1*alt)-44.7
       escreva ("Seu peso ideal é de " , imc2)



fimse

Fimalgoritmo