import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Digite o numero que deseja saber a tabuada:");

        int num_tabuada = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int result = num_tabuada * i;
            System.out.printf("%d x %d = %d\n", num_tabuada, i, result);
        }
        sc.close();
    }
}
