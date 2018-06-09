package br.com.felipe.exercicio3;

public class Frete implements  MetodoDeEntrega{

    public double calculaPara(String cidade) {
        if("SAO PAULO".equals(cidade.toUpperCase())) {
            return 15;
        }
        return 30;
    }

}
