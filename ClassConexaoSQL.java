package banco_de_dados;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassConexaoSQL
{
 private Connection conexao;

    // conecta o banco de dados

 public boolean conectar() throws ClassNotFoundException
 {
     try
     {
         // COMANDO PARA ABRIR A BIBLIOTECA DO SQLITE
         Class.forName("org.sqlite.JDBC");
         // A URL DE CONEXÃO COM O BANCO DE DADOS
         String url = "jdbc:sqlite:C:/NetBeansProjects/JavaBasic/src/banco_de_dados/banco_sqlite.db";
         this.conexao = DriverManager.getConnection(url);
     }
     catch (SQLException e)
     {
         // CASO NÃO CONECTE AO BANCO DE DADOS
         System.out.println(e.getMessage());
         return false; // se não conectar retorna false

     }
     System.out.println("CONECTADO AO BANCO DE DADOS!");
     return true; // CASO CONECTE AO BANCO DE DADOS retorna true
 }
 public boolean desconectar()
 {
     try
     {
         if(this.conexao.isClosed() == false)
             this.conexao.isClosed(); // FECHA A CONEXÃO COM O BANCO DE DADOS
     }
     catch (SQLException e)
     {
         System.out.println(e.getMessage());
         return false; // CASO NÃO DESCONECTE RETORNA FALSO
     }
     System.out.println("DESCONECTADO AO BANCO DE DADOS!");
     return true; // CASO DESCONCETE RETORNA VERDADEIRO
 }

}
