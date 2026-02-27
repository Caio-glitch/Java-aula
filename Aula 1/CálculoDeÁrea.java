import java.util.Locale; 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o raio de um circulo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;

        double area = pi * (raio * raio);

        System.out.println("A area do circulo é: " + area);


        sc.close();

    }

}
