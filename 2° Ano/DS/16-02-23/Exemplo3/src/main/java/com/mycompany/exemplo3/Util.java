/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo3;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util {
    Calendar cal = Calendar.getInstance();
    
    private int anoNascimento, idade2050, idadeAtual;
    
    
    public void receberValores(){
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
    }
    
    private void calcularIdade(){
        this.idadeAtual = cal.get(Calendar.YEAR) - this.anoNascimento;
        this.idade2050 = 2050 - this.anoNascimento;
    }
}
