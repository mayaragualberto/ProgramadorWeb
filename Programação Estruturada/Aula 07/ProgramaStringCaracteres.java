
//Imprime os caracteres de uma string de entrada em ordem inversa
import java.util.Scanner;

public class ProgramaStringCaracteres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = input.next();
        char[] caracteres = nome1.toCharArray();
        System.out.println("Inverso:");
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.println(caracteres[i]);
        }
    }
}
