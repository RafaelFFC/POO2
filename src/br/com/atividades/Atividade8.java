package br.com.atividades;

import java.util.Scanner;

public class Atividade8 extends BaseAtividades {

    protected Double salario, percentual, reajuste;

    Scanner scanner = new Scanner(System.in);

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public Double getReajuste() {
        return reajuste;
    }

    public void setReajuste(Double reajuste) {
        this.reajuste = reajuste;
    }

    public Atividade8() {
    }

    public void executar() {

        System.out.println("Insira o seu salário atual: ");
        this.setSalario(scanner.nextDouble());

        System.out.println("Insira o percentular de reajuste: ");
        this.setPercentual(scanner.nextDouble());

        this.setReajuste(this.getSalario() + (this.getSalario() * (this.getPercentual() / 100)));

        System.out.println("O salário com reajuste é: " + this.getReajuste());

        scanner.close();
    }

}
