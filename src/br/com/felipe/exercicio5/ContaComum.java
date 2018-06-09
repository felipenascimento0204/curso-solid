package br.com.felipe.exercicio5;

public class ContaComum {

    private ManipuladorDeSaldo manipuladorDeSaldo;

    public ContaComum() {
        this.manipuladorDeSaldo = new ManipuladorDeSaldo(0);
    }

    public void deposita(double valor) {
        this.manipuladorDeSaldo.deposita(valor);
    }

    public void saca(double valor) {
        this.manipuladorDeSaldo.saca(valor);
    }

    public void rende() {
        this.manipuladorDeSaldo.rende(0.01);
    }

    public double getSaldo() {
        return this.manipuladorDeSaldo.getSaldo();
    }

}
