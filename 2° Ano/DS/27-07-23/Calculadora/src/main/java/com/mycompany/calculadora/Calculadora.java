/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Admin
 */
public class Calculadora {
    private double numero01, numero02, resultado;
    
    public Calculadora(){
        this(0,0,0);
    }

    public Calculadora(double numero01, double numero02, double resultado) {
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double getResultado(){
        return this.resultado;
    }

    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    public double getNumero01() {
        return numero01;
    }

    
    
    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    public double getNumero02() {
        return numero02;
    }
    
    public void somar(double numero1, double numero2){
        setResultado(this.getNumero01() + this.getNumero02());
    }
    
    public void subtrair(double numero1, double numero2){
        setResultado(this.getNumero01() - this.getNumero02());
    }
    
    public void multiplicar(double numero1, double numero2){
        setResultado(this.getNumero01() * this.getNumero02());
    }
    
    public void dividir(double numero1, double numero2){
        setResultado(this.getNumero01() / this.getNumero02());
    }
    
    public void sair(){
        System.exit(0);
    }
}
