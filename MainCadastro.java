package banco_de_dados;
import java.util.*;

public class MainCadastro
{
    public static void main(String[] args) throws ClassNotFoundException
    {

        ClassConexaoSQL conecte = new ClassConexaoSQL();

        conecte.conectar();

        ClassTabelaPessoaFisica criarpf = new ClassTabelaPessoaFisica();

        System.out.println("=========================");
        criarpf.criartabela();

        String nome, sobrenome, cpf;

        Scanner entrada = new Scanner(System.in);
        System.out.println("inserindo dados na tabela");
        System.out.println("=========================");
        System.out.println("insira nome:");
        nome = entrada.next();
        System.out.println("insira Sobrenome: ");
        sobrenome = entrada.next();
        System.out.println("insira cpf: ");
        cpf = entrada.next();
        System.out.println("=========================");
        criarpf.inserirDados(nome,sobrenome,cpf);
        System.out.println("DADOS CADASTRADOS NA TABELA");
        System.out.println("=========================");
        criarpf.Buscardados();
        System.out.println("========================");
        System.out.println("FIM DA INSERÇÃO DE DADOS");
        System.out.println("========================");

        conecte.desconectar();

    }
}
