
//Utilização das funções lenght() e charAt()
import java.util.Scanner;

public class ProgramaString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = input.next();
        System.out.println("Inverso:");
        for (int i = nome1.length() - 1; i >= 0; i--) {
            System.out.println(nome1.charAt(i));
        }
    }
}
