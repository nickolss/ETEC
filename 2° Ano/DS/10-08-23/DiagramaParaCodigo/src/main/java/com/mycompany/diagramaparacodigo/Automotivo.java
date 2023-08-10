/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramaparacodigo;
import javax.swing.*;
/**
 *
 * @author Admin
 */
public class Automotivo {
    private String modelo;
    private String marca;
    private String cor;
    private String ano;
    private String chasi;

    public Automotivo() {
        this("","","", "", "");
    }
   

    public Automotivo(String modelo, String marca, String cor, String ano, String chasi) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.chasi = chasi;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the chasi
     */
    public String getChasi() {
        return chasi;
    }

    /**
     * @param chasi the chasi to set
     */
    public void setChasi(String chasi) {
        this.chasi = chasi;
    }
    
    
    
    public void provarExistencia(){
        JOptionPane.showMessageDialog(null, "Eu existo!");
    }

    public void entrarDados(){
        setAno(JOptionPane.showInputDialog("Digite o ano do automotivo"));
        setChasi(JOptionPane.showInputDialog("Digite o Chasi do automotivo: "));
        setCor(JOptionPane.showInputDialog("Digite a cor do automotivo: "));
        setMarca(JOptionPane.showInputDialog("Digite a marca do automotivo: "));
        setModelo(JOptionPane.showInputDialog("Digite o modelo do automotivo: "));
    }
    
}
