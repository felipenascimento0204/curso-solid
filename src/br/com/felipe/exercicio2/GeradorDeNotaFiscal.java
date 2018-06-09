package br.com.felipe.exercicio2;

import java.util.List;

public class GeradorDeNotaFiscal {

    //Acoplamento e estabilidade

    private List<AcaoNotaFiscal> acoes;

    public GeradorDeNotaFiscal( List<AcaoNotaFiscal> acoes) {
        this.acoes = acoes;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        this.acoes.forEach(f -> f.executa(nf));

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }

}
