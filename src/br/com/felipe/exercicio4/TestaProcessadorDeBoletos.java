package br.com.felipe.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class TestaProcessadorDeBoletos {

    public static void main(String[] args){

        List<Boleto> boletos = new ArrayList<Boleto>();
        boletos.add(new Boleto(3000));
        Fatura fatura = new Fatura("FELIPE DO NASCIMENTO", 2500);
        new ProcessadorDeBoletos(boletos, fatura).processa();

        System.out.println(fatura.isPago() ? "Fatura paga" : "Fatura não paga");

    }

}
