/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.mesesano;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static int opcao;
    
    public static void main(String[] args) {
        System.out.println("CALENDÁRIO");
        System.out.println("----------");
        
        System.out.println("Digite o número do mês: ");
        opcao = teclado.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Janeiro");
                break;
                
            case 2:
                System.out.println("Fevereiro");
                break;
                
            case 3:
                System.out.println("Março");
                break;
                
            case 4:
                System.out.println("Abril");
                break;
                
            case 5:
                System.out.println("Maio");
                break;
                
            case 6:
                System.out.println("Junho");
                break;
                
            case 7:
                System.out.println("Julho");
                break;
                
            case 8:
                System.out.println("Agosto");
                break;
                
            case 9:
                System.out.println("Setembro");
                break;
                
            case 10:
                System.out.println("Outubro");
                break;
                
            case 11:
                System.out.println("Novembro");
                break;
                
            case 12:
                System.out.println("Dezembro");
                break;
            
            default:
                System.out.println("Número inválido");
        }
    }
}
