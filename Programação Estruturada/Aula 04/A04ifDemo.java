import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite as quatro notas que você tirou:");
		nota1 = leitor.nextFloat();
		nota2 = leitor.nextFloat();
		nota3 = leitor.nextFloat();
		nota4 = leitor.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4)/4;
		if(media>=7) {
			System.out.println("O aluno foi aprovado!");
		}
		System.out.println("FIM!"); 
	}
}