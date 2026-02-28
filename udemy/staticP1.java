import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static final double PI = 3.14159;

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio? ");
        double raio = sc.nextDouble();

        double c = circumferece(raio);

        double v = volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value : %.2f%n", PI);
    }

    public static double circumferece(double raio){
        return 2.0 * PI * raio ;
    }

    public static double volume (double raio){
        return 4 * PI * Math.pow(raio, 3) / 3.0;
    }

}
