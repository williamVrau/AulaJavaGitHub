public class Exercicio06 {
    public static void main(String[] args) {
        int fatorial = 5;
        int resultado = 1;
        for (int i = fatorial; i>1;i--){
            resultado *=i;
        }
        System.out.println(resultado);
    }
}