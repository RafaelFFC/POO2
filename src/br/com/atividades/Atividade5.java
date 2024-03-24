package br.com.atividades;

import java.util.Scanner;

public class Atividade5 extends BaseAtividades {
    protected String nome, endereço;
    protected String telefone;

    Scanner scanner = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Atividade5() {
    }

    @Override
    public void executar() {
        System.out.println("Insira o seu nome: ");
        this.setNome(scanner.nextLine());

        System.out.println("Insira o seu endereço: ");
        this.setEndereço(scanner.nextLine());

        System.out.println("Insira o seu telefone: ");
        this.setTelefone(scanner.nextLine());

        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereço());
        System.out.println("Telefone: " + getTelefone());
    }

}
