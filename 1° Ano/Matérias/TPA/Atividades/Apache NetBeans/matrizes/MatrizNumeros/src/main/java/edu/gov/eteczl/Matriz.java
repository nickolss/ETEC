/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.gov.eteczl;

/**
 *
 * @author dti
 */
class Matriz {
    void inicializarMatriz(int[][] _matInteira)
    {
        int numero = 1;
        
        for (int linha = 0; linha < 9; linha++) {
            for (int coluna = 0; coluna < 9; coluna++) {
                _matInteira[linha][coluna] = numero;
                
                numero++;
            }
        }
        
        System.out.println("Matriz inicializada... \n\n");
        
    }
    
    void exibirMatriz(int[][] _matInteira)
    {
        System.out.println("Matriz = ");
        
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                if (coluna == 9) 
                {
                    System.out.println(_matInteira[linha][coluna]);
                }
                else
                {
                    System.out.print(_matInteira[linha][coluna] + " , ");
                }
            }
        }
        System.out.println("\n");
    }
    
    void crivo(int[][] _matInteira)
    {
        for (int linha = 0; linha <= 9; linha++) {
            for (int coluna = 0; coluna <= 9; coluna++) {
                if (_matInteira[linha][coluna] != 2 && _matInteira[linha][coluna] % 2 == 0) 
                {
                    _matInteira[linha][coluna] = 0;
                }
                
                if (_matInteira[linha][coluna] != 3 && _matInteira[linha][coluna] % 3 == 0)
                {
                    _matInteira[linha][coluna] = 0;
                }
                
                if (_matInteira[linha][coluna] != 5 && _matInteira[linha][coluna] % 5 == 0)
                {
                    _matInteira[linha][coluna] = 0;
                }
                
                if (_matInteira[linha][coluna] != 7 && _matInteira[linha][coluna] % 7 == 0)
                {
                    _matInteira[linha][coluna] = 0;
                }
            }
        }
        
        exibirMatriz(_matInteira);
    }
}
