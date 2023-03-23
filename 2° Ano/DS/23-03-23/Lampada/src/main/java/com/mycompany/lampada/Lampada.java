/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lampada;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Lampada {
    private String estadoLampada;
    
    public Lampada(String _lamp){
        this.estadoLampada = _lamp;
    }
    
    public Lampada(){
        this("Apagada");
    }
    
    public void acende(){
        this.estadoLampada = "Acesa";
    }
    
    public void apaga(){
        this.estadoLampada = "Apagada";
    }
    
    public void mostrarEstado(){
        JOptionPane.showMessageDialog(null, "A lampada está " + this.estadoLampada);
    }
}
