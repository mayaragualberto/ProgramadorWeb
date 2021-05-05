
//Receber um número e dizer se é par ou ímpar
import java.util.Scanner;

public class A04A0201 {
    public static void main(String[] args) {
        int Numero;
        Scanner input = new Scanner(System.in);
        Numero = input.nextInt();
        if (Numero % 2 == 0) {
            System.out.println("O número " + Numero + "é par.");
        } else {
            System.out.println("O número " + Numero + " é ímpar.");
        }
    }
}
