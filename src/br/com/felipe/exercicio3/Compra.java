package br.com.felipe.exercicio3;

public class Compra {

    public double valor;
    public String cidade;

    Compra(double valor, String cidade){
        this.valor = valor;
        this.cidade = cidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
