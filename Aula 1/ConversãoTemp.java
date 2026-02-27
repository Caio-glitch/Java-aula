import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a temperatura que está ai agora? ");
        double temp = sc.nextDouble();

        double conv = (temp * 9/5) + 32;

        System.out.printf("A temperatura em fahrenheit: %.2f\n", conv);

    }

} 
