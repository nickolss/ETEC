/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.etec.turno;
import java.util.Scanner;
/**
 *
 * @author nicks
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static float inic_turno;
    
    public static void main(String[] args) {
        System.out.println("HORÁRIOS DE TURNOS");
        System.out.println("------------------");
        
        System.out.println("Digite o horário do início do turno: ");
        inic_turno = teclado.nextFloat();
        
        if (inic_turno>=5 && inic_turno<=12.59) {
            System.out.println("Você é do turno da manhã");
        } else {
            if (inic_turno>=13 && inic_turno<=20.59) {
                System.out.println("Você é do turno da tarde");
            } else{      
                if (inic_turno<=4.59 || inic_turno>=21){
                    System.out.println("Você é do turno da noite");
                }
                   
            }
        }
    }
}
