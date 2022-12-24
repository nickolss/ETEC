Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor    : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/05/2022
Var
   // Seção de Declarações das variáveis
   hinicio: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o seu horário de entrada:")
   leia (hinicio)

   se (hinicio>=5) e (hinicio<=12.59)entao
   escreval ("Turno da manhã")
   senao
        se (hinicio>=13) e (hinicio<=20.59)entao
        escreval ("Turno da Tarde")
        fimse

        se (hinicio>=21) ou (hinicio<=4.59)entao
        escreval ("Turno da Noite")
        fimse
        fimse

Fimalgoritmo
