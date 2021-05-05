
//Receber uma nota e imprimir uma mensagem de acordo com a faixa da nota
import java.util.Scanner;

public class A04A0302 {
    public static void main(String[] args) {
        float Nota;
        Scanner input = new Scanner(System.in);
        Nota = input.nextFloat();
        if (Nota >= 0 && Nota <= 3) {
            System.out.println("Você precisa melhorar muito!");
        } else if (Nota > 3 && Nota < 7) {
            System.out.println("Você está quase conseguindo!");
        } else if (Nota >= 7 && Nota < 9) {
            System.out.println("Você conseguiu!");
        } else if (Nota >= 9) {
            System.out.println("Você conseguiu com distinção!");
        }
    }

}
