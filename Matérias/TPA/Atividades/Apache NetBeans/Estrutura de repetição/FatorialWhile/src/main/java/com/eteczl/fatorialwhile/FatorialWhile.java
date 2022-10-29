/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.eteczl.fatorialwhile;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class FatorialWhile {
    public static Scanner teclado = new Scanner(System.in);
    public static int n;
    public static void main(String[] args) {
        System.out.println("FATORIAL DE NÚMEROS");
        System.out.println("-------------------");
        
        System.out.println("WHILE");
        System.out.println("Digite um número: ");
        n = teclado.nextInt();
        
        int fat=n;
        
        while (n>1) {
            fat = fat*(n-1);
            n--;
        }
        
        System.out.println(fat);
    }
}
