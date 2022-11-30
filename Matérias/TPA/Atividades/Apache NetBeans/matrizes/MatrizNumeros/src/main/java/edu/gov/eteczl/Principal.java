/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gov.eteczl;

/**
 *
 * @author dti
 */
public class Principal {
    
    public static int matInteira[][] = new int[10][10];
    
    public static Matriz matriz = new Matriz();
    
    public static void main(String[] args) {
        
        matriz.inicializarMatriz(matInteira);
        matriz.exibirMatriz(matInteira);
        matriz.crivo(matInteira);
        
    }
}
