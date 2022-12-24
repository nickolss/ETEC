/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olapessoa;

/**
 *
 * @author nickolas
 */
public class Util {

    private String nome;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void mostrarMensagem(){
        System.out.println("Olá, " + this.nome);
    }
}
