package br.com.felipe.exercicio1;

public class CalculadoraDeSalario {

    //Coesão e o Single Responsibility Principle

    public static void main(String[] args){
        Funcionario dba = new Funcionario();
        dba.setCargo(Cargo.DBA);
        dba.setSalarioBase(4500);
        System.out.println(dba.getSalarioLiquido());
    }

    public double calculaDesconto(Funcionario funcionario) {
        return funcionario.getSalarioLiquido();
    }

}