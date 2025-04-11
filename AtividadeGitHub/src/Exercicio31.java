import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> nomes1 = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();
        ArrayList<String> nomes12 = new ArrayList<>();
        nomes1.add("Jose");
        nomes1.add("Robisclaiton");
        nomes1.add("Josefina");
        nomes2.add("Roberto");
        nomes2.add("Kataprima");
        int contador = 0;
        while ((contador< nomes1.size())||(contador<nomes2.size())) {
            if (contador < nomes1.size()) {
                nomes12.add(nomes1.get(contador));
            }
            if (contador < nomes2.size()) {
                nomes12.add(nomes2.get(contador));
            }
            contador++;
        }
        System.out.println(nomes12);
    }
}