import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Me informe um numero desejado: ");
        int numero = sc.nextInt();

        int i = 1;

        while (i <= numero) {
            System.out.println(i);
            i++;
        }

        System.out.println("A contagem parou");

    }
}
