package exercicios;
import java.util.*;

public class ClassesCarro
{
    // atributo das classe
    //--------------------------------------
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String numeroChassi;
    //----------------------------------------

    //OBJETOS DA CLASSE CARRO
    public String getNumeroChassi()
    {
        return numeroChassi;
    }
    public void setNumeroChassi(String chassi)
    {
        this.numeroChassi = chassi;
    }
    public String getMarca()
    {
        return marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public String getCor()
    {
        return cor;
    }
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    public String getPlaca()
    {
        return placa;
    }
    public void setPlaca( String placa)
    {
        this.placa = placa;
    }
    //FUNÇÃO MAIN PARA EXECUTAR A CLASSE
    public static void main(String[] args)
    {
        System.out.println("--------------------------------");
        System.out.println("     COLETA DE DADOS DETRAN     ");
        System.out.println("--------------------------------");
        System.out.print(" ");

        pegachassi();
        System.out.println("--------------------------------");
        pegaPlaca();
        System.out.println("--------------------------------");
        pegaMarca();
        System.out.println("--------------------------------");
        pegaModelo();
        System.out.println("--------------------------------");
        pegaCor();
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("   FIM DA EXECUÇÃO DO PROGRAMA  ");
        System.out.println("--------------------------------");
    }
    // OS METODOS DA CLASSE
    public static void pegachassi()
    {
        Scanner entrada = new Scanner(System.in);
        ClassesCarro carro = new ClassesCarro();
        System.out.printf("O QUAL O NUMERO DO CHASSI?: ");
        String chassi = entrada.next();
        carro.setNumeroChassi(chassi);
        System.out.println("A NUMERAÇÃO DO CHASSI É: " + carro.getNumeroChassi());
    }
    public static void pegaMarca()
    {
        Scanner entrada = new Scanner(System.in);
        String marca;
        ClassesCarro carro = new ClassesCarro();
        System.out.printf("O QUAL A MARCA DO CARRO?: ");
        marca = entrada.next();
        carro.setMarca(marca);
        System.out.println("MARCA DO CARRO: " + carro.getMarca());

    }
    public static void pegaModelo()
    {
        Scanner entrada = new Scanner(System.in);
        String modelo;
        ClassesCarro carro = new ClassesCarro();
        System.out.printf("O QUAL O MODELO DO CARRO?: ");
        modelo = entrada.next();
        carro.setModelo(modelo);
        System.out.println("O SEU MODELO É: " + carro.getModelo());
    }
    public static void pegaCor()
    {
        Scanner entrada = new Scanner(System.in);
        String cor;
        ClassesCarro carro = new ClassesCarro();
        System.out.printf("O QUAL A COR DO CARRO?: ");
        cor = entrada.next();
        carro.setCor(cor);
        System.out.println("COR: " + carro.getCor());
    }
    public static void pegaPlaca()
    {
        Scanner entrada = new Scanner(System.in);
        String placa;
        ClassesCarro carro = new ClassesCarro();
        System.out.printf("O QUAL A NUMERAÇÃO DA PLACA?: ");
        placa = entrada.next();
        carro.setPlaca(placa);
        System.out.println("NUMERO DE PLACA: " + carro.getPlaca());
    }
}
