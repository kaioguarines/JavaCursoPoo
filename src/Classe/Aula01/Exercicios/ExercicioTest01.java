package Classe.Aula01.Exercicios;

public class ExercicioTest01 {
    static  void main(String[]  args ){
        Exercicio Celular = new Exercicio();
        Celular.Marca ="Samsung";
        Celular.Modelo ="S26 Ultra";
        Celular.Operacional = "Adroid";
        Celular.Memoria =1024;
        Celular.MemoriaRam =16;
        Celular.QuantasCam =5;
        Celular.Valor = 6.742;
        Celular.ligado = true;

        Celular.status();
        Celular.ligado();
        System.out.println("-------------------------------");
        Exercicio Cell = new Exercicio();
        Cell.Marca ="Iphone";
        Cell.Modelo ="17 Promax";
        Cell.Operacional = "Ios";
        Cell.Memoria =2048;
        Cell.MemoriaRam =12;
        Cell.QuantasCam =4;
        Cell.Valor = 8.154;
        Cell.ligado = false;

        Cell.status();
        Cell.ligado();
    }


}
