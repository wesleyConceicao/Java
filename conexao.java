package ExercicioSwing.ConexaoDataBase;
import java.sql.*;


/**
 *
 * @author Wesley
 */
public class conexao 
{
    
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConexao()
    {
  
        try
        {
            Class.forName(Driver);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
        }
        catch(ClassNotFoundException | SQLException ex)
        {
            throw new RuntimeException("ALGO DE ERRADO ACONTECEU NO BANCO DE DADOS" + ex);
        }
            
    }

    public static void closeConexao(Connection conn)
    {
        if(conn != null)
        {
            try
            {
                conn.close();
            }
            catch(SQLException ex)
            {
                throw new RuntimeException("ALGO DE ERRADO ACONTECEU NO BANCO DE DADOS" + ex);
            }
        }
    }
    
    
    public static void closeConexao(Connection conn, PreparedStatement stmt)
    {
        if (stmt != null)
        {
            try
            {
                stmt.close();
            }
            catch(SQLException ex)
            {
                throw new RuntimeException("ALGO DE ERRADO ACONTECEU NO BANCO DE DADOS" + ex);
            }
        }
        closeConexao(conn);
    }
    
    public static void closeConexao(Connection conn, PreparedStatement stmt, ResultSet rs)
    {
         if (rs != null)
        {
            try
            {
                rs.close();
            }
            catch(SQLException ex)
            {
                throw new RuntimeException("ALGO DE ERRADO ACONTECEU NO BANCO DE DADOS" + ex);
            }
        }
         closeConexao(conn,stmt);
    }
}
