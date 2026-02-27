import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int soma = 0;
        int numero;

        System.out.println("Digite números inteiros para somar (digite um negativo para sair):");

        numero = sc.nextInt();

        while (numero >= 0) {
            soma += numero;
            numero = sc.nextInt();
        }

        System.out.println("A soma total dos números positivos digitados é: " + soma);

        sc.close();

    }
}
