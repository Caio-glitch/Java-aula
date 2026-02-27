import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random gerador = new Random();

        int numeroSecreto = gerador.nextInt(100) + 1;

        int palpite;
        int tentativas = 0;

        
        System.out.println("--- BEM-VINDO AO JOGO DA ADIVINHAÇÃO ---");
        System.out.println("Já pensei em um número entre 1 e 100. Tente acertar!");
        
        do {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();
            tentativas++;
            
            if (palpite < numeroSecreto) {
                System.out.println("Dica: O número secreto é MAIOR.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Dica: O número secreto é MENOR.");
            } else {
                System.out.println("\n PARABÉNS! Você acertou em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSecreto);
        sc.close();
    }
}
