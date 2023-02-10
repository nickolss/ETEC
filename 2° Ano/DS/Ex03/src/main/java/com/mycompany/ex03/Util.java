/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex03;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Util {
    private int num;
    private static int numerosAcimaDeTrinta;
    public static Scanner teclado = new Scanner(System.in);
    
    public void validador(){
        for (int i = 0; i <= 15; i++) {
            System.out.print("Digite um número: ");
            this.setNum(teclado.nextInt());
            
            if (this.getNum() >= 30) {
                numerosAcimaDeTrinta++;
            }
            
            
        }
        System.out.println("Os números acima de 30 foram " + numerosAcimaDeTrinta);
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    
    
}
