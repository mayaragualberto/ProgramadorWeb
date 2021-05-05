
//Receber dois números, verifica se são iguais ou qual é o maior. 
import java.util.Scanner;

public class A04A0301 {
    public static void main(String[] args) {
        float N1, N2;
        Scanner input = new Scanner(System.in);
        N1 = input.nextFloat();
        N2 = input.nextFloat();
        // Caso sejam iguais, imprimir a mensagem informando
        if (N1 == N2) {
            System.out.println("Os números são iguais.");
            // Caso sejam diferentes, imprimir o maior número.
        } else {
            if (N1 > N2) {
                System.out.println("O maior número é " + N1 + ".");
            } else {
                System.out.println("O maior número é " + N2 + ".");
            }
        }
    }
}
