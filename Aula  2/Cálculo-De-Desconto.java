import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do produto: (1, 2 ou 3)");
        int codigo = sc.nextInt();
        double valor = 1000;
        double valorDes = 0;

        switch (codigo) {

            case 1:
                valorDes = valor - (valor * 0.1);
                System.out.println("Desconto: " + valorDes);
                break;

            case 2:
                valorDes = valor - (valor * 0.2);
                System.out.println("Desconto: " + valorDes);
                break;

            case 3:
                valorDes = valor - (valor * 0.3);;
                System.out.println("Desconto: " + valorDes);
                break;


        }
        sc.close();
    }
}
