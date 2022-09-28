/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.maioridade;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static int anoat,anonasc,idade;
    
    public static void main(String[] args) {
        System.out.println("CALCULADORA DE MAIORIDADE");
        System.out.println("-------------------------");
        
        System.out.println("Digite o ano atual: ");
        anoat = teclado.nextInt();
        
        System.out.println("Digite seu ano de nascimento: ");
        anonasc = teclado.nextInt();
        
        idade = anoat-anonasc;
        
        System.out.println("Sua idade é " + idade);
        if (idade < 18) {
            System.out.println("Você é Menor de Idade");
        } else {
            System.out.println("Você é Maior de idade");
        }
    }
}
