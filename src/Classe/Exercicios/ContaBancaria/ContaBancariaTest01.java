package Classe.Exercicios.ContaBancaria;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        ContaBancaria01 conta01 = new ContaBancaria01();
        conta01.setTitular("Kaio Guarines");
        conta01.setNumero(2007);
        conta01.status();
        conta01.depositar(1);
        conta01.ativar();
        conta01.depositar(500);
        System.out.println("---------------------------");
        conta01.status();
        conta01.sacar(200);
        System.out.println("---------------------------");
        conta01.status();
        conta01.sacar(400);
        conta01.desativar();
        conta01.depositar(200);
        conta01.sacar(200);
        conta01.status();
    }
}
