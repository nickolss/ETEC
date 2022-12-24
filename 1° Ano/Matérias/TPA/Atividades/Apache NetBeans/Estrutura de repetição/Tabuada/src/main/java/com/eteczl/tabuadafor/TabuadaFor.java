/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.eteczl.tabuadafor;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class TabuadaFor {
    public static Scanner teclado = new Scanner(System.in);
    public static int n;
    
    public static void main(String[] args) {
        System.out.println("TABUADAS USANDO REPETIÇÕES");
        System.out.println("--------------------------");
        
        System.out.println("FOR");
        System.out.println("Digite um número: ");
        n = teclado.nextInt();
        for (int cont = 0; cont <= 10; cont++) {
            int resp = n*cont; 
            System.out.println(n + "x" + cont + "=" + resp);
        }
    }
}
