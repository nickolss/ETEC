/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.senha;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static String senha;
    
    public static void main(String[] args) {
        System.out.println("VALIDADOR DE SENHA");
        System.out.println("------------------");
        
        System.out.println("Digite a senha: ");
        senha = teclado.nextLine();
        
        //.equals é para comparar o valor de uma variavel 
        if ("carpediem".equals(senha)) {
            System.out.println("Senha correta! Bem vindo(a)");
        } else {
            System.out.println("Senha incorreta! Tente novamente.");
        }
    }
}
