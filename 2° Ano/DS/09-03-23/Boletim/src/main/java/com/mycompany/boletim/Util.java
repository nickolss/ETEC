/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletim;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util{
    private double notas[] = new double[2]; //Iniciado o atributo double Notas
    private String nome;
    
    //Metodo receber informacoes que usa do array notas e um laço de repetição for para atribuir as notas do aluno
    public void receberInformacoes(){
        this.nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        
        for (int i = 0; i <= 1; i++) {
            this.notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua nota: "));
        }
        
        this.calcularMedia();
    }
    
    //Método calcularMedia que calcula a média do aluno e diz se está reprovado, em recuperação ou aprovado
    private void calcularMedia(){
        double media = 0;
        for (int i = 0; i <= 1; i++) {
            media += this.notas[i];
        }
        
        if (media<=3) {
            JOptionPane.showMessageDialog(null, this.nome +" está reprovado");
        }else{
            if (media>=4 && media<=6) {
                JOptionPane.showMessageDialog(null, this.nome +" está em recuperação");
            }else{
                JOptionPane.showMessageDialog(null, this.nome +" está aprovado");
            }
        }
    }
}
