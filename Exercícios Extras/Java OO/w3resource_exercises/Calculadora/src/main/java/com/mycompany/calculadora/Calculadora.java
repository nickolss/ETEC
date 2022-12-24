/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author nickolas
 */
public class Calculadora {
    private int n1,n2;
    private double resultado;
    

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN2() {
        return n2;
    }
    
    
    public int soma(int n1, int n2){
        return n1+n2;
    }
    
    public int subtracao(int n1, int n2){
        return n1-n2;
    }
    
    public double multiplicacao(int n1, int n2){
        return n1*n2;
    }
    
    public double divisao(int n1, int n2){
        return n1/n2;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    

    public double getResultado() {
        System.out.print("O resultado é ");
        return resultado;
    }
}
