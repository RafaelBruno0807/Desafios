import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args){
		Scanner meuScanner = new Scanner(System.in);
		int C = meuScanner.nextInt();
		String nome;
		int N;
		for (int i = 0; i < C ; i++) {
			nome = meuScanner.next();
			N = meuScanner.nextInt();
			if (nome.equals("Thor")) System.out.println("Y");
			else System.out.println("N");
		}
		meuScanner.close();
    }
	
}