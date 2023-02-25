/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tabuada;
import java.util.Scanner;
/**
 *
 * @author nickolas
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tabuada tabuada = new Tabuada();
        tabuada.mostrarTexto();
        tabuada.setN1(scanner.nextInt());
        tabuada.calculoTabuada(tabuada.getN1());
    }
}
