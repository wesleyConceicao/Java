package banco_de_dados;

import java.sql.*;

public class ClassTabelaPessoaFisica
{

    // metodo para criar uma tabela
    public void criartabela()
    {
        String url = "jdbc:sqlite:C:/NetBeansProjects/JavaBasic/src/banco_de_dados/banco_sqlite.db";

        String sql = "CREATE TABLE IF NOT EXISTS tabela_pessoa_fisica (\n"
                +"id_pessoa_fisica integer PRIMARY KEY, \n"
                +"nome texr NOT NULL, \n"
                +"sobrenome text NOT NULL, \n"
                +"cpf text NOT NULL \n"
                +");";
        try
        {
            Connection conn = DriverManager.getConnection(url);

            Statement stt = conn.createStatement();
            stt.execute(sql);
        }
        catch (SQLException e)
        {
            System.err.println(e.getMessage());

        }
    }
    // metodo para estabelecer conexão com a tabela
    private Connection conectar()
    {
        String url = "jdbc:sqlite:C:/NetBeansProjects/JavaBasic/src/banco_de_dados/banco_sqlite.db";
        Connection conn = null;

        try
        {
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    // metodo para inserir dados na tabela
    public void inserirDados(String nome, String sobrenome, String cpf)
    {
        String sql = "INSERT INTO tabela_pessoa_fisica(nome, sobrenome, cpf) VALUES(?,?,?)";

        try
        {

            Connection conn = this.conectar();

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,nome);
            pstmt.setString(2,sobrenome);
            pstmt.setString(3,cpf);

            pstmt.executeUpdate();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void Buscardados()
    {
        String sqlbusca = "SELECT id_pessoa_fisica, nome, sobrenome, cpf FROM tabela_pessoa_fisica";

        try
        {
            Connection conn = this.conectar();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sqlbusca);

            while (result.next())
            {
                System.out.println(result.getInt(("id_pessoa_fisica"))+ " " + (result.getString("nome")) + " " +
                        result.getString("sobrenome") + " " + result.getString("cpf"));
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void alteraDados()
    {

    }
}
