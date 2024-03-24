package br.com.atividades;

import java.util.Scanner;

public class Atividade7 extends BaseAtividades {

    protected Double base, altura;
    protected Double perimetro, area;

    Scanner scanner = new Scanner(System.in);

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Atividade7() {
    }

    @Override
    public void executar() {
        System.out.println("Insira a  base do triângulo: ");
        this.setBase(scanner.nextDouble());

        System.out.println("Insira a altura do triângulo: ");
        this.setAltura(scanner.nextDouble());

        this.setPerimetro(this.getBase() + this.getAltura());
        this.setArea(this.getBase() * this.getAltura());

        System.out.println("O perímetro do triângulo é: " + this.getPerimetro());

        System.out.println("A área do triângulo é: " + this.getArea());

        scanner.close();
    }

}
