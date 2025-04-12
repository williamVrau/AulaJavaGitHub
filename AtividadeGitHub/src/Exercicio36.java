import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        boolean isOrdenada = false;
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        ArrayList<Integer> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i))==(listaOrdenada.get(i))){
                isOrdenada = true;
            }
            else {
                isOrdenada = false;
            }
        }
        if (isOrdenada){
            System.out.println("A Lista esta Ordenada");
        }else {
            System.out.println("A lista Nao esta ordenada");
        }
    }
}