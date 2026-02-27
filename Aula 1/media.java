import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        
        System.out.println("Digite o nome do aluno: ");
        String name = sc.nextLine();

        System.out.println("Digte a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        sc.nextDouble();
        
        double resultado = (nota1 + nota2 + nota3) / 3;
        
        if(resultado >= 7){
            System.out.println("O" + name+ "aluno foi Aprovado com: "+ resultado);
        }else{
            System.out.println("O" + name+ "aluno foi Reprovado" + resultado);

        }

        sc.close();

    }

} 
