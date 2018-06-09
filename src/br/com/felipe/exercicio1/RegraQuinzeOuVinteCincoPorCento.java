package br.com.felipe.exercicio1;

public class RegraQuinzeOuVinteCincoPorCento implements RegraSalario {
    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
