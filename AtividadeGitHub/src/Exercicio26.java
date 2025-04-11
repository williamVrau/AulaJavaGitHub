import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio26 {
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
        Integer numeroFinal = 100;
        for (Integer numeroPrimo=2;numeroPrimo<=numeroFinal;numeroPrimo++){
            boolean isPrimo = false;
            for (int i = 2; i<numeroPrimo;i++){
                if (!((numeroPrimo%i)==0)){
                    isPrimo = true;
                }
                else {
                    System.out.println("o Numero "+ numeroPrimo+" nao e primo ele é muiltiplo de "+ i );
                    isPrimo = false;
                    break;
                }}
            if (isPrimo){
                System.out.println("O Numero "+numeroPrimo+" e primo");}
        }
    }
}