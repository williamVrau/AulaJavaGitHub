import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista1.add(2);
        lista1.add(4);
        lista1.add(6);
        lista2.add(3);
        lista2.add(5);
        lista2.add(7);
        for (int i = 0; i < ((lista1.size()+lista2.size())/2); i++) {
            lista3.add(lista1.get(i)*lista2.get(i));
        }
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);
    }
}