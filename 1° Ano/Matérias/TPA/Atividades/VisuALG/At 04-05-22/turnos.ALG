Algoritmo "semnome"
// Disciplina   : [Linguagem e L?gica de Programa??o]
// Professor    : Antonio Carlos Nicolodi
// Descri??o   : Aqui voc? descreve o que o programa faz! (fun??o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 03/05/2022
Var
   // Se??o de Declara??es das vari?veis
   hinicio: real

Inicio
   // Se??o de Comandos, procedimento, fun??es, operadores, etc...
   escreva ("Digite o seu hor?rio de entrada:")
   leia (hinicio)

   se (hinicio>=5) e (hinicio<=12.59)entao
   escreval ("Turno da manh?")
   senao
        se (hinicio>=13) e (hinicio<=20.59)entao
        escreval ("Turno da Tarde")
        fimse

        se (hinicio>=21) ou (hinicio<=4.59)entao
        escreval ("Turno da Noite")
        fimse
        fimse

Fimalgoritmo
