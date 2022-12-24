Algoritmo "Loja_tintas"


Var
altura:real
largura:real
area:real
quant_lata:real
preco:real
area_lata:real


Inicio
//decoração
Escreval ("******************")
escreval ("Loja de Tintas 1ds")
Escreval ("******************")
escreval("")
//entrada
escreva ("Digite a altura:")
leia (altura)
escreva ("Digite a largura:")
leia (largura)
escreval("")
//processamento
area<-altura*largura

area_lata<-5*3

quant_lata<-area/area_lata

//resultado/saida
escreval ("A quantidade de latas são" , quant_lata)

preco<-quant_lata*100

escreval ("O preço total em latas é de R$",preco)


Fimalgoritmo