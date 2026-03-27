import java.util.Random;

public class PopulacaoBaratas {
    private int populacao;

    public int PopulacaoBaratas(){
        Random rd = new Random();
        this.populacao = rd.nextInt(1000);
        System.out.println("A população tem: " + populacao + "Baratas");
        return populacao;
    }

    public int aumentaBaratas(){
       populacao = populacao * 2;
        System.out.println("A população aumentou: " + populacao + "baratas, a situação está seria");
        return populacao;
    }

    public int spray(){
        populacao = (int) (populacao * 0.10);
        System.out.println("A população diminui em 10%, agora tem: "+ populacao + "Baratas");
        return populacao;
    }

    public int getPopulacao(){
        return populacao;
    }
/*O método aumentaBaratas, simula a proporção que a população de baratas vai se multiplicar.
O método spray pulveriza as baratas com um inseticida e reduz a população em 10%.
O método getNumeroBaratas devolve o número atual de baratas.
 Utilize a aumentaBaratas, utilize o spray, e imprima a contagem de baratas.*/

}


