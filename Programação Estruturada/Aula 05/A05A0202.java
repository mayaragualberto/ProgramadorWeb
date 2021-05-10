
//Implementar a função for no programa "A05A0102"
import java.util.Scanner;

public class A05A0202 {
    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
        for (int i = 1; i <= 10; i++) {
            if (i == numero) {
                System.out.println("Você acertou!");
                break;
            }
            System.out.println("O número " + i + " ainda não é o certo!");
        }
    }
}
