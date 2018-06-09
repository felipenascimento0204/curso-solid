package br.com.felipe.exercicio2;

public class EnviadorDeEmail implements AcaoNotaFiscal{

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }

}
