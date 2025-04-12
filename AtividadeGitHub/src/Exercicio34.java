import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> nomes1 = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();
        ArrayList<String> nomes3 = new ArrayList<>();
        nomes1.add("Jose");
        nomes1.add("Robisclaiton");
        nomes1.add("Josefina");
        nomes2.add("Robisclaiton");
        nomes2.add("Roberto");
        nomes2.add("Josefina");
        nomes2.add("Kataprima");
        System.out.println(nomes1);
        System.out.println(nomes2);
        System.out.println(" ");
        for ( String name: nomes1){
            if (nomes2.contains(name)){
                System.out.println(name+" Contein nas duas Listas \n");
                nomes3.add(name);
            }
        }
        nomes1.removeAll(nomes3);
        System.out.println(nomes1);
        System.out.println(nomes2);
    }
}