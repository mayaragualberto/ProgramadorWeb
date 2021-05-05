
//Programa para receber 5 números e verificar se a soma destes números é múltiplo de 2
import java.util.Scanner;

public class A04A0101 {
    public static void main(String[] args) {
        float N1, N2, N3, N4, N5, Soma, Qtd;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite cinco números:");
        N1 = leitor.nextFloat();
        N2 = leitor.nextFloat();
        N3 = leitor.nextFloat();
        N4 = leitor.nextFloat();
        N5 = leitor.nextFloat();
        Soma = N1 + N2 + N3 + N4 + N5;
        if (Soma % 2 == 0) {
            System.out.println("Múltiplo de 2");
        }
    }
}