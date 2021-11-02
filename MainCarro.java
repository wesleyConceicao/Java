package exercicios;
import exercicios.ClassesCarro;
import exercicios.heranca;

import java.util.*;
import java.util.regex.Pattern;

public class MainCarro extends heranca
{
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
        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("   FIM DA EXECUÇÃO DO PROGRAMA  ");
        System.out.println("--------------------------------");
    }
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
        marca = entrada.next(Pattern.compile("\s"));
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
