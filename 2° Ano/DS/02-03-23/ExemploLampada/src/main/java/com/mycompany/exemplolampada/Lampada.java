/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplolampada;

/**
 *
 * @author dti
 */
public class Lampada {
    //É criada a variávcel privada estadoDaLampada inicializando com "Apagada"
    private String estadoDaLampada = "Apagada";
    
    //É criado o método void acende
    public void acende(){
        //Muda o valor da variável estadoDaLampada para Acesa
        this.estadoDaLampada = "Acesa";
    }
    
    //É criado o método void apaga
    public void apaga(){
        //Muda o valor da variável estadoDaLampada para Apagada
        this.estadoDaLampada = "Apagada";
    }
    
    //É criado o método void mostraEstado
    public void mostraEstado(){
        //Faz uma estrutura de decisão para ver se a lampada está acesa ou apagada
        if (this.estadoDaLampada.equals("Acesa")) {
            System.out.println("Esta acesa!");
        }else{
            System.out.println("Esta apagada!");
        }
    }
}
