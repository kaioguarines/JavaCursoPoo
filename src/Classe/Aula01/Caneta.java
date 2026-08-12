package Classe.Aula01;

public class Caneta {
    public String modelo;
    public String cor;
    protected float ponta;
    protected int carga;
    protected boolean tampada;

    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta Tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! nao posso rabiscar");
        } else {
            System.out.println("Posso rabiscar");
        }
    }

    protected void tampar() {
        this.tampada = false;
    }

    protected void destampar() {
        this.tampada = true;
    }
}