
//Recebe uma string e verifica as posições que possuem ponto.
import java.util.Scanner;

public class ProgramaStringPosicaoChar2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = input.next();
        char ponto = '.';
        int inicio = 0;
        int posicao = nome1.indexOf(ponto);
        System.out.println("Existe ponto nas posições:");
        while (inicio < nome1.length() && posicao != -1) {
            System.out.println(posicao);
            inicio = posicao + 1;
            posicao = nome1.indexOf(ponto, inicio);
        }
    }
}
