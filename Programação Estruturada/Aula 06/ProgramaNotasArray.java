
//Programa para ler as notas dos alunso de uma turma
import java.util.Scanner;

public class ProgramaNotasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas a serem lidas:");
        int quantidade = input.nextInt();
        double notas[] = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota de número " + i);
            notas[i] = input.nextDouble();
        }
    }
}
