/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuada;

/**
 *
 * @author nickolas
 */
public class Tabuada {
    
    private int n1;
    
    public void mostrarTexto(){
        System.out.println("********************************");
        System.out.println("Programa de Cálculo de Tabuada");
        System.out.println("********************************");
        System.out.println("");
        System.out.print("Digite um número: ");
    }
    
    public void calculoTabuada(int n1){
        for (int cont = 0; cont <= 10; cont++) {
            int resultado = n1*cont;
            
            System.out.println(n1 +"X"+cont+" = "+ resultado);
        }
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }
    
    
   
}
