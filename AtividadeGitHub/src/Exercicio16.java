import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio16 {
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
        System.out.println("Numero para Pesquisa na Lista");
        Integer numb = scan.nextInt();
        if (lista.contains(numb)){
            System.out.println(" O numero existe na lista");
        }else {
            System.out.println("O numero nao existe na lista");
        }
    }
}