import java.util.Scanner;

/*1) Crie uma classe Pessoa com os atributos nome, idade e cidade. Crie métodos para
exibir as informações e para alterar a cidade. Instancie 3 objetos diferentes e mostre as alterações.*/
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa("Caio",  "Vila Velha", 21);
        Pessoa p2 = new Pessoa("Ana", "Vitória", 25);
        Pessoa p3 = new Pessoa("João", "Serra", 30);

        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
        System.out.println("Esses dados são antes da alteraação");

        System.out.println("---------------------------------------------------------------");

        System.out.println("Agora vamos alterar somente a cidade");
        p1.alterarCidade("Cariacica");
        p2.alterarCidade("Ubu");
        p3.alterarCidade("Viana");

        System.out.println("Depois da Alteração");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();


    }
}
