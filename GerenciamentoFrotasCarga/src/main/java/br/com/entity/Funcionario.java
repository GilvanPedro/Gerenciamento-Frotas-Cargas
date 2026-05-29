package br.com.entity;

import java.time.LocalDate;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private double salario;
    private boolean ativo;
    private LocalDate dataAdmicao;

    public Funcionario(int id, String nome, String cpf, String email, String telefone, double salario, boolean ativo, LocalDate dataAdmicao) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.salario = salario;
        this.ativo = ativo;
        this.dataAdmicao = dataAdmicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDate getDataAdmicao() {
        return dataAdmicao;
    }

    public void setDataAdmicao(LocalDate dataAdmicao) {
        this.dataAdmicao = dataAdmicao;
    }
}
