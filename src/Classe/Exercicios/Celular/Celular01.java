package Classe.Exercicios.Celular;

public class Celular01 {
    private String marca;
    private String modelo;
    private int armazenamento;
    private boolean ligado;

    public Celular01() {
        this.marca = "xiaomi";
        this.modelo = "redmi note 9 pro";
        this.armazenamento = 120;
        this.ligado = false;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return this.armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void ligar() {
        if (getLigado()) {
            System.out.println("O celular já está ligado.");
        } else {
            setLigado(true);
        }
    }
    public void desligar() {
        if (!getLigado()) {
            System.out.println("O Celular esta desligado");
        } else {
            setLigado(false);
        }
    }



    public void status(){
        System.out.println("Sobre o celular");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Armazenamento: " + this.getArmazenamento());
        System.out.println("Ligado: " + this.getLigado());
    }

}
