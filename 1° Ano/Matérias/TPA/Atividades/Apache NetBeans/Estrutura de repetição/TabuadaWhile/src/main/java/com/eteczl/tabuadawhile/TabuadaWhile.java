/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.eteczl.tabuadawhile;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class TabuadaWhile {
    public static Scanner teclado = new Scanner(System.in);
    public static int n, cont=0;
    
    public static void main(String[] args) {
        System.out.println("TABUADAS USANDO REPETIÇÕES");
        System.out.println("--------------------------");
        
        System.out.println("WHILE!");
        System.out.println("Digite um número: ");
        n = teclado.nextInt();
        
        while (cont<=10){
            int resp = n*cont; 
            System.out.println(n + "x" + cont + "=" + resp);
            cont++;
        }
    }
}
