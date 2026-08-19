package Classe.Exercicios.Aluno;

public class Aluno01 {
    String nome;
    int idade;
    double nota1;
    double nota2;
    double nota3;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return  idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) /3;
    }
    public String verificarAprovacao(){
        if (calcularMedia() >= 7){
            return "Parabens passou!!";
        }if (calcularMedia() >= 5){
            return "Esta de Recuperacao!!!";
        }else return "Reprovado!!!!";
    }

}
