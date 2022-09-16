Algoritmo "Area_circulo"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 
// Professora  : Vilma Cardoso dos Santos
//Autor(a)    : Nickolas Maia de Araujo
// Data atual  : 30/03/2022
Var
area:real
raio: real
raio_quad:real

Inicio
//decoração
escreval ("**********************")
escreval ("Calculo de área de PI")
escreval ("**********************")
escreval ("")

//entrada
escreva ("Digite seu raio:")
leia (raio)


//processamento
raio_quad<-raio^2

area<-raio_quad * pi

//saida

escreva ("A área do seu círculo é de" , area)

Fimalgoritmo