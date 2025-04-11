public class Exercicio08 {
    public static void main(String[] args) {
        int numeroPrimo = 90;
        boolean isPrimo = false;

        for (int i = 2; i<numeroPrimo;i++){
               if (!((numeroPrimo%i)==0)){
                isPrimo = true;
            }
            else {
                System.out.println("o Numero nao e primo ele é muiltiplo de "+ i );
                isPrimo = false;
                break;
            }
        }
        if (isPrimo){
            System.out.println("Numero e primo");
        }
    }
}