import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        int N;
		// Parar o código quando chega o número de rodadas informado
        do {
            // Perguntar quantas rodadas
            do {
                System.out.print("O jogo terá quantas rodadas? ");
                N = meuScanner.nextInt();
                meuScanner.nextLine();
            } while (N < 1 || N > 10);

            // Loop para realizar as comparações
            for (int i = 0; i < N; i++) {
                System.out.println("Jogador 1 digite sua escolha: ");
                String jogador1 = meuScanner.next();
                System.out.println("Jogador 2 digite a sua escolha: ");
                String jogador2 = meuScanner.next();

				// Mostrar o resultado do joguin
                String resultado = determinarResultado(jogador1, jogador2);
                System.out.println(resultado);
            }

            meuScanner.nextLine();
			// Perguntar se quer continuar jogando para reiniciar
            System.out.print("Deseja jogar novamente? (s/n): ");
        } while (meuScanner.nextLine().equalsIgnoreCase("s"));

        meuScanner.close();
    }

	// Método para determinar o resultado do jogo
    public static String determinarResultado(String jogador1, String jogador2) {
        if (jogador1.equalsIgnoreCase("ataque")) {
            if (jogador2.equalsIgnoreCase("pedra")) {
                return "Jogador 1 venceu";
            } else if (jogador2.equalsIgnoreCase("ataque")) {
                return "Aniquilacao mutua";
            }
        } else if (jogador1.equalsIgnoreCase("pedra")) {
            if (jogador2.equalsIgnoreCase("papel")) {
                return "Jogador 1 venceu";
            } else if (jogador2.equalsIgnoreCase("ataque")) {
                return "Jogador 2 venceu";
            } else if (jogador2.equalsIgnoreCase("pedra")) {
                return "Sem ganhador";
            }
        } else if (jogador1.equalsIgnoreCase("papel")) {
            if (jogador2.equalsIgnoreCase("ataque")) {
                return "Jogador 1 venceu";
            } else if (jogador2.equalsIgnoreCase("papel")) {
                return "Ambos venceram";
            } else if (jogador2.equalsIgnoreCase("pedra")) {
                return "Jogador 2 venceu";
            }
        }

        return "Sem ganhador";
    }
}
