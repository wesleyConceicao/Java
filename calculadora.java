package exercicios;
import java.util.*; // classe primitiva pra importar str

public class calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // essa porra aqui da entrada pro teclado
        short condicao;

        float  x, a, b ;
        System.out.println("--------------------------");
        System.out.println("--------CALCULADORA ------");
        System.out.println("--------------------------");
        System.out.println("1 - SOMAR:          ");
        System.out.println("2 - SUBTRAIR        ");
        System.out.println("3 - MULTIPLICAR     ");
        System.out.println("4 - DIVIDIR         ");
        System.out.println("0 - SAIR            ");
        System.out.println("--------------------------");

        System.out.print("O QUE VOCE DESEJA ?:");

        condicao = entrada.nextShort();

        switch (condicao) {

            case 0:
                System.out.println("----------------------------");
                System.out.println("     FIM DA CALCULADORA     ");
                System.out.println("----------------------------");
                break;

            case 1:
                System.out.println("------------SOMA-------------");
                System.out.println("digite os valores de A e B: ");
                System.out.println("----------------------------");
                System.out.print("Entre com os valores de A: ");
                a = entrada.nextFloat();
                System.out.print("Entre com os valores de B: ");
                b = entrada.nextFloat();

                x = a + b;

                System.out.printf("A soma é igual a %.2f", x);
                break;
            case 2:
                System.out.println("---------SUBTRAÇÃO----------");
                System.out.println("digite os valores de A e B: ");
                System.out.println("----------------------------");
                System.out.print("Entre com os valores de A: ");
                a = entrada.nextFloat();
                System.out.print("Entre com os valores de B: ");
                b = entrada.nextFloat();

                x = a - b;

                System.out.printf("O valor da subtração é  %.2f", x);
                break;
            case 3:
                System.out.println("-------MULTIPLICAÇÃO--------");
                System.out.println("digite os valores de A e B: ");
                System.out.println("----------------------------");
                System.out.print("Entre com os valores de A: ");
                a = entrada.nextFloat();
                System.out.print("Entre com os valores de B: ");
                b = entrada.nextFloat();

                x = a * b;

                System.out.printf("A multiplicação é igual a %.2f",x);
                break;
            case 4:
                System.out.println("----------DIVISÃO-----------");
                System.out.println("digite os valores de A e B: ");
                System.out.println("----------------------------");
                System.out.print("Entre com os valores de A: ");
                a = entrada.nextFloat();
                System.out.print("Entre com os valores de B: ");
                b = entrada.nextFloat();

                x = a / b;

                System.out.printf("A divisão é igual a %.2f",x);
                break;
            default:
                if (condicao > 4)
                    System.out.print("Opção invalida, por favor insira opções entre 0 e 4");
        }
    } // FIM DO METODO MAIN
} // FIM DA CLASSE
