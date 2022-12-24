/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.tratamentoexcecoes;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static String nome;
    public static int idade;
    public static float altura;
    public static boolean paulistano;
    
    
    public static void main(String[] args) {
        System.out.println("BEM VINDO AO CADASTRO DO ALUNO");
        System.out.println("------------------------------");
        
        System.out.println("Digite a nome do aluno: ");
        nome = teclado.nextLine();
        
        try {
            System.out.println("Digite a nome do aluno: ");
            nome = teclado.nextLine();
        } catch (Exception e1) {
            System.out.println("Erro ao armazenar variável nome (tipo de dado): " + e1.getMessage());
            System.out.println("Tente novamente.");
            System.exit(0);
            
        }
        
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        
        System.out.println("Digite sua altura: ");
        altura = teclado.nextFloat();
        
        System.out.println("Você é paulistano? [true/false]");
        paulistano = teclado.nextBoolean();
        
        
        System.out.println("O aluno " + nome + " com a idade " + idade + " e altura " + altura);
        System.out.println("Esse aluno é paulistano? " + paulistano);
    }
}
