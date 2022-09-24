package com.etec.tratamentoexcecoes;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nicks
 */
public class principal {
    //scanner
    public static Scanner teclado = new Scanner(System.in);
    
    //variáveis
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
            
        } catch (InputMismatchException e1) {
            System.out.println("Um erro ocorreu durante o armazenamento da variável nome (tipo de dado):" + e1.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Um erro ocorreu durante o armazenamento da variável nome (variável nula): " + e2.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
        }
        
        System.out.println("Digite sua idade: ");
        idade = teclado.nextInt();
        
        try {
            System.out.println("Digite sua idade: ");
            idade = teclado.nextInt();
        } catch (InputMismatchException e1) {
            System.out.println("Um erro ocorreu durante o armazenamento da variável idade (tipo de dado): " + e1.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Um erro ocorreu durante o armazenamento da variável idade (variável nula): " + e2.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
                    
        }
        
        
        System.out.println("Digite sua altura: ");
        altura = teclado.nextFloat();
        
        try {
            System.out.println("Digite sua altura: ");
            altura = teclado.nextFloat();
        } catch (InputMismatchException e1) {
            System.out.println("Um erro ocorreu durante o armazenamento da variável altura (tipo de dado): " + e1.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Um erro aconteceu durante o armazenamento da variável altura (valor nulo): " + e2.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
        }
        
        
        System.out.println("Você é paulistano? [true/false]");
        paulistano = teclado.nextBoolean();
        
        try {
            System.out.println("Você é paulistano? [true/false]");
            paulistano = teclado.nextBoolean();
        } catch (InputMismatchException e1) {
            System.out.println("Um erro aconteceu durante o armazenamento da variável paulistano (tipo de dado): " + e1.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
        }
        catch (NullPointerException e2){
            System.out.println("Um erro aconteceu durante o armazenamento da variável paulistano (valor nulo): " + e2.getMessage());
            System.out.println("Por favor tente novamente.");
            System.exit(0);
        }
        
        
        System.out.println("O aluno " + nome + " com a idade " + idade + "e altura " + altura);
        System.out.println("Esse aluno é paulistano? " + paulistano);
    }
}
