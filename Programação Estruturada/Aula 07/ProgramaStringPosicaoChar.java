
//Verificar se na string de entrada tem determinado caractere, se sim, imprimir a posição
import java.util.Scanner;

public class ProgramaStringPosicaoChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String nome1 = input.next();
        char ponto = '.';
        System.out.println("A posição do ponto no texto é:" + nome1.indexOf(ponto));
    }
}
