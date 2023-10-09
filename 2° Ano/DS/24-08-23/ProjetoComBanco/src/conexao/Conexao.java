package conexao;

import javax.swing.JOptionPane;
import java.sql.*;

/*@author Pedro

Essa classe será responsável pela execução com o MySQL

Três métodos: Abertura conexão, fechamento conexão e execução de comandos SQL*/

 
public class Conexao {
    
    final private String driver = "com.mysql.jdbc.Driver"; //definição de driver MySQL para acesso aos dados
    final private String url = "jdbc:mysql://localhost/clientes"; //acesso ao bd clientes no servidor
    final private String usuario = "root"; //usuario MySQL 
    final private String senha = ""; //senha do MySQL
    private Connection conexao; //variavel que armazenará a conexão aberta;
    public Statement statement; //variável para exsecução dos comandos SQL dentro do ambiete Java
    public ResultSet resultset; //variável que armazenará o resultado da execução de um comando SQL
    
    //método para conetar com o banco de dados
    public boolean conecta(){
        boolean result = true;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida ", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver não localizado "+Driver, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada "+Fonte, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return result;
    }
    
    //método para desconectar com o banco de dados
    public void descontecta(){
        try{
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com o banco fechada", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException fecha){}//a conexão é encerrada
    }
    
    //método para executar querys em SQL
    public void executaSQL(String sql){
        try{
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException excecao){
             JOptionPane.showMessageDialog(null, "Erro no comando SQL \n ERRO:" +excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
