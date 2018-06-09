package br.com.felipe.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestaNotaFiscal {

    public static void main(String args[]){

        List<AcaoNotaFiscal> acoes = new ArrayList<>();
        acoes.add(new EnviadorDeEmail());
        acoes.add(new NotaFiscalDao());

        GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(acoes);
        geradorDeNotaFiscal.gera(new Fatura(1000, "Felipe do Nascimento"));


    }

}
