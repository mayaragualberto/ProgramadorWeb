public class JogoDaVelha {
    public static void main(String[] args) {
        int i = 0;
        // percorre todo o tabuleiro, nas nove posições:
        for (i = 0; i < 9; i++) {
            jogo();// chama a rotina jogo(), que desenha o tabuleiro
            if (i % 2 == 0) {
                jogar(2);
            } else {
                jogar(1);
            }
            // chama a rotina check (), para ver se alguém ganhou
            check();
            if (win == 1 || win == 2) {
                // sai do laço antes de completar o tabuleiro,
                // se alguém tiver vencido
                i = 10;
            }
        }
        // chama a rotina jogo(), para desenhar novamente o tabuleiro
        jogo();
        // verifica se houve vencedor
        System.out.println();
        if (win == 1 || win == 2) {
            // informa o vencedor
            System.out.println("Jogador " + win + " é o ganhador!");
        } else {
            // se não houve vencedor
            System.out.println("Não houve vencedor! O jogo foi empate!!");
        }
    }

    public static void check() {
        int i = 0;
        // verificando se houve vencedor na Horizontal:
        for (i = 0; i < 3; i++) {
            if (casa[i][0] == casa[i][1] && casa[i][0] == casa[i][2]) {
                if (casa[i][0] == 1)
                    win = 1;
                if (casa[i][0] == 2)
                    win = 2;
            }
        }
        // verificando se houve vencedor na Vertical:
        for (i = 0; i < 3; i++) {
            if (casa[0][i] == casa[1][i] && casa[0][i] == casa[2][i]) {
                if (casa[0][i] == 1)
                    win = 1;
                if (casa[0][i] == 2)
                    win = 2;
            }
        }
        // verificando se houve vencedor na Diagonal de cima para baixo:
        if (casa[0][0] == casa[1][1] && casa[0][0] == casa[2][2]) {
            if (casa[0][0] == 1)
                win = 1;
            if (casa[0][0] == 2)
                win = 2;
        }
        // verificando se houve vencedor na Diagonal de baixo para cima:
        if (casa[0][2] == casa[1][1] && casa[0][2] == casa[2][0]) {
            if (casa[0][2] == 1)
                win = 1;
            if (casa[0][2] == 2)
                win = 2;
        }
    }
}
