public class Exercicio09 {
    public static void main(String[] args) {
        int fibonati = 10;
        int resultado1 = 0;
        int resultado2 = 1;
        for (int i = 0; i < fibonati; i++) {
            if ((i%2)==0){
                resultado1 = resultado1 + resultado2;
                System.out.println(resultado1);
            }
            else {
                resultado2 = resultado1 + resultado2;
                System.out.println(resultado2);
            }
        }
    }
}