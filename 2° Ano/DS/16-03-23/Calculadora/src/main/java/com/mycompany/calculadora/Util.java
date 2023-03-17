/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import javax.swing.JOptionPane;
import java.lang.Math;
import java.text.DecimalFormat;
/**
 *
 * @author nicks
 */
public class Util {
    private double resultado, n1, n2;
    private int operacao;
    DecimalFormat formatador = new DecimalFormat("0.00");
    
    public void decidirOperacao(){
        do{
            operacao = Integer.parseInt(JOptionPane.showInputDialog("1-Soma \n2-Subtração \n3-Divisão \n4-Multiplicação \n5-Resto da Divisão \n6-Dobro \n7-Quadrado \n8-Cubo \n9-Raiz quadrada \n0-Sair"));
        
        switch (operacao) {
            case 0:
                System.exit(0);
                break;
                
            case 1:
                somar();
                break;
                
            case 2:
                subtrair();
                break;
                
            case 3:
                divisao();
                break;
                
            case 4:
                multiplicacao();
                break;
                
            case 5:
                restoDaDivisao();
                break;
                
            case 6:
                dobrar();
                break;
                
            case 7:
                numeroAoQuadrado();
                break;
                
            case 8:
                numeroAoQuadrado();
                break;
                
            case 9:
                raizQuadrada();
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Número inválido");
        }
        } while(operacao != 0);
    }
    
    private void receberNumeros(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        this.n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número: "));
    }
    
    private void somar(){
        receberNumeros();
        resultado = this.n1 + this.n2;
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + this.resultado);
    }
    
    private void subtrair(){
        receberNumeros();
        resultado = this.n1 - this.n2;
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + this.resultado);
    }
    
    private void divisao(){
        receberNumeros();
        resultado = this.n1 / this.n2;
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + formatador.format(this.resultado));
    }
    
    private void multiplicacao(){
        receberNumeros();
        resultado = this.n1 * this.n2;
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + formatador.format(this.resultado));
    }
    
    private void restoDaDivisao(){
        receberNumeros();
        resultado = this.n1 % this.n2;
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + formatador.format(this.resultado));
    }
    
    private void dobrar(){
        resultado = this.n1 * 2;
        receberNumeros();
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + formatador.format(this.resultado));
    }
    
    private void numeroAoQuadrado(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para elevar ao quadrado: "));
        resultado = Math.pow(this.n1, 2);
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + formatador.format(this.resultado));
    }
    
    private void numeroAoCubo(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para elevar ao cubo: "));
        resultado = Math.pow(n1, 3);
        receberNumeros();
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + formatador.format(this.resultado));
    }
    
    private void raizQuadrada(){
        this.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para saber sua raiz quadrada: "));
        resultado = Math.sqrt(this.n1);
        JOptionPane.showMessageDialog(null, "O resultado da operação é " + formatador.format(this.resultado));
    }
}
