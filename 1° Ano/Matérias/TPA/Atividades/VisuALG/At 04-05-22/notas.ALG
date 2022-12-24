Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/05/2022
Var
// Seção de Declarações das variáveis 
n1, n2, n3, n4, media: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
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