import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> listaAleatorios = new ArrayList<>();
        int tamanho = 10;
        while (tamanho>0){
            Integer numeroAleatorio = random.nextInt(0,100);
            if (!(listaAleatorios.contains(numeroAleatorio))){
                listaAleatorios.add(numeroAleatorio);
                tamanho--;
            }
        }
        System.out.println(listaAleatorios);
    }
}