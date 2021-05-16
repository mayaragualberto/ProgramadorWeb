
//Outra forma de comparar duas strings. Transforma em maiúsuculo e compara
import java.util.Scanner;

public class ProgramaEqualsUpperCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = input.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = input.next();
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
        System.out.println(nome1);
        System.out.println(nome2);
    }
}
