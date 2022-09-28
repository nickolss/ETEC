/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.lojamac;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static int opcao;
    public static void main(String[] args) {
        System.out.println("CARDÁPIO DO MCDONALD'S");
        System.out.println("----------------------");
        
        System.out.println("""
                           1-Bigmac 
                           2-Quarteirão 
                           3-McChicken 
                           4-Cheddar McMelt 
                           5-McMax""");
        
        System.out.println("Digite a opção desejada:");
        
        opcao = teclado.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Bigmac escolhido");
                break;
                
            case 2:
                System.out.println("Quarteirão escolhido");
                break;
                
            case 3:
                System.out.println("McChicken escolhido");
                break;
                      
            case 4:
                System.out.println("Cheddar Mcmelt escolhido");
                break;
                
            case 5:
                System.out.println("McMax escolhido");
                break;
                
            default:
                System.out.println("Opção escolhida é inválida");
        }
    }
}
