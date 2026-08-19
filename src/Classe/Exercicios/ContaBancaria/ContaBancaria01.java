package Classe.Exercicios.ContaBancaria;

public class ContaBancaria01 {
    private String titular;
    private int numero;
    private float saldo;
    private boolean ativa;


    public ContaBancaria01(){
        this.titular = "Alexandre";
        this.numero = 1983;
        this.saldo = 0f;
        this.ativa = false;
    }


    public String  getTitular() { return  this.titular;}
    public void setTitular(String titular) {this.titular = titular;}

    public  int getNumero() { return  this.numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public float getSaldo() {return  this.saldo;}
    public void setSaldo(float saldo) {this.saldo = saldo;}

    public boolean getAtiva() {return this.ativa;}
    public void setAtiva(boolean ativa) {this.ativa = ativa;}

    public void status(){
        System.out.println("Sobre a Conta Senhor: ");
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero Da Conta: " + getNumero());
        System.out.println("Saldo " + getSaldo());
        System.out.println("Status Da Conta " + getAtiva());
    }

    public void depositar( float valor) {
        if (getAtiva()) {
            setSaldo(this.saldo + valor);
        }else System.out.println("Conta esta inativa");
    }
    public void sacar(float valor) {
        if (getAtiva()){
         if (valor <= getSaldo()){
             setSaldo(getSaldo() - valor);
         }else System.out.println("Saldo Insuficiente");
        }else System.out.println("Conta esta inativa");

    }
    public void ativar() {
        if (getAtiva()){
            System.out.println("conta esta ativa");
        }else setAtiva(true);
    }
    public void desativar() {
        if (!getAtiva()){
            System.out.println("conta esta desativada");
        }else setAtiva(false);
    }
}
