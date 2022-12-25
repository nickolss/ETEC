/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.raioeperimetrocirculo;
import java.lang.Math;
/**
 *
 * @author nickolas
 */
public class Util {
    private double perimetro, raio;
    private Math conta; 
    
    void mostrarMensagem(){
        System.out.println("**************************************************");
        System.out.println("Programa de Cálculo de Área e Perímetro de Círculo");
        System.out.println("**************************************************");
        System.out.println("");
        System.out.print("Digite o Raio do Círculo: ");
    }
    
    double calcularPerimetro(){
        double resultado = this.perimetro = 2*conta.PI*this.raio;
        return resultado;
    }
    
    double calcularArea(){
        double resultado = conta.PI * (this.raio*this.raio);
        return resultado;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
    
}
