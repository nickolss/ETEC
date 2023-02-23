/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex001;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Usuario {
    //Atributos
    private String nome, email, login, senha;
    
    //Construtures 
    //Inicializa os atributos vazios
    
    public Usuario(){
        this("","","","");
    }
    
    //Inicializa os atributos com valores passados por parametro
    public Usuario(String nome, String email, String login, String senha){
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
    
    //getters e setters

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getLogin() {
        return login;
    }

    
    public void setLogin(String login) {
        this.login = login;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Métodos especificos da classe
    public void provarExistencia(){
        System.out.println("Oi, eu existo");
    }
    
    public void receberInformacoes(){
        this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        this.email = JOptionPane.showInputDialog("Digite seu email: ");
        this.login = JOptionPane.showInputDialog("Digite seu login: ");
        this.senha = JOptionPane.showInputDialog("Digite sua senha: ");
    }
    
    public void exibirInformacoes(){
        JOptionPane.showMessageDialog(null, "Seu nome é " +this.getNome());
        JOptionPane.showMessageDialog(null, "Seu email é " +this.getEmail());
        JOptionPane.showMessageDialog(null, "Seu login é " +this.getLogin());
        JOptionPane.showMessageDialog(null, "Sua senha é " +this.getSenha());
    }
}
