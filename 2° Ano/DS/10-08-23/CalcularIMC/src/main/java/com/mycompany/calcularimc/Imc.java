/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimc;

/**
 *
 * @author Admin
 */
public class Imc {

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }
    private double peso, altura, imc;


    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    
    
    public Double calcularImc(){
        setImc(getPeso() / (getAltura()*getAltura()));
        return getImc();
    }
    
    public void cadastrarDados(double peso , double altura){
        setAltura(altura);
        setPeso(peso);
    }
}
