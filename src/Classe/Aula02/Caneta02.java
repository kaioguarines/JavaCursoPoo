package Classe.Aula02;

public class Caneta02 {
    public String modelo;
    public String cor;
    private boolean ponta;
    protected int carga;
    private boolean tampada;

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

    public void tampar() {
        this.tampada = false;
    }

    public void destampar() {
        this.tampada = true;
    }
}


