package com.mycompany.calculadora;

/**
 *
 * @author Admin
 */
public class ConversorNumeros {
    public Integer StringToInt(String num){
        int conversor = Integer.parseInt(num);
        return conversor;
    }
    
    public Double StringToDouble(String num){
        Double conversor = Double.parseDouble(num);
        return conversor;
    }
}
