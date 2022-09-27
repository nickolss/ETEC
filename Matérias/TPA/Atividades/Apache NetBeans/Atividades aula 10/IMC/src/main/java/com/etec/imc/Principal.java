/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.imc;
import java.util.Scanner;

/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static float altura,peso,imc;
    
    public static void main(String[] args) {
        System.out.println("PROGRAMA DE CÁLCULO DE IMC");
        System.out.println("--------------------------");
        
        System.out.println("Digite sua altura: ");
        altura = teclado.nextFloat();
        
        System.out.println("Digite seu peso: ");
        peso = teclado.nextFloat();
        
        imc = peso / (altura*altura);
        
        System.out.println("Seu imc é " + imc);
        
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else {
            if (imc > 18.5 && imc < 24.9){
                System.out.println("Você está no peso normal");
            }else {
                if (imc > 24.9 && imc < 29.9){
                    System.out.println("Você está em sobrepeso");
                }else{
                    if (imc > 29.9 && imc < 34.9){
                        System.out.println("Você está em obesidade grau I");
                    }else {
                        if (imc > 34.9 && imc < 39.9){
                            System.out.println("Você está em obesidade grau II");
                        }else {
                            if (imc >= 40){
                                System.out.println("Você está com obesidade grau III");
                            }
                        }
                    }
                }
            }
        }
        
    }
}
