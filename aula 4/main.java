import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*2) Crie e implemente uma classe PopulacaoBaratas que simule o crescimento de uma população de baratas.
O tamanho inicial da população de baratas é definido de forma Randômica. (pesquise o objeto Random...)
O método aumentaBaratas, simula a proporção que a população de baratas vai se multiplicar.
O método spray pulveriza as baratas com um inseticida e reduz a população em 10%.
O método getNumeroBaratas devolve o número atual de baratas.
Implemente também uma classe que simule uma cozinha que tenha uma população de baratas
Utilize a aumentaBaratas, utilize o spray, e imprima a contagem de baratas.
*/

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        PopulacaoBaratas populacaoBaratas = new PopulacaoBaratas();

        int option;
        do {
            try {
                System.out.println("//MENU//");
                System.out.println("1 - Vê numero da população de baratas");
                System.out.println("2 - Aumentar a populaçao de baratas");
                System.out.println("3 - Reduzir o numero de baratas");
                System.out.println("4 - Vê populção atual");
                System.out.println("5 - EXIT");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        populacaoBaratas.PopulacaoBaratas();
                        break;

                    case 2:
                        populacaoBaratas.aumentaBaratas();
                        break;

                    case 3:
                        populacaoBaratas.spray();
                        break;

                    case 4:
                        populacaoBaratas.getPopulacao();
                        break;

                    case 5:
                        break;
                }
            } catch (ArithmeticException e){
                throw new IllegalArgumentException("Tente novamente");
            }finally {
                System.out.println("Olhe a situação");
            }
        } while (option != 5);
    }
}
