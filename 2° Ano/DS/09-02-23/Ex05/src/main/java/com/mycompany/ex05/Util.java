/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex05;
import java.util.Scanner;

/**
 *
 * @author nicks
 */
public class Util {
    public static Scanner teclado = new Scanner(System.in);
    private static int numerosPares;
    
    public void receberValores(){
        int[] num = new int[10];
        int numerosImpares = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.print("Digite um número: ");
            num[i] = teclado.nextInt();
            if (num[i]%2 == 0) {
                numerosPares++;
            }else{
                numerosImpares += num[i];
            }
        }
        
        System.out.println("A quantidade de números par foi " + numerosPares);
        System.out.println("A soma entre os números impares foi " + numerosImpares);
    }
}
