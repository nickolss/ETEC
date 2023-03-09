/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeprod;

/**
 *
 * @author dti
 */
class Produto extends Object{
    public int codigo, quantidade;
    public String nome;
    public double preco;
    
    public Produto(int cod, String nome, int quant, double pre){
        this.codigo = cod;
        this.nome = nome;
        this.quantidade = quant;
        this.preco = pre;
    }
}

public class TestaProd {
    public static void main(String[] args) {
        Produto produto;
        produto = new Produto(10, "Sabonete" , 12 , 1.2);
        
        System.out.println(produto.codigo + "\t" + produto.nome);
        
        System.out.println(produto.quantidade + "\t" + produto.preco);
        
        produto.preco *= 1.10;
        
        System.out.println(produto.quantidade + "\t" + produto.preco);
    }
}
