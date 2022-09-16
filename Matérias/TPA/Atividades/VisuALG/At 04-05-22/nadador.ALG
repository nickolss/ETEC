Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/05/2022
Var
// Seção de Declarações das variáveis 
idade: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

escreva ("Escreva a idade do Nadador para entrar no campeonato:")
leia (idade)
se (idade>=18) entao
   escreva ("Você esta no campeonato Senior")

senao
     se (idade>=14) e (idade<=17)entao
     escreva ("Você esta no campeonato Juvenil B")
     fimse
     
     se (idade>=11) e (idade<=13)entao
     escreva ("Você esta no campeonato Juvenil A")
     fimse
     
     se (idade>=9) e (idade<=10)entao
     escreva ("Você esta no campeonato Infantil B")
     fimse
     
     se (idade>=5) e (idade<=7)entao
     escreva ("Você esta no campeonato Infantil A")
fimse
fimse



Fimalgoritmo