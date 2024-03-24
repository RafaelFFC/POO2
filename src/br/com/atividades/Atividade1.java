package br.com.atividades;

import java.util.Scanner;

public class Atividade1 extends BaseAtividades {

    Scanner scanner = new Scanner(System.in);

    protected int valor1, valor2, soma;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public Atividade1() {
    }

    @Override
    public void executar() {

        System.out.println("Insira o primeiro valor: ");
        this.setValor1(scanner.nextInt());

        System.out.println("Insira o segundo valor: ");
        this.setValor2(scanner.nextInt());

        this.setSoma(this.getValor1() + this.getValor2());

        System.out.println("A soma de " + this.getValor1() + " + " + this.getValor2() + " é: " + this.getSoma());

        scanner.close();
    }

}
