/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.cadastroaluno;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class CadastroAluno {
    //variáveis
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
        
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        
        System.out.println("Digite sua altura: ");
        altura = teclado.nextFloat();
        
        System.out.println("Você é paulistano? [true/false]");
        paulistano = teclado.nextBoolean();
        
        
        System.out.println("O aluno " + nome + " com a idade " + idade + "e altura " + altura);
        System.out.println("Esse aluno é paulistano? " + paulistano);
    }
}
