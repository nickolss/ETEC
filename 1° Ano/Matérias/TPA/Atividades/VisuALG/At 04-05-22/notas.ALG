Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor    : Antonio Carlos Nicolodi 
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/05/2022
Var
// Se??o de Declara??es das vari?veis 
n1, n2, n3, n4, media: real

Inicio
// Se??o de Comandos, procedimento, fun??es, operadores, etc... 
escreva ("Digite sua primeira nota:")
leia (n1)
escreva ("Digite sua primeira nota:")
leia (n2)
escreva ("Digite sua primeira nota:")
leia (n3)
escreva ("Digite sua primeira nota:")
leia (n4)

media<-(n1+n2+n3+n4)/4

se (media>=9) entao
   escreva ("A")

senao
     se (media>=7) e (media<9)entao
        escreva ("B")
     fimse
     se (media>=5) e (media<7)entao
        escreva ("C")
     fimse
     se (media>=2.5) e (media<5)entao
        escreva ("D")
     fimse
     se (media<2.5) entao
        escreva ("E")
        fimse
fimse
Fimalgoritmo