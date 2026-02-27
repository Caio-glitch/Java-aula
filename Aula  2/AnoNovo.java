import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int anoNovo = 0;

        for(int i = 10; i >= anoNovo; i--) {
            System.out.println("Falta: " + i + " para o Ano Novo");
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        };
        sc.close();
    }
}
