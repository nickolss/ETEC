/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.eteczl.terminal;
//biblioteca do Scanner
import java.util.Scanner;

/**
 *
 * @author dti
 */
public class main {
    //Entrada de Objeto, no caso teclado
    public static Scanner teclado = new Scanner(System.in);
    
    //declaração de variável nome do tipo String
    public static String nome;
    
    //declaração de variável idade do tipo Integer
    public static int idade;
    
    //declaração de variável paulistano do tipo Boolean
    public static boolean paulistano;
    
    public static float altura;
    
    public static void main(String[] args) {
        
        System.out.println("Seja bem vindo a aplicação de cadastro...");
        
        System.out.println("Para realizar o cadastro responda as seguintes questões");

        
        System.out.println("Digite seu nome:");
        
        nome = teclado.nextLine();
        
        System.out.println("Digite sua idade:");
        
        idade = teclado.nextInt();

        System.out.println("Digite sua altura:");
        
        altura = teclado.nextFloat();
        
        System.out.println("Você é paulistano? [true/false]");
        
        paulistano = teclado.nextBoolean();
        
        
        System.out.println("Suas informações são: ");
        
        //exibição de mensagens
        System.out.println("Seu nome é " + nome);
        
        System.out.println("Sua idade é " + idade);
        
        System.out.println("Sua altura é " + altura);
        
        System.out.println("Você é paulistano: " + paulistano);
        
        
        System.out.println("CADASTRO CONCLUIDO");
    }
}
