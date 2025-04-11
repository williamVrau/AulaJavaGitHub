import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> nomes1 = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();
        ArrayList<String> nomes12 = new ArrayList<>();
        nomes1.add("Jose");
        nomes2.add("Roberto");
        nomes1.add("Robisclaiton");
        nomes1.add("Josefina");
        nomes2.add("Kataprima");
        System.out.println(nomes1);
        System.out.println(nomes2);
        nomes12.addAll(nomes1);
        nomes12.addAll(nomes2);
        System.out.println(nomes12);
    }
}