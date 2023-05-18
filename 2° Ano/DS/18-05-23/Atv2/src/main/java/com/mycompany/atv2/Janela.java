package com.mycompany.atv2;
import java.awt.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.text.*;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    String cliente[] = {"Cliente Comum" , "Cliente Premium"};
    JList lista;
    JLabel titulo, rotuloNome, rotuloCPF, rotuloEmail, rotuloSenha, rotuloSenhaRep, rotuloCliente, rotuloAnotacao, textoCliente;
    JFormattedTextField campoCPF;
    JTextField campoNome, campoEmail;
    JPasswordField campoSenha, campoSenhaRep;
    MaskFormatter mascaraCPF;
    JButton salvar, cancelar;
            
    Janela(){
        super("Cadastro de Representante");
        Container tela = getContentPane();
        setLayout(null);
        setSize(800 , 500);
        setBackground(new Color(211, 211, 211));
        
        
        titulo = new JLabel("Cadastro de Representante");
        rotuloCPF = new JLabel("CPF * ");
        rotuloNome = new JLabel("Nome *");
        rotuloEmail = new JLabel("Email *");
        rotuloSenha = new JLabel("Senha *");
        rotuloSenhaRep = new JLabel("Repetir senha *");
        rotuloAnotacao = new JLabel("Campos marcados com * são obrigatórios");
        rotuloCliente = new JLabel("Cliente *");
        textoCliente = new JLabel("Selecione o Cliente");
     
        
        campoNome = new JTextField(20);
        campoSenha = new JPasswordField(14);
        campoEmail = new JTextField(20);
        campoSenhaRep = new JPasswordField(14);
        
        lista = new JList(cliente);
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
        salvar = new JButton("Salvar");
        cancelar = new JButton("Cancelar");
        
        
        titulo.setFont(new Font("Arial" , Font.BOLD, 20));
        
        titulo.setBounds(60,5,280,50);
        
        rotuloCPF.setBounds(60, 50, 50, 20);
        
        
        rotuloNome.setBounds(60, 100, 50, 20);
        campoNome.setBounds(60,125,500,20);
        
        rotuloEmail.setBounds(60, 150, 50, 20);
        campoEmail.setBounds(60, 175, 500, 20);
        
        rotuloSenha.setBounds(60, 200, 50, 20);
        campoSenha.setBounds(60, 225, 220, 20);
        
        rotuloSenhaRep.setBounds(60, 250, 250, 20);
        campoSenhaRep.setBounds(60, 275, 220, 20);
        
        rotuloCliente.setBounds(60, 300, 50, 20);
        painelRolagem.setBounds(60, 325, 500, 20);
        textoCliente.setBounds(80, 325, 180, 20);
        
       rotuloAnotacao.setBounds(60, 350, 250, 20);
        
       salvar.setBounds(250, 380, 100, 30);
       cancelar.setBounds(380, 380, 100, 30);
        
        try{
            mascaraCPF = new MaskFormatter("###.###.###-##");
            
            
            mascaraCPF.setPlaceholder("_");
            
        }catch(ParseException e){
            
        }
        
        campoCPF = new JFormattedTextField(mascaraCPF);

        campoCPF.setBounds(60, 75, 220, 20);

        
        salvar.setBackground(new Color(128,0,128));
        salvar.setForeground(new Color(255,255,255));
        
        cancelar.setBackground(new Color(255,255,255));
        cancelar.setForeground(new Color(128,0,128));
        
        setVisible(true);
        tela.add(titulo);
        tela.add(rotuloNome);
        tela.add(rotuloCPF);
        tela.add(rotuloSenha);
        tela.add(rotuloEmail);
        tela.add(rotuloSenhaRep);
        tela.add(rotuloAnotacao);
        tela.add(rotuloCliente);
        tela.add(textoCliente);
        
        tela.add(campoNome);
        tela.add(campoEmail);
        tela.add(campoCPF);
        tela.add(campoSenha);
        tela.add(campoSenhaRep);
        tela.add(lista);
        
        tela.add(salvar);
       tela.add(cancelar);
       
       tela.add(painelRolagem);
    }
}
