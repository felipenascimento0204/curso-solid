package br.com.felipe.exercicio4;

public class Boleto {

    private double valor;


    public Boleto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public Pagamento toPagamento(){
        return new Pagamento(this.valor, MeioDePagamento.BOLETO);
    }

}
