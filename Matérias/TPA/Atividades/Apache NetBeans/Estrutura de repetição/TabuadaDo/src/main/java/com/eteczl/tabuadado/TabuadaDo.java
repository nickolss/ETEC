/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.eteczl.tabuadado;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class TabuadaDo {
    public static Scanner teclado = new Scanner(System.in);
    public static int n,cont=0;
    
    public static void main(String[] args) {
        System.out.println("TABUADAS USANDO REPETIÇÕES");
        System.out.println("--------------------------");
        
        System.out.println("DO WHILE");
        System.out.println("Digite um número:");
        n = teclado.nextInt();
        
        do {
            int resp = n*cont; 
            System.out.println(n + "x" + cont + "=" + resp);
            cont++;
        } while (cont<=10);
    }
}
