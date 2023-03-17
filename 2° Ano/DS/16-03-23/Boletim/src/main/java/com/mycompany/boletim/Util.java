/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletim;
import javax.swing.JOptionPane;
/**
 *
 * @author nicks
 */
public class Util {
    private String nome;
    private double[] Notas = new double[2];
    
    public void lerNotas(){
        for (int i = 0; i <= 1; i++) {
            Notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));
        }
        
        calcularMedia();
    }
    
    private void calcularMedia(){
        double result;
        result = (Notas[0] + Notas[1]) / 2;
        if (result >= 7) {
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado com a média " + result);
        }else{
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado com a média " + result);
        }
    }
}
