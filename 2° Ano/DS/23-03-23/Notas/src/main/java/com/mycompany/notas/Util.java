/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notas;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Util {
    private float[] notas = new float[2];
    private String nome;
    
    public void lerNota(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        for (int i = 0; i <= 1; i++) {
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota: "));
        }
    }
    
    public void calcularMedia(){
        double mediaFinal = 0.0;
        for (int i = 0; i <= 1; i++) {
            mediaFinal += notas[i];
        }
        
        mediaFinal = mediaFinal / 2;
        
        if (mediaFinal >= 7) {
            JOptionPane.showMessageDialog(null, "O aluno " + this.nome + " foi aprovado com a média " + mediaFinal);
        }else{
            JOptionPane.showMessageDialog(null, "O aluno " + this.nome + " foi reprovado com a média " + mediaFinal);
        }
    }
}
