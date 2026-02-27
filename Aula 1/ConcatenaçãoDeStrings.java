import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();
        
        System.out.println("Digte o seu sobrenome: ");
        String sobrenome = sc.nextLine();
        

        System.out.println("Seu nome " + name + "Sobrenome " + sobrenome);

        
        sc.close();
        
    }

}
