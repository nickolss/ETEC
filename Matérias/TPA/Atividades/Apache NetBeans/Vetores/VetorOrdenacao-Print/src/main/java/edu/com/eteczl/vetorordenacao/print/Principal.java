/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.com.eteczl.vetorordenacao.print;

/**
 *
 * @author Nickolas
 */
public class Principal {
    /*Adicionado vetor de números*/
    public static int vetorNumeros[] = {5,9,0,1,2,7,8,3,6,4};
    
    public static Vetor vet = new Vetor();
    /*Instanciado a classe Vetor com o apelido vet*/
    
    public static void main(String[] args) {
        System.out.println("Vetores...");
        vet.exibirVetor(vetorNumeros);
        vet.ordenarVetor(vetorNumeros);
    }
}
