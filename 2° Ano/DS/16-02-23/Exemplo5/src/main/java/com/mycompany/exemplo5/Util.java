/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo5;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util {
    private double notas[] = new double[4]; //Declarando um vetor para receber as notas
    private double media; //Declarando variáveis de média
    private String condicao; //Declarando variável de condição 
    
    public void receberValores(){ //Função para receber valores
        
        for (int i = 0; i <= 4; i++) {
            this.notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua 4 nota: "));
        }
        
        //Esse bloco rebece os valores das variáveis transformando os resultados do JOptionPane em Double usando de um vetor de notas
        
        this.media = (this.notas[0] + this.notas[1] + this.notas[2] + this.notas[3]) / this.notas.length ; //Faz o cálculo da média 
        
        this.avaliacaoDeAlunos(); //Chama a função availiação de aluno
    }
    
    private void avaliacaoDeAlunos(){
        
        if (this.media >= 6) { 
            this.condicao = "Aprovado";
        }else if (this.media < 3){
            this.condicao = "Retido";
        }else{
            this.condicao = "Exame";
        }
        
        //Usando estrutura de If e Else determina a situação do aluno
    }
    
    public void exibirResultado(){
        JOptionPane.showMessageDialog(null, "A média é: " + this.media + "\n Situação do Aluno: " + this.condicao); //Exibe o resultado do programa
    }
}
