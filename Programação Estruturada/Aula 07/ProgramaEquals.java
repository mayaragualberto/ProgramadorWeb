//Verificar se dois nomes são iguais

import java.util.Scanner;

public class ProgramaEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro nome:");
        String nome1 = input.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = input.next();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
        }
    }
}
