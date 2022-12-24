/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.equacao;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static int A,B,C;
    public static double delt;
    
    public static void main(String[] args) {
        System.out.println("CÁLCULO DE EQUAÇÃO DE SEGUNDO GRAU");
        System.out.println("----------------------------------");
        
        System.out.println("Digite o A da operação: ");
        A = teclado.nextInt();
        
        System.out.println("Digite o B da operação: ");
        B = teclado.nextInt();
        
        System.out.println("Digite o C da operação: ");
        C = teclado.nextInt();
        
        delt = (B*B) - (4 * A * C) ;
        
        System.out.println("O delta é " + delt);
        
        if (delt<0) {
            System.out.println("Não existem valores reais.");
        } else {
            if (delt==0) {
                double x1;
                x1 = -B / (2*A);
                System.out.println("Existe apenas 1 raiz e ela é " + x1);
            } else {
                double x1,x2;
                x1 = ((-B + Math.sqrt(delt)) / (2*A));
                x2 = ((-B - Math.sqrt(delt)) / (2*A));
                
                System.out.println("Existem 2 raizes reais");
                System.out.println("X1: " + x1);
                System.out.println("X2: " + x2);
            }
        }
    }
}
