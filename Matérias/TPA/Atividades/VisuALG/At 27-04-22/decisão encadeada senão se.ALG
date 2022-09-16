Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/04/2022
Var
// Seção de Declarações das variáveis 
sexo : caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval ("Digite seu sexo:")
escreval ("M - Masculino")
escreval ("F - Feminino")
leia (sexo)
//decisão encadeada

se (sexo="M") entao
   escreva ("Sexo masculino")

senao
     se(sexo="F")entao
            escreva("Sexo feminino")
     senao
          escreva ("Opção inválida")
     fimse

fimse

Fimalgoritmo
