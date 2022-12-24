/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.medianotas;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static float n1,n2,n3,n4,med;
    
    public static void main(String[] args) {
        System.out.println("BOLETIM FINAL");
        System.out.println("-------------");
        
        System.out.println("Digite a 1ª nota: ");
        n1 = teclado.nextFloat();
        
        System.out.println("Digite a 2ª nota: ");
        n2 = teclado.nextFloat();
        
        System.out.println("Digite a 3ª nota: ");
        n3 = teclado.nextFloat();
        
        System.out.println("Digite a 4ª nota: ");
        n4 = teclado.nextFloat();
        
        med = (n1+n2+n3+n4)/4;
        
        System.out.println("Sua média foi: " + med);
        
        if (med>=5) {
            if (med<7) {
                System.out.println("Aprovado com C");
            } else {
                if (med>=7 && med<9) {
                    System.out.println("Aprovado com B");
                } else {
                    if (med>=9){
                        System.out.println("Aprovado com A");
                    }
                }
            }
        } else {
            if (med>=2.5 && med<5) {
                System.out.println("Reprovado com D");
            } else {
                System.out.println("Reprovado com F");
            }
        }
    }
}
