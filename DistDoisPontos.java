package exercicios;
import java.util.*;
import java.math.*;

public class DistDoisPontos {

    public static void main(String[] args) {
        double saida,x1,y1,x2,y2;
        char condicao;

        Scanner entrada = new Scanner(System.in);


        while (true)
        {
            System.out.println("----------------------");
            System.out.println("Insira os pontos da P1");
            System.out.println("----------------------");

            System.out.print("  insira o valor de x1: ");
            x1 = entrada.nextDouble();
            System.out.print("  insira o valor de y1: ");
            y1 = entrada.nextDouble();
            //---------------------------------------------
            System.out.println("----------------------");
            System.out.println("Insira os pontos da P2");
            System.out.println("----------------------");

            System.out.print("  insira o valor de x2: ");
            x2 = entrada.nextDouble();
            System.out.print("  insira o valor de y2: ");
            y2 = entrada.nextDouble();

            saida = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

            System.out.println("--------------------------------");
            //--------------------------------------------------
            System.out.printf("A distancia entre dois pontos é: %.4f\n", saida);
            System.out.println("--------------------------------");
            System.out.print("deseja calcula de novo (Y/N): ");
            condicao = entrada.next().charAt(0);

            if (condicao == 'Y' )
            {
                System.out.println("----------------------------------");
                System.out.print('\n');
                continue;
            }
            if(condicao == 'N') {
                System.out.println("-------------------------------\n");
                System.out.println("---------FIM DO PROGRAMA-------\n");
                System.out.println("-------------------------------\n");
                break;
            }
            else if(condicao != 'Y' || condicao !='N')

                System.out.println("VALOR INVALIDO\n");
                break;

        }
    }
}
