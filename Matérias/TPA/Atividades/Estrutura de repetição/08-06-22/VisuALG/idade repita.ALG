Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 08/06/2022
Var
// Seção de Declarações das variáveis 
anoat, anonasc, ida, ada2050: inteiro
resp: caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
anoat<-2022

repita
      escreva ("Digite o ano em que você nasceu: ")
      leia (anonasc)
      ida<-anoat-anonasc
      ida2050<-2050-anonasc
      escreval ("Sua idade é " ,ida)
      escreval ("Sua idade em 2050 é " ,ida2050)
      
      escreva ("Deseja calcular novamente? [S/N]")
      leia (resp)

ate (resp="N")
Fimalgoritmo