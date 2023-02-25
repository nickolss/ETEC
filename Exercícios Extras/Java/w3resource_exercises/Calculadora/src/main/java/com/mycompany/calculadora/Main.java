/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author nickolas
 */
public class Main {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        
        System.out.print("Digite um número: ");
        calculadora.setN1(scanner.nextInt());
        
        System.out.print("Digite outro número: ");
        calculadora.setN2(scanner.nextInt());
        
        calculadora.setResultado(calculadora.soma(calculadora.getN1(),calculadora.getN2()));
        
        System.out.println(calculadora.getResultado());
    }
}
