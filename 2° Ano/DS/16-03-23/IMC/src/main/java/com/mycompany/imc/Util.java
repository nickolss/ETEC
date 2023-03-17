/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author nicks
 */
public class Util {
    DecimalFormat formatador = new DecimalFormat("0.00");
    
    public void calcularPesoIdeal(double altura, String sexo){
        double pesoIdeal;
        if ("f".equals(sexo) || "F".equals(sexo)) {
            pesoIdeal = (62.1 * altura) - 44.7;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é de " + formatador.format(pesoIdeal));
        }else{
            pesoIdeal = (72.7 * altura) - 58;
            JOptionPane.showMessageDialog(null, "Seu peso ideal é de " + formatador.format(pesoIdeal));
        }
    }
}
