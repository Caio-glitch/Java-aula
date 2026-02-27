import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random gerador = new Random();
        int numero;
        
        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = sc.nextInt();
            if (numero <= 0) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while (numero <= 0);

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 1);

        sc.close();
    }
}
