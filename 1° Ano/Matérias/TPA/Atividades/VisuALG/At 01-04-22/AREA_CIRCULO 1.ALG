Algoritmo "Area_circulo"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
// Professor    : Antonio Carlos Nicolodi 
// Professora  : Vilma Cardoso dos Santos
//Autor(a)    : Nickolas Maia de Araujo
// Data atual  : 30/03/2022
Var
area:real
raio: real
raio_quad:real

Inicio
//decora??o
escreval ("**********************")
escreval ("Calculo de ?rea de PI")
escreval ("**********************")
escreval ("")

//entrada
escreva ("Digite seu raio:")
leia (raio)


//processamento
raio_quad<-raio^2

area<-raio_quad * pi

//saida

escreva ("A ?rea do seu c?rculo ? de" , area)

Fimalgoritmo