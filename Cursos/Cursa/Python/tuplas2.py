nome = str(input('Informe seu nome: '))
idade = int(input('Informe sua idade: '))

dados_cliente = (nome, idade)

cont=0

while (cont<len(dados_cliente)):
    print(dados_cliente[cont])
    cont = cont+1

