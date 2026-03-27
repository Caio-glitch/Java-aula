import java.util.Scanner;

public class Pessoa {
    private String name;
    private int idade;
    private String cidade;
    Scanner sc = new Scanner(System.in);

    public  Pessoa(String name, String cidade, int idade){
        this.name = name;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String name(){
        return name;
    }
    public int idade(){
        return idade;
    }
    public String getCidade(){
        return cidade ;
    }

    public String setCidade(){
        this.cidade = cidade;
        System.out.println("Pode alterar a cidade: ");
        String newCity = sc.nextLine();
        return newCity;
    }

    public void alterarCidade(String novaCidade) {
        this.cidade = novaCidade;
    }

    public void exibirInformacoes(){
        System.out.println("Nome:" + name + " Cidade:" +cidade+ " Idade:" + idade);
    }

}

/*nome, idade e cidade.
* Crie métodos para
exibir as informações e para alterar a cidade.*/
