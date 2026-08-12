package Classe.Aula03;


public class Caneta03 {
    private String modelo;
    private String cor;
    private Float ponta;
    private boolean tampada;


    public  Caneta03() {//Este e o metodo Construtor
        this.modelo = "FabriCastell";
        this.tampada = true;
        this.cor = "black";
        this.ponta = 0.2f;
    }

    public String getModelo() {
        return this.modelo;
    }


    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public Float getPonta() {
        return this.ponta;
    }

    public void setPonta(Float p) {
        this.ponta = p;
    }

    public Boolean getTampada() {
        return this.tampada;
    }
    public void setTampada(Boolean t){
        this.tampada = t;
    }


    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada? " + this.getTampada());
    }


}
