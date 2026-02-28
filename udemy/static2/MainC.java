import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new  Calculator();

        System.out.println("Digite o valor do raio? ");
        double raio = sc.nextDouble();

        double c = calc.circumferece(raio);

        double v = calc.volume(raio);
        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value : %.2f%n", calc.PI);
    }



}
