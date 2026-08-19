package Classe.Exercicios.Celular;

public class TestCelular01 {
    public static void main(String[] args) {
        Celular01 c1 = new Celular01();
        c1.setModelo("S26 ultra");
        c1.setMarca("Samsung");
        c1.setArmazenamento(256);
        c1.ligar();
        c1.status();
        c1.ligar();
        c1.status();
        c1.desligar();
        c1.status();
        c1.desligar();
    }
}
