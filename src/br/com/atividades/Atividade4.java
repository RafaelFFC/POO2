package br.com.atividades;

import java.util.Scanner;

public class Atividade4 extends BaseAtividades {
    protected int valor1, ant, prox;

    Scanner scanner = new Scanner(System.in);

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getAnt() {
        return ant;
    }

    public void setAnt(int ant) {
        this.ant = ant;
    }

    public int getProx() {
        return prox;
    }

    public void setProx(int prox) {
        this.prox = prox;
    }

    public Atividade4() {
    }

    @Override
    public void executar() {
        System.out.println("Insira um valor inteiro: ");
        this.setValor1(scanner.nextInt());

        this.setProx(this.getValor1() + 1);
        this.setAnt(this.getValor1() - 1);

        System.out.println("Antecessor: " + this.getAnt());
        System.out.println("Sucessor: " + this.getProx());

        scanner.close();
    }
}
