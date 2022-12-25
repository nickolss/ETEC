/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.raioeperimetrocirculo;
import java.util.Scanner;


/**
 *
 * @author nickolas
 */
public class RaioEPerimetroCirculo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util util = new Util();
        
        util.mostrarMensagem();
        
        util.setRaio(scanner.nextDouble());
        
        System.out.println("A área é " + util.calcularArea());
        System.out.println("O perímetro é " + util.calcularPerimetro());
    }
}
