package Classe.Exercicios.Banco;

import java.lang.classfile.instruction.ReturnInstruction;

public class Conta {
    public int NumConta;
    protected String TipoConta;
    private String Dono;
    private double Saldo;
    private boolean Status;

    public int getNumConta() {
        return this.NumConta;
    }

    public void setNumConta(int NumConta) {
        this.NumConta = NumConta;
    }

    public String getTipoConta() {
        return this.TipoConta;
    }

    public void setTipoConta(String TipoConta) {
        this.TipoConta = TipoConta;
    }

    public String getDono() {
        return this.Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public double getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public boolean getStatus() {
        return this.Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public void Construtor() {
        this.Saldo = 0;
        this.Status = false;
    }

    public void abrirConta(String t) {
        if (t.equals("CC")) {
            setSaldo(50);
            setTipoConta(t);
            setStatus(true);
        } else if (t.equals("CP")) {
            setSaldo(150);
            setTipoConta(t);
            setStatus(true);
        } else System.out.println("Tipo de conta invalida");
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com Dinheiro!");
        } else if (getSaldo() < 0) {
            System.out.println("Voce esta negativado");
        } else setStatus(false);

        System.out.println("Conta fechada");
    }

    public void depositar() {

    }

    public void sacar() {

    }



    public void pagarMensal() {

    }
}


