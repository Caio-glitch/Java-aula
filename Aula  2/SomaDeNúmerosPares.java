import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 100;
        int soma = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Numero Par: " + i);

                int numPar = i;

                soma += numPar;

                System.out.println(soma);


            }
        }
        sc.close();
    }
}
