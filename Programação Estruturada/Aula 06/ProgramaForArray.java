//Leitura de 10 valores
import java.util.Scanner;
public class ProgramaForArray {
    public static void main(String[] args) {
        int[] valores = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i=1; i<=10; i++) 
            valores[i] = input.nextInt();
        }
    }
}
