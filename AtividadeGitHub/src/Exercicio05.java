public class Exercicio05 {
    public static void main(String[] args) {
        int contador = 0;
        int numFinal = 100;
        while (contador<=numFinal){
            if ((contador%2)==0){
                System.out.println("O numero "+contador+" é Par");
            }
            else {System.out.println("O numero "+contador+" é Impar");
            }
            contador++;
        }
    }
}