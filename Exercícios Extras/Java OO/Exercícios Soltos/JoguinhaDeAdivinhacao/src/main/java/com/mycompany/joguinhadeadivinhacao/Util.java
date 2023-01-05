/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joguinhadeadivinhacao;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author nicks
 */
public class Util {
    private int numeroUser, numeroRandom;
    Scanner teclado = new Scanner(System.in);
    
    void mostrarMensagem(){
        System.out.println("*******************");
        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("*******************");
        System.out.println("");
        setNumeroUser();
    }  

    public void setNumeroRandom() {
        Random aleatorio = new Random();
        this.numeroRandom = aleatorio.nextInt(1000) + 1;
    }
    

    public void setNumeroUser() {
        System.out.print("Digite um número: ");
        this.numeroUser = teclado.nextInt();
    }
    
    void verificacao(){
        if(this.numeroUser == this.numeroRandom){
            System.out.println("ACERTOU!");
            System.exit(0);
        }else{
            if(this.numeroUser < this.numeroRandom){
                System.out.println("O número aleatório é maior");
            }else{
                System.out.println("O número aleatório é menor");
            }
        }
    }
    
    void tentativa(){
        while(this.numeroUser != this.numeroRandom){
            this.verificacao();
            this.setNumeroUser();
        }
    }
    
}
