Algoritmo "Calculo salarial"
// Disciplina   : [Linguagem e L?gica de Programa??o] 
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
escreva ("Digite seu sal?rio atual:")
leia (sal)

//processamento
aument<-sal*25/100
sal_aumento<-sal+aument

//saida
escreval ("Seu antigo sal?rio era de R$" , sal , " e ? atualmente de R$" , sal_aumento)
escreval ("")
escreval ("Parab?ns pela conquista")


Fimalgoritmo