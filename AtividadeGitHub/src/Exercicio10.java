import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite o Valor Para A Contagem Regresiva");
        int tempo = scan.nextInt();
        System.out.println(" ");
        for (int i = (tempo); i > 0; i--) {
            System.out.println(""+i);
            Thread.sleep(1000);
        }
        System.out.println("Feliz Navidad !!!");
    }
}