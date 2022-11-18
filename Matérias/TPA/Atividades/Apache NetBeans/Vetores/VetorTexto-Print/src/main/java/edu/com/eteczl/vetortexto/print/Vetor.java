/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.com.eteczl.vetortexto.print;

/**
 *
 * @author Nickolas
 */
public class Vetor {
    void exibirVetorPorLetra(String[] _vet)
    {
        for (int cont = 0; cont < _vet.length; cont++) {
            System.out.println("Indice => " + cont + " / Letra => " + _vet[cont]);
        }
    }
    
    void exibirVetorPorLinha(String[] _vet)
    {
        for (int cont = 0; cont < _vet.length; cont++) {
            System.out.print(_vet[cont]);
        }
    }
}
