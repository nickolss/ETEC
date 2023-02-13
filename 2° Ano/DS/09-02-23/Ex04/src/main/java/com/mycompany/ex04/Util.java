/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex04;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Util {
    private int num =1;
    private static int numerosEntreValores;
    public static Scanner teclado = new Scanner(System.in);
    
    public void exibirTexto(){
        System.out.println("Contador de números entre 100 e 200");
        System.out.println("Digite o número 0 para parar o programa");
        System.out.println("");
    }
    
    public void validador(){
        while(this.num != 0){
            System.out.print("Digite um número: ");
            this.setNum(teclado.nextInt());

            if(this.getNum() >= 100 && this.getNum()<=200){
                numerosEntreValores++;
            }
        }
        
        System.out.println("A quantidade de números entre 100 e 200 é " + numerosEntreValores);
            
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
}
