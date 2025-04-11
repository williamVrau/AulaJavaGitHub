public class Exercicio04 {
    public static void main(String[] args) {
        int numFinal = 100;
        for (int i = 0; i <= numFinal; i++){
            if ((i%2)==0){
                System.out.println("O numero "+i+" é Par");
            }
            else {
                System.out.println("O numero "+i+" é Impar");
            }
        }
    }
}