import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExercicioExtra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean variavel = true;
        ArrayList<String> aFazer = new ArrayList<>();
        ArrayList<String> feitas = new ArrayList<>();
        while (variavel){
            System.out.println("===== LISTA DE TAREFAS =====\n" +
                    "1 - Adicionar nova tarefa\n" +
                    "2 - Listar tarefas\n" +
                    "3 - Marcar tarefa como concluída\n" +
                    "4 - Remover tarefa\n" +
                    "0 - Sair");
            int funcao = scanner.nextInt();
            scanner.nextLine();

            switch (funcao){
                case 0:
                    variavel = false;
                    break;
                case 1:
                    System.out.println("Digite a Tarefa");
                    aFazer.add(scanner.nextLine());
                    System.out.println("Tarefa Adicionada Com sucesso");
                    break;
                case 2:
                    System.out.println("Voce Tem essa Tarefas Na sua lista de a Fazer \n" +
                            ""+aFazer);
                    System.out.println("Voce Tambem essas Tarefas na sua lista de feitas \n" +
                            ""+feitas);
                    break;
                case 3:
                    System.out.println(aFazer);
                    System.out.println("digite o numero da Tarefa que voce gostaria de marcar como fazendo");
                    int tarefa = (scanner.nextInt()-1);
                    feitas.add(aFazer.get(tarefa));
                    aFazer.remove(tarefa);
                    System.out.println(feitas);
                    System.out.println("voce Moveu para a feitas");
                    break;
                case 4:
                    System.out.println(feitas);
                    System.out  .println("digite o numero da Tarefa que voce gostaria de excluir");
                    int tarefaRe = (scanner.nextInt()-1);
                    feitas.remove(tarefaRe);
                    System.out.println("Voce Removeu a Tareva");
            }
        }
    }
}