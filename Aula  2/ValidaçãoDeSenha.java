import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Random gerador = new Random();
        
        System.out.print("Digite a sua senha: ");
        String senha = sc.nextLine();
        
        String novaSenha;
        do {

            System.out.println("Confirme a senha: ");
            novaSenha = sc.nextLine();
            if (senha.equals(novaSenha)) {
                System.out.println("Sua senha foi cadastrada com sucesso: " + novaSenha);
            } else{
                System.out.println("Senha incorreta!");
            }
        } while (!senha.equals(novaSenha));
        sc.close();
    }
}
