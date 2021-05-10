//Verificar quantas vezes o programa será executado;
public class ProgramaFor2 {
    public static void main(String[] args) {
        String texto = "*";
        for (int i = 1; i < 10; i++) {
            System.out.println(texto);
            texto = texto + "*";
        }
    }
}
