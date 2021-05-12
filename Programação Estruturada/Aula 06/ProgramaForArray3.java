
//Outra forma de coletar valores
import java.util.Scanner;

public class ProgramaForArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores a digitar:");
        int[] valores = new int[input.nextInt()];
        System.out.println("Digite agora os valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = input.nextInt();
        }
        System.out.println("Valores digitados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
