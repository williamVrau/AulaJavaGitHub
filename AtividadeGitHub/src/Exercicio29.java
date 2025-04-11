import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio29 {
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
        System.out.println("Digite a Palavra que voce gostaria de verificar se e ou nao um Palidromo: ");
        String palavra = scan.nextLine();
        char[] palindromo = palavra.toCharArray();
        char[] omordnilap = new char[palindromo.length];
        int  contador = 0;
        for (int i = (palindromo.length-1);i>=0;i--) {
        omordnilap[i] = palindromo[contador];
            contador++;
        }
        for (int i = 0; i < palindromo.length; i++) {
            if (palindromo[i] != omordnilap[i]) {
                System.out.println("nao e um palindormo");
                return;
            }
        }
        System.out.println("E um Palindromo");
    }
}