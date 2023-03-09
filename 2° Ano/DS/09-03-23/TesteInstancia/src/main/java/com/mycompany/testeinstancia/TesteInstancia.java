/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeinstancia;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author dti
 */



public class TesteInstancia {
    public static void main(String[] args) {
        byte n = 0;
        double nota, soma = 0;
        double media;
        
        nota = Double.parseDouble(JOptionPane.showInputDialog(null , "Nota do Aluno, digite -1 para parar"));
        while(nota!=0){
            soma += nota;
            n = (byte) (n+1);
            nota = Double.parseDouble(JOptionPane.showInputDialog(null ,"Nota do aluno, digite -1 para parar"));
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        if (n != 0) {
            media = soma / n ;
            JOptionPane.showMessageDialog(null, "Média igual a " + df.format(media));
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma nota foi digitada");
        }
    }
}
