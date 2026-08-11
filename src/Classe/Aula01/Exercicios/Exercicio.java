package Classe.Aula01.Exercicios;

import Classe.Aula01.Caneta;

public class Exercicio {
    String Marca;
    String Modelo;
    int Memoria;
    int MemoriaRam;
    int QuantasCam;
    double Valor;
    boolean ligado;
    void status(){
        System.out.println("Marca: "+ this.Marca );
        System.out.println("Modelo: "+ this.Modelo );
        System.out.println("Memoria: "+ this.Memoria+ "GB" );
        System.out.println("Memoroia Ram: "+ this.MemoriaRam+ "GB" );
        System.out.println("Quantidade Camera: "+ this.QuantasCam );
        System.out.println("Valor R$"+ this.Valor );
    }
    void ligado(){
        if (this.ligado == true) {
            System.out.println("EBA!! vou jogar");
        }else {
            System.out.println("Droga nao vou jogar agora!!");
        }
    }
}
