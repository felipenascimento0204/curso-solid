package br.com.felipe.exercicio3;

public class TestaCalculadoraPrecos {

    public static void main(String[] args){

        Compra compra = new Compra(3000, "SAO PAULO");
        System.out.println(new CalculadoraDePrecos(new TabelaDePrecoPadrao(), new Frete()).calcula(compra));

    }

}
