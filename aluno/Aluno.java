public class Aluno {
    private double nota;
    private double nota2;
    private String name;

    public Aluno(String name, double nota, double nota2){
        this.name = name;
        this.nota = nota;
        this.nota2 = nota2;
    }

    public double mediaAluno(){
        double result =  (nota + nota2) / 2;
        if(result >= 7){
            System.out.println("Passou, com a media: " + result);
        }else{
            System.out.println("Não passou, ficou com " + result);
        }
        return result;
    }


}
