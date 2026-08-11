package Classe.Aula01;

public class CanetaTest01 {
    static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Red";
        c1.ponta = 0.3f;
        c1.carga = 90;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "MACOS";
        c2.cor = "Black";
        c2.ponta = 0.5f;
        c2.carga = 50;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }

}
