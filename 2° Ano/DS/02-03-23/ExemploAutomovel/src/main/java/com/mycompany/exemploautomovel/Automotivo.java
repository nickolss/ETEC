/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploautomovel;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Automotivo {
    //Criada as variáveis privadas do programa
    private String modelo;
    private String marca;
    private int ano;
    private String cor;
    
    //Adicionado um método construtor para inicializar as variáveis vazias
    public Automotivo(){
        this("", "", 0, "");
    }
    
    //Adicionado um método construtor para inicializar as variáveis com atributos passados por parâmetro
    public Automotivo(String modelo, String marca, int ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    //Abaixo são os métodos getters e setters dos atributos
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //Abaixo é adicionado o método provarExistencia que exibe o modelo, marca, ano e cor do Automotivo usando de JOptionPane
    public void provarExistencia(){
        JOptionPane.showMessageDialog(null, "Modelo: " + this.getModelo() + "\n Marca: " + this.getMarca() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor());
    }
    
    //Abaixo é adicionado o método entradaDeDados que recebe os dados usando o JOptionPane e atribui eles aos atributos do objeto
    public void entradaDeDados(){
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        this.setModelo(modelo);
        
        String marca = JOptionPane.showInputDialog("Marca: ");
        this.setMarca(marca);
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        this.setAno(ano);
        
        String cor = JOptionPane.showInputDialog("Cor: ");
        this.setCor(cor);
    }
}
