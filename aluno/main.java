/*5) Crie uma classe Aluno com os atributos nome e notas (lista de notas). Crie métodos para calcular a média e
exibir se o aluno está aprovado (média ≥ 7). Instancie 3 alunos e mostre os resultados.*/
public class Main{
    public static void main(String[] args){
        Aluno a1 = new Aluno("João", 8, 9);
        Aluno a2 = new Aluno("Arthur", 9, 7);
        Aluno a3 = new Aluno("Danilo", 3, 10);

        a1.mediaAluno();
        a2.mediaAluno();
        a3.mediaAluno();
    }
}
