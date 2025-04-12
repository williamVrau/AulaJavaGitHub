import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExercicioExtra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean variavel = true;
        while (variavel){
            System.out.println("Digite \n" +
                    "1 - Soma\n" +
                    "2 - Subtracao\n" +
                    "3 - Multiplicacao\n" +
                    "4 - Divisao\n" +
                    "5 - Para Sair\n"+
                    "Digite o numero da operacao que voce gostaria de efetuar ");
            int operacao = scanner.nextInt();
            System.out.println("Digite o Valor do primeiro numero: ");
            double variavel1 = scanner.nextDouble();
            System.out.println("Digite o Valor do Segundo numero");
            double variavel2 = scanner.nextDouble();

            switch (operacao){
                case 1:
                    System.out.println(" A Soma dos numeros que voce digitou é "+(variavel1+variavel2) );
                    break;
                case 2:
                    System.out.println("A Subtracao dos numeros que voce digiou é "+(variavel1-variavel2));
                    break;
                case 3:
                    System.out.println("A Multiplicacao dos numero que voce digitou é "+(variavel1*variavel2));
                    break;
                case 4:
                    System.out.println("A Divisao dos numeros que voce digiou é "+(variavel1/variavel2));
                    break;
                case 5:
                    variavel = false;
                    break;
                default:
                    System.out.println("O Numero digitado Nao condis com nada digite novamente");
            }
        }
        }
    }