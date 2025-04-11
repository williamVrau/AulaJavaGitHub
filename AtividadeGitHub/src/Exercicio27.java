import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio27 {
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
        int finalFibonati = 100;
        int resultado1 = 0;
        int resultado2 = 1;
        int contador = 1;

        while (resultado1<finalFibonati&&resultado2<finalFibonati){
            if ((contador%2)==0){
                resultado1 = resultado1 + resultado2;
                System.out.println(resultado1);
            }
            else {
                resultado2 = resultado1 + resultado2;
                System.out.println(resultado2);
            }
            contador++;
        }
    }
}