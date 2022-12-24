/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrizletras;

/**
 *
 * @author dti
 */
class Matriz 
{
    void exibirMatriz(String[][] _matTexto)
    {
        System.out.println("Matriz = ");
        
        for (int linha = 0; linha < _matTexto.length; linha++) 
        {
            for (int coluna = 0; coluna < _matTexto[linha].length; coluna++)
            {
                System.out.println(_matTexto[linha][coluna]);
            }
        }
    }
}
