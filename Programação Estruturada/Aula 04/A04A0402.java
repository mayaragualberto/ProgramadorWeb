
//Programa que diz quando os números 9, 10 ou 11 são digitados. E informa caso não seja nenhum desses números.
//Alteração do programa A04A040301 sem os breaks
import java.util.Scanner;

public class A04A0401 {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        numero = input.nextInt();
        switch (numero) {
            case 9:
                System.out.println("O número é igual a 9.");
            case 10:
                System.out.println("O número é igual a 10.");
            case 11:
                System.out.println("O número é igual a 11.");
            default:
                System.out.println("O número não é nem 9, nem 10, nem 11.");
        }
    }
}