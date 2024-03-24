package br.com.atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade3 extends BaseAtividades {
    protected Double valor1, valor2, valor3;
    protected Double media;

    Scanner scanner = new Scanner(System.in);

    public Double getValor1() {
        return valor1;
    }

    public void setValor1(Double valor1) {
        this.valor1 = valor1;
    }

    public Double getValor2() {
        return valor2;
    }

    public void setValor2(Double valor2) {
        this.valor2 = valor2;
    }

    public Double getValor3() {
        return valor3;
    }

    public void setValor3(Double valor3) {
        this.valor3 = valor3;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Atividade3() {
    }

    @Override
    public void executar() {

        System.out.println("Insira o primero valor: ");
        this.setValor1(scanner.nextDouble());

        System.out.println("Insira o segundo valor: ");
        this.setValor2(scanner.nextDouble());

        System.out.println("Insira o terceiro valor: ");
        this.setValor3(scanner.nextDouble());

        this.setMedia((this.getValor1() * this.getValor2() * this.getValor3()) / 3);

        DecimalFormat form = new DecimalFormat("#,##");
        this.media = Double.valueOf(form.format(getMedia()));

        System.out.println("A media dos três valores é: " + this.getMedia());

        scanner.close();
    }

}
