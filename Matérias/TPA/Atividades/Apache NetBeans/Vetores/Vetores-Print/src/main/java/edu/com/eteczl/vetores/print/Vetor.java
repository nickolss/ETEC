/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.com.eteczl.vetores.print;

import java.util.Scanner;

/**
 *
 * @author Nickolas
 */
public class Vetor {
    Scanner scanner = new Scanner(System.in);
    
    void iniciarVetor(int _vetor[])
    {
        for (int cont = 0; cont < _vetor.length; cont++)
        {
            System.out.print("Digite um número inteiro para a posição " + cont + ": ");
            _vetor[cont] = scanner.nextInt();
        }
        System.out.println("Vetor inicializado...");
    }
    
    void exibirVetor(int _vetor[])
    {
        System.out.print("Vetor = [");
        for (int cont = 0; cont < _vetor.length; cont++) {
            if (cont == _vetor.length-1) {
                System.out.print(_vetor[cont] + "]\n");
            }else{
                System.out.print(_vetor[cont] + " , ");
            }
        }
    }
}
