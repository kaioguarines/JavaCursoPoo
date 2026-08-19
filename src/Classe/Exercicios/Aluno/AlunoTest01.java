package Classe.Exercicios.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno01 Aluno01 = new Aluno01();
        Aluno01.setNome("Kaio");
        Aluno01.setIdade(18);
        Aluno01.nota1 = 4.0;
        Aluno01.nota2=2.0;
        Aluno01.nota3=3.0;
        System.out.println(Aluno01.getNome());
        System.out.println(Aluno01.getIdade());
        System.out.println(Aluno01.calcularMedia());
        System.out.println(Aluno01.verificarAprovacao());
    }
}
