package br.com.felipe.exercicio2;

public class NotaFiscalDao implements  AcaoNotaFiscal{

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }

}
