package br.com.felipe.exercicio1;

public enum Cargo {

    DESENVOLVEDOR(new RegraDezOuVintePorcento()),
    DBA(new RegraQuinzeOuVinteCincoPorCento()),
    TESTER(new RegraQuinzeOuVinteCincoPorCento());

    public RegraSalario regraSalario;

    Cargo(RegraSalario regraSalario){
        this.regraSalario = regraSalario;
    }

    public RegraSalario getRegraSalario() {
        return regraSalario;
    }
}
