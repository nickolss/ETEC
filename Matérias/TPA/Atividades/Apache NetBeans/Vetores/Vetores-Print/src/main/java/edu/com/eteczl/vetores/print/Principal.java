/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.com.eteczl.vetores.print;

/**
 *
 * @author Nickolas
 */
public class Principal {
    public static int vetorNumeros[] = new int[5];
    public static Vetor vet = new Vetor();
    
    public static void main(String[] args) {
        System.out.println("Vetores");
        
        vet.iniciarVetor(vetorNumeros);
        vet.exibirVetor(vetorNumeros);
    }
}
