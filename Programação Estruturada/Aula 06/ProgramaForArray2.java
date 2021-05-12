
//Leitura de um número pré determinado de valores
import java.util.Scanner;

public class ProgramaForArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores a digitar:");
        int[] valores = new int[input.nextInt()];
        System.out.println("Digite agora os valores:");
        for (int i = 0; i < 10; i++) {
            valores[i] = input.nextInt();
        }
        System.out.println("Valores digitados.");
        for (int i = 0; i < 10; i++) {
            System.out.println(valores[i]);
        }
    }
}
