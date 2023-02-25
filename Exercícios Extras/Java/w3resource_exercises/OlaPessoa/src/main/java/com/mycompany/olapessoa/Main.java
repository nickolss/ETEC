/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.olapessoa;
import java.util.Scanner;
/**
 *
 * @author nickolas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Util util = new Util();
        
        System.out.print("Digite seu nome: ");
        util.setNome(scanner.next());
        
        util.mostrarMensagem();
        
        
    }
}
