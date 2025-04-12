import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(1);
        lista.add(4);
        lista.add(1);
        lista.add(1);
        int variavel = 0;
        int numRepFo = 0;
        for (int i = 0; i < lista.size(); i++) {
            int numRep = 1;
            for (int j = i+1; j < lista.size() ; j++) {
                if ((lista.get(i)==(lista.get(j)))){
                    numRep++;
                }
            }
            if (numRep>numRepFo){
                numRepFo=numRep;
                variavel= lista.get(i);
            }
        }
        System.out.println("A variavel Modal é "+variavel+" e ele se repete por "+numRepFo);
    }
}