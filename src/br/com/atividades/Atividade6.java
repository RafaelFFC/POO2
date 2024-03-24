package br.com.atividades;

import java.util.Scanner;

public class Atividade6 extends BaseAtividades {
    protected Double saldo, reajuste;

    Scanner scanner = new Scanner(System.in);

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getReajuste() {
        return reajuste;
    }

    public void setReajuste(Double reajuste) {
        this.reajuste = reajuste;
    }

    public Atividade6() {
    }

    @Override
    public void executar() {
        System.out.println("Insira o saldo: ");
        this.setSaldo(scanner.nextDouble());

        this.setReajuste((this.getSaldo() * 0.02) + this.getSaldo());

        System.out.println("O novo saldo é de: " + this.getReajuste());
    }

}
