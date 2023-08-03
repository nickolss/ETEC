/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author Admin
 */
public class Menu {
    private Caixa caixa;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaDados io;
    
    public Menu() {
        this.caixa = new Caixa();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaDados();
    }
    
    public void executarCaixa(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=4);
    }
    
    public void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção"
                + "\n 1 - Entrada"
                + "\n 2 - Retirada"
                + "\n 3 - Consultar Saldo"
                + "\n 4 - Sair";
        
        String entradaDados = io.entradaDados(mensagemMenu);
        opcao = conversor.stringToInt(entradaDados);
    }
    
    public void avaliarOpcaoEscolhida(){
        switch (opcao) {
            case 1:
                String mensagemEntrada = "Digite o valor da Entrada";
                double valorEntrada = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                caixa.entrar(valorEntrada);
                break;
            
            case 2:
                String mensagemRetirada = "Digite o valor da Retirada";
                double valorRetirada = conversor.stringToDouble(io.entradaDados(mensagemRetirada));
                caixa.retirar(valorRetirada);
                break;
                
            case 3:
                String mensagemSaldo = "Saldo Atual " + caixa.getSaldo();
                io.saidaDados(mensagemSaldo);
                break;
                
            case 4:
                io.saidaDados("Finalizando Programa");
                System.exit(0);
                break;
                
            default:
                io.saidaDados("Opção Inválida");
                break;
        }
    }
    
}

