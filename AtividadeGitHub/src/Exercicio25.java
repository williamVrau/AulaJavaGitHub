import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio25 {
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
        System.out.println(lista);
        ArrayList<Integer> listaMulti = new ArrayList<>();
        System.out.println("Digite o numero que voce quer multipicar tada valor da lista");
        Integer multiplicacao = scan.nextInt();

        for (Integer i : lista){
            listaMulti.add(i*multiplicacao);
        }
        System.out.println(listaMulti);
    }
}