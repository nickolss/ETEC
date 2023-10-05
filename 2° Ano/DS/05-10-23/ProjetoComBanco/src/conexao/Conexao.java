/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexao;

import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author nicks
 */
public class Conexao {
    final private String driver = "com.mysql.jdbc.Driver"; //definição de driver MySQL para acesso aos dados
    final private String url = "jdbc:mysql://localhost:3306/clientes?characterEncoding=utf8"; //acesso ao bd clientes no servidor
    final private String usuario = "root"; //usuario MySQL 
    final private String senha = ""; //senha do MySQL
    private Connection conexao; //variavel que armazenará a conexão aberta;
    public Statement statement; //variável para exsecução dos comandos SQL dentro do ambiete Java
    public ResultSet resultset; //variável que armazenará o resultado da execução de um comando SQL
    
    public boolean conecta(){
        boolean resultado = true;
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url , usuario , senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida" , "Mensagem do Programa" , JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Driver não localizado" + erro , "Mensagem do sistema" , JOptionPane.INFORMATION_MESSAGE);
            resultado = false;
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada" + erro , "Mensagem do programa" , JOptionPane.INFORMATION_MESSAGE);
            resultado = false;
        }
        
        return resultado;
    }
    
    public void desconecta(){
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com BD terminada" , "Mensagem do programa" , JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException erro) {
            
        }
    }
    
    public void executarSQL(String sql){
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na execução do comando \n" + erro , "Mensagem do Programa" , JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
