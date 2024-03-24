package br.com.atividades;

import java.util.Scanner;

public class Atividade9 extends BaseAtividades {
    protected Double graus, fhar;

    Scanner sacanner = new Scanner(System.in);

    public Double getGraus() {
        return graus;
    }

    public void setGraus(Double graus) {
        this.graus = graus;
    }

    public Double getFhar() {
        return fhar;
    }

    public void setFhar(Double fhar) {
        this.fhar = fhar;
    }

    public Atividade9() {
    }

    @Override
    public void executar() {

        System.out.println("Insira os graus em centigrados: ");
        this.setGraus(sacanner.nextDouble());

        this.setFhar(((9 * this.getGraus()) + 160) / 5);

        System.out.println("A temperatura é: " + this.getFhar());

        sacanner.close();
    }
}
