import java.util.Scanner;
public class LendoNomes {

    public static void main(String[] args) {
        
        Scanner meuScanner = new Scanner(System.in);
        String[] lista = new String[10];

        for(int i=0 ; i < 10 ; i++){
        lista [i] = meuScanner.nextLine();
        }
        meuScanner.close();

        System.out.println(lista[2]);
        System.out.println(lista[6]);
        System.out.println(lista[8]);
    }
}