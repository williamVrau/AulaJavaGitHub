import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaSem = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(1);
        lista.add(4);
        lista.add(1);
        lista.add(1);
        for (Integer i : lista){
            if (!(listaSem.contains(i)))
                listaSem.add(i);
        }
        System.out.println(listaSem);
        for (int i = 0; i < listaSem.size(); i++) {
            int numRep = 0;
            for (int j = 0; j < lista.size(); j++) {
                if ((listaSem.get(i) == (lista.get(j)))) {
                    numRep++;
                }
            }
            System.out.println("O numero foi "+listaSem.get(i)+" E o Numero de Repticoes foi "+numRep);
        }
    }
}