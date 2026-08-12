package Classe.Aula02;

public class TestCaneta02 {
    static void main(String[] args) {
        Caneta02 c1 = new Caneta02();
        c1.modelo = "bic cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 50;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}

