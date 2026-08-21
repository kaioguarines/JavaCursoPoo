package Classe.Exercicios.Aluno;

public class AlunoTest01 {
    public static void main(String[] args) {
        Aluno01 Aluno01 = new Aluno01();
        Aluno01.setNome("Kaio");
        Aluno01.setIdade(18);
        Aluno01.setNota1(3.2);
        Aluno01.setNota2(2.5);
        Aluno01.setNota3(3.5);
        System.out.println(Aluno01.getNome());
        System.out.println(Aluno01.getIdade());
        System.out.println(Aluno01.calcularMedia());
        System.out.println(Aluno01.verificarAprovacao());
    }
}
