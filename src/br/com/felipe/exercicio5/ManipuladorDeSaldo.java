package br.com.felipe.exercicio5;

public class ManipuladorDeSaldo {

    public double saldo;
    private int milhas;

    ManipuladorDeSaldo(double saldo){
        this.saldo = saldo;
    }

    public void saca(double valorSaque){
        this.saldo -= valorSaque;
    }

    public void deposita(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void rende(double taxa){
        this.saldo = (this.saldo * taxa);
    }

    public void processaMilhas(double valor){
        this.milhas += (int)valor;
    }

    public int getMilhas(){
        return this.milhas;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
