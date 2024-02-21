import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args){
		Scanner meuScanner = new Scanner(System.in);
		System.out.println("Quantas vezes deseja testar? ");
		int C = meuScanner.nextInt();
		String nome;
		int N;
		for (int i = 0; i < C ; i++) {
			System.out.println("Quem irá tentar levantar? ");
			nome = meuScanner.next();
			System.out.println("Qual força em Newtons? ");
			N = meuScanner.nextInt();
			System.out.println("Conseguiu levantar? Y == Sim N == Não");
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
		meuScanner.close();
    }
	
}