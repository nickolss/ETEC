/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimc;

/**
 *
 * @author Admin
 */
public class MenuImc {
    private Imc imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private Situacao situacao;

    public MenuImc() {
        this.imc = new Imc();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
        this.situacao = new Situacao();
    }
    
    
    
    public void executarImc(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=4);
    }
    
    private void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção"
                + "\n 1 -Calcular IMC"
                + "\n 2 - Verificar Situação"
                + "\n 3 - Consultar Dados"
                + "\n 4 - Sair";
        
        String opcaoEscolhida = this.io.entradaDados(mensagemMenu);
        opcao = conversor.stringToInt(opcaoEscolhida);
    }
    
    private void avaliarOpcaoEscolhida(){
        switch (opcao) {
           case 1:
                imc.cadastrarDados(conversor.stringToDouble(io.entradaDados("Digite seu peso: ")), conversor.stringToDouble(io.entradaDados("Digite sua altura: ")));
                break;
            
            case 2:
                 situacao.verificarSituacao(imc);
                break;
                
            case 3:
                io.saidaDados("Seu peso é " + imc.getPeso() + "\n"
                        + "Sua altura é " + imc.getAltura());
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

