/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.com.eteczl.vetortexto.print;

/**
 *
 * @author Nickolas
 */
public class Principal {
    public static String vetorTexto[] = {"S" , "a" , "o" ," " ,"P" ,"a" , "u" , "l" , "o"};
    /*Chamada da classe "VETOR" com o apelido de vet*/
    public static Vetor vet = new Vetor();
    
    public static void main(String[] args) {
        System.out.println("Vetores");
        vet.exibirVetorPorLetra(vetorTexto);
        
        System.out.println("");
        
        vet.exibirVetorPorLinha(vetorTexto);
    }
}
