def somar (n1,n2):
    resultado = n1+n2
    return resultado

def subtrair(n1,n2):
    resultado = n1-n2
    return resultado

def mult(n1,n2):
    resultado = n1*n2
    return resultado

def divisao(n1,n2):
    resultado = n1/n2
    return resultado

print('CALCULADORA DE OPERAÇÕES BÁSICAS')

n1 = float(input('Digite o primeiro número: '))
n2 = float(input('Digite o segundo número: '))

operacao = int(input('(1) SOMA \n(2) SUBTRAÇÃO \n(3) MULTIPLICAÇÃO \n(4) DIVISÃO \n'))

if(operacao == 1):
    resultado = somar(n1,n2)
    print('A soma entre os números é igual a ' , resultado)
    
if(operacao == 2):
    resultado = subtrair(n1,n2)
    print('A subtração entre os números é igual a ' ,resultado)
    
if(operacao == 3):
    resultado = mult(n1,n2)
    print('A multiplicação entre os números é igual a ' ,resultado)
    
if(operacao == 4):
    resultado = divisao(n1,n2)
    print('A divisão entre os números é igual a ' ,resultado)
    
if(operacao>4):
    print('ERRO! Digite um valor válido de operação. ')