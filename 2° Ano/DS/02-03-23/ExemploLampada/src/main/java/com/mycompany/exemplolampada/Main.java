/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplolampada;

/**
 *
 * @author dti
 */
public class Main {
    //É iniciado o pacote básico da biblioteca java
    public static void main(String[] args) {
        //É instanciado o objeto lampada da classe Lampada
        Lampada lampada = new Lampada();
        
        //É chamado através do objeto o método acende
        lampada.acende();
        
        //É chamado através do objeto o método apaga
        lampada.apaga();
        
        //É chamado através do objeto o método mostraEstado
        lampada.mostraEstado();
    }
}
