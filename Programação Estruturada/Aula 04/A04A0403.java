
//Receber uma letra e informar um país com esta letra, se não tiver, dizer que não tem país que inicie com essa letra.
import java.util.Scanner;

public class A04A0403 {
    public static void main(String[] args) {
        String letra;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe uma letra maiúscula:\n");
        letra = input.next();
        switch (letra) {
            case "A":
                System.out.println("África do Sul.");
                break;
            case "B":
                System.out.println("Brasil.");
                break;
            case "C":
                System.out.println("Colômbia.");
                break;
            case "D":
                System.out.println("Dinamarca.");
                break;
            case "E":
                System.out.println("Egito.");
                break;
            case "F":
                System.out.println("França.");
                break;
            case "G":
                System.out.println("Grécia.");
                break;
            case "H":
                System.out.println("Holanda.");
                break;
            case "I":
                System.out.println("Itália.");
                break;
            case "J":
                System.out.println("Japão.");
                break;
            case "L":
                System.out.println("Líbia.");
                break;
            case "M":
                System.out.println("Marrocos.");
                break;
            case "N":
                System.out.println("Noruega.");
                break;
            case "O":
                System.out.println("Omã.");
                break;
            case "P":
                System.out.println("Paraguai.");
                break;
            case "Q":
                System.out.println("Quênia.");
                break;
            case "R":
                System.out.println("Romênia.");
                break;
            case "S":
                System.out.println("Suriname.");
                break;
            case "T":
                System.out.println("Turquia.");
                break;
            case "U":
                System.out.println("Ucrânia.");
                break;
            case "V":
                System.out.println("Vaticano.");
                break;
            case "X":
                System.out.println("Suriname.");
                break;
            case "Z":
                System.out.println("Zâmbia.");
                break;
            default:
                System.out.println("Não existe país que inicie com a letra informada.");
                break;
        }
    }
}