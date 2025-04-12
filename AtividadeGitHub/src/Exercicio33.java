import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<String> nomes1 = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();
        nomes1.add("Jose");
        nomes2.add("Roberto");
        nomes1.add("Robisclaiton");
        nomes2.add("Robisclaiton");
        nomes1.add("Josefina");
        nomes2.add("Josefina");
        nomes2.add("Kataprima");
        for ( String nome: nomes1){
            if (nomes2.contains(nome)){
                System.out.println(nome+" Contein nas duas Listas");
            }
        }
    }
}