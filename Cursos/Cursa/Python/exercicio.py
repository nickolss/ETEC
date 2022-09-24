from email.mime import multipart
from unittest import result


def soma(n1, n2):
    soma = n1+n2
    return soma


def subtracao(n1, n2):
    subtracao = n1-n2
    return subtracao


def mult(n1, n2):
    multipli = n1*n2
    return multipli


def div(n1, n2):
    divisao = n1/n2
    return divisao

control = True 
print('BEM VINDO A CALCULADORA EM PYTHON')
print('---------------------------------')
while(control == True):

    n1 = float(input('Digite um valor: '))
    n2 = float(input('Digite outro valor: '))

    print('Selecione uma das operações: ')
    operacao = int(input('(1) Soma \n(2) Subtração \n(3) Multiplicação \n(4) Divisão \n'))

    if (operacao == 1):
        resultado = soma(n1, n2)
        print(resultado)

    if (operacao == 2):
        resultado = subtracao(n1, n2)
        print(resultado)

    if (operacao == 3):
        resultado = mult(n1, n2)
        print(resultado)

    if (operacao == 4):
        resultado = div(n1, n2)
        print(resultado)

    if (operacao > 4):
        print('ERRO! Operação inexistente')

    control2 = input('Deseja continuar? [s/n]')

    if(control2.upper == 'S'):
        control = True

    if(control2.upper == 'N'):
        control = False
    