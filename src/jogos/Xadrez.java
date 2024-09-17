package jogos;

public class Xadrez extends JogoDeTabuleiro{
    Xadrez(){

    //Implementa o construtor do JogoDeTabuleiro que por sua vez implementa
    // o construtor do jogo que precisa de inicialização da variavel i
    //Como não existe o proprio compilador apresenta erro do execução ao indicar
    // que não existe nenhum construtor default

        super(1);
        System.out.println("Construtor de xadrez");
    }

    public static void main(String[] args) {
        Xadrez x = new Xadrez();
    }
}
