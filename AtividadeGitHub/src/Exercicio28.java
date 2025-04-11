import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(11);
        lista.add(12);
        lista.add(13);
        lista.add(15);
        lista.add(17);
        int numeroTotal = 10;
        int somatotal = 0;
        for (int i = 0; i <= numeroTotal; i++) {
            double valor = Math.pow(i,2);
            System.out.println(i+"^2 = "+valor);
            somatotal += valor;
        }
        System.out.println("Valor Total Foi: "+somatotal);
    }
}