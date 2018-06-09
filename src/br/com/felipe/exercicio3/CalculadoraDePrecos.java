package br.com.felipe.exercicio3;

public class CalculadoraDePrecos {

    // Classes abertas, Open Closed e Dependency Inversion Principles

    private TabelaDePreco tabelaDePreco;
    private MetodoDeEntrega metodoDeEntrega;

    CalculadoraDePrecos(TabelaDePreco tabelaDePreco, MetodoDeEntrega metodoDeEntrega){
        this.tabelaDePreco = tabelaDePreco;
        this.metodoDeEntrega = metodoDeEntrega;
    }

    public double calcula(Compra produto) {

        double desconto = this.tabelaDePreco.descontoPara(produto.getValor());
        double frete = this.metodoDeEntrega.calculaPara(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }

}
