/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.multapescador;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static float pesomais, quilos, mult;
    
    
    public static void main(String[] args) {
        System.out.println("SISTEMA DE CÁLCULO DE MULTA");
        System.out.println("---------------------------");
        
        System.out.println("Digite a quantidade de peixes pescados: ");
        
        quilos = teclado.nextFloat();
        
        if (quilos <= 50) {
            System.out.println("Quantidade permitida de peixes.");
            System.out.println("MULTA: R$00.00");
        } else {
            pesomais = quilos-50;
            mult = pesomais*4;
            
            System.out.println("Você pescou mais do que é permitido.");
            System.out.println("MULTA: R$" + mult);
        }
    }
}
