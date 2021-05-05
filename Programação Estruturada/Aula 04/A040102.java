
//Receber 3 comprimentos de madeira e verificar se podem formar um triângulo
import java.util.Scanner;

public class A040102 {
    public static void main(String[] args) {
        float P1, P2, P3;
        Scanner input = new Scanner(System.in);
        P1 = input.nextFloat();
        P2 = input.nextFloat();
        P3 = input.nextFloat();
        if ((P1 < (P2 + P3)) || (P2 < (P1 + P3)) || (P3 < (P1 + P2))) {
            System.out.println("Os três pedaços formam um triângulo.");
        }
    }
}
