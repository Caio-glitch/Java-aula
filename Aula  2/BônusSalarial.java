import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.print("Prazer:  " + name);
        System.out.println("Vamos descobrir o seu bônus");
        
        System.out.print("Me informe o seu salaraio: ");
        double salarioMensal =  sc.nextDouble();

        if(salarioMensal <= 1000){
            double bonus = salarioMensal * 0.10;
            System.out.println("Com o bônus seu salário será de: R$" + bonus);
        }else{
            double bonus = salarioMensal * 0.05;
            System.out.println("Com base no seu salário seu bônus será: R$" + bonus);
        }

        sc.close();

    }
}
