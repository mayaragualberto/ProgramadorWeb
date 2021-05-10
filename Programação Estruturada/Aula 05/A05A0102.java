
//Inserir número e verificar se é igual ao gerado aleatoriamente pelo programa
import java.util.Scanner;

public class A05A0102 {
    public static void main(String[] args) {
        long numero = Math.round(Math.random() * 10);
        long chute;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10");
        chute = input.nextLong();
        while (numero != chute) {
            System.out.println("Digite um número entre 1 e 10");
            chute = input.nextLong();
        }
        System.out.println("Você acertou!");
    }

}
