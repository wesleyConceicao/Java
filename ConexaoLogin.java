package ExercicioSwing.ConexaoDataBase;

import ExercicioSwing.ConexaoDataBase.conexao;
import ExercicioSwing.Main.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// EXECUTA OS COMANDO SQL

/**
 *
 * @author Wesley
 */
public class ConexaoLogin {
    
    public void inserirUsuario()
    {
        Connection conn = null;
        
        String sql = "INSERT INTO tbl_login (usuario, senha) VALUES (? , ?)";
        
        conn = conexao.getConexao();
        
        PreparedStatement stmt = null; 

        try 
        {
            
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, Login.usuario);
            stmt.setString(2, Login.senha);
            
            stmt.executeUpdate();
       
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"ERRO AO SALVAR NO BANCO DE DADOS. ERRO"+ " " + ex);
        }
        finally
        {
            conexao.closeConexao(conn, stmt);
        }
    }
    
     public void verificaUsuario()
    {
        
        Connection conn = null;
        
        String sql  = "SELECT * FROM tbl_login WHERE usuario =  '" + Login.usuario  + "'" ;
         
        conn = conexao.getConexao();
        
        PreparedStatement stmt = null; 

        ResultSet rs  = null;

        try
        {
            stmt = conn.prepareStatement(sql);
            
            rs = stmt.executeQuery();
                  
            rs.next();
                  
            String usuario1 = rs.getString("usuario");
                  
            String senha1 = rs.getString("senha");

            System.out.println(usuario1);

            if (usuario1.equals(Login.usuario) && senha1.equals(Login.senha));
            {
                  JOptionPane.showMessageDialog(null,  "USUARIO LIBERADO! !");
            }
                  
                  
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERRO AO SALVAR NO BANCO DE DADOS. ERRO: "+ " "+ ex);
        }
        finally
        {
            conexao.closeConexao(conn, stmt);
        }
    }
}
