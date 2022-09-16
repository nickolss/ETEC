Algoritmo "Calculo salarial"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor    : Antonio Carlos Nicolodi 


Var
sal:real
aument:real
sal_aumento:real




Inicio

escreval ("***************************")
escreval ("Calculo de Aumento salarial")
escreval ("***************************")
escreval ("")

//entrada
escreva ("Digite seu salário atual:")
leia (sal)

//processamento
aument<-sal*25/100
sal_aumento<-sal+aument

//saida
escreval ("Seu antigo salário era de R$" , sal , " e é atualmente de R$" , sal_aumento)
escreval ("")
escreval ("Parabéns pela conquista")


Fimalgoritmo