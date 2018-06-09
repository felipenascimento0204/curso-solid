package br.com.felipe.exercicio4;

import java.util.List;

public class ProcessadorDeBoletos {

    private Fatura fatura;
    private List<Boleto> boletos;

    ProcessadorDeBoletos(List<Boleto> boletos, Fatura fatura){
        this.boletos = boletos;
        this.fatura = fatura;
    }

    public void processa() {
        for(Boleto boleto : this.boletos) {
            this.fatura.getPagamentos().add(boleto.toPagamento());
        }
    }
}
