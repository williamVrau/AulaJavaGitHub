import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        Integer numeroFinal = 100;
        Integer numeroInicial = 50;
        int totalPrimos = 0;
        for (Integer numeroPrimo= numeroInicial;numeroPrimo<=numeroFinal;numeroPrimo++){
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
                System.out.println("O Numero "+numeroPrimo+" e primo");
                totalPrimos++;
           }
        }
        System.out.println("O Numero Total De Primos è "+totalPrimos);
    }
}