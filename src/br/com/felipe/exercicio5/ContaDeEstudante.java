package br.com.felipe.exercicio5;

public class ContaDeEstudante {

    private int milhas;

    private ManipuladorDeSaldo manipuladorDeSaldo;

    ContaDeEstudante(){
        this.manipuladorDeSaldo = new ManipuladorDeSaldo(0);
    }

    public void deposita(double valor) {
        this.manipuladorDeSaldo.deposita(valor);
        this.manipuladorDeSaldo.processaMilhas(valor);
    }

    public int getMilhas() {
        return this.manipuladorDeSaldo.getMilhas();
    }

}
