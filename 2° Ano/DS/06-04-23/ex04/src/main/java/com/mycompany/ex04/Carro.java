/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex04;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Carro {
    private String marca,modelo,cor,placa;

    public Carro() {
        this("", "" ,"" ,"");
    }
    
    public Carro(String _marca, String _modelo, String _cor, String _placa){
        this.marca = _marca;
        this.modelo = _modelo;
        this.cor = _cor;
        this.placa = _placa;
    }
    
    public void ligar(){
        JOptionPane.showMessageDialog(null, "O carro ligou!");
    }
    
    public void desligar(){
        JOptionPane.showMessageDialog(null, "O carro desligou!");
    }
    
    public void acelerar(){
        JOptionPane.showMessageDialog(null, "O carro acelerou!");
    }
    
    public void frear(){
        JOptionPane.showMessageDialog(null, "O carro freou!");
    }
}
