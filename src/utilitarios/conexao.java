package utilitarios;
import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conexao
{
        // Conexão com Microsoft Acess
        //final private String driver = "sun.jdbc.odbc.JdbcOdbcDriver"; // string que conecta o netBeans ao driver do Banco desejado
        //final private String url = "jdbc:odbc:estoque"; //Url do banco de dados onde estoque é o nome do banco criado
        //final private String usuario = "";
        //final private String senha = "";
        
        /* Conexão com PostgreSQL (instale o postegresql, crie a table que deseja usar. Já no netbeans 
        clique com o botão direito em libraries (localizado dentro da pasta do seu projeto) >> add library e procure por Postgresql) */
        
        String driver = "org.postgresql.Driver"; // string que conecta o netBeans ao driver do Banco desejado
        String url = "jdbc:postgresql://localhost/estoque"; /* URL onde o banco de dados se encontra, localhost é o nome de usuário 
        padrão do postgresql, estoque é o nome do banco criado no Postresql */
        String usuario = "postgres"; //nome de usuario padrão do Postgresql
        String senha = "Moises@125"; //senha que você cadastrou no Postgresql  
        
        /* Conexão com Firebird */
        
        //String driver = "org.firebirdsql.jdbc.FBDriver"; 
        //String url = "jdbc:firebirdsql:localhost/3050:C:/Users/moises/Documents/NetBeansProjects/Estoque/Estoque/bancoDados/CIDADES.GDB"; 
        //String usuario = "SYSDBA"; 
        //String senha = "masterkey"; 
                        
        private Connection conexao;
        public Statement statement;
        public ResultSet resultset;
         
        
       public boolean conecta()
       {
            boolean result = true;
            try 
            {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, usuario, senha);
                JOptionPane.showMessageDialog(null,"conectou");
            }
            catch(ClassNotFoundException Driver) 
            {
               JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
               result = false;
            }
            catch(SQLException Fonte) 
            {
                JOptionPane.showMessageDialog(null,"Deu erro na conexão "+
                        "com a fonte de dados: "+Fonte);
                result = false;
            }
            return result; 
       }
       
       public void desconecta()
       {
            boolean result = true;
            try 
            {
                conexao.close();
                JOptionPane.showMessageDialog(null,"banco fechado");
            }
            catch(SQLException fecha) 
            {
                JOptionPane.showMessageDialog(null,"Não foi possivel "+
                        "fechar o banco de dados: "+fecha);
                result = false;
            }

       }
       
       public void executeSQL(String sql)
       {
            try 
            {
                statement = conexao.createStatement(
                ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            }
            catch(SQLException sqlex) 
            {
               JOptionPane.showMessageDialog(null,"Não foi possível "+
                       "executar o comando sql,"+sqlex+", o sql passado foi "+sql);
            }

       }
       
}
 