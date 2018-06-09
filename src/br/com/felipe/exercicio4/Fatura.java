package br.com.felipe.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos = new ArrayList<Pagamento>();
    double totalPagamentos = 0.00;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public boolean isPago() {

        if(pagamentos == null){
            return false;
        }

        this.pagamentos.forEach(p -> this.totalPagamentos += p.getValor());
        return (this.totalPagamentos >= this.valor);

    }

}
