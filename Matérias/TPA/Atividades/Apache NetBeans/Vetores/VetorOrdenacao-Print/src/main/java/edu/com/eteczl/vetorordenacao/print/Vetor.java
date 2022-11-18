/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.com.eteczl.vetorordenacao.print;

/**
 *
 * @author Nickolas
 */
public class Vetor {
    void exibirVetor (int[] _vet)
    {
        System.out.print("Vetor = [");
        
        for (int cont = 0; cont < _vet.length; cont++) {
            if (cont == _vet.length) 
            {
                System.out.print(_vet[cont] + "]\n");
            }
            else
            {
                System.out.print(_vet[cont] + " , ");
            }
        }
    }
    
    void ordenarVetor( int[] _vet)
    {
        int auxiliar = 0;
        
        for (int cont1 = 0; cont1 < _vet.length; cont1++)
        {
            for (int cont2 = cont1+1; cont2 < _vet.length; cont2++)
            {
                if (_vet[cont1] > _vet[cont2])
                {
                    auxiliar = _vet[cont2];
                    _vet[cont2] = _vet[cont1];
                    _vet[cont1] = auxiliar;
                }
                System.out.println("Cont1 = " + cont1 + " / Cont2 = " + cont2 + " / ");
                
                this.exibirVetor(_vet);
            }
        }
    }
}
