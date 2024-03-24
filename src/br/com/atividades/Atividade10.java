package br.com.atividades;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Atividade10 extends BaseAtividades {
    protected Double tempo, velocidade, distancia, consumo;

    Scanner scanner = new Scanner(System.in);

    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public Atividade10() {
    }

    public void executar() {
        System.out.println("Insira o tempo de viagem: ");
        this.setTempo(scanner.nextDouble());

        System.out.println("Insira a velocidade média da viagem: ");
        this.setVelocidade(scanner.nextDouble());

        this.setDistancia(this.getTempo() * this.getVelocidade());

        this.setConsumo(this.getDistancia() / 12.00);

        DecimalFormat form = new DecimalFormat("#,##");
        this.consumo = Double.valueOf(form.format(getConsumo()));

        System.out.println("Distancia de: " + this.getDistancia());
        System.out.println("Consumo de: " + this.getConsumo());

        scanner.close();
    }

}
