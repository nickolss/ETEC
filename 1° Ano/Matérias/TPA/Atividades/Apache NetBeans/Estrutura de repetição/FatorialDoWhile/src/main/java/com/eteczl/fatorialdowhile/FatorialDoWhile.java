/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.eteczl.fatorialdowhile;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class FatorialDoWhile {
    public static Scanner teclado = new Scanner(System.in);
    public static int n;
    public static void main(String[] args) {
        System.out.println("FATORIAL DE NÚMEROS");
        System.out.println("-------------------");
        
        System.out.println("DO WHILE");
        System.out.println("Digite um número: ");
        n = teclado.nextInt();
        
        int fat=n;
        
        do {
            fat = fat*(n-1);
            n--;
        } while (n>1);
        
        System.out.println(fat);
    }
}
