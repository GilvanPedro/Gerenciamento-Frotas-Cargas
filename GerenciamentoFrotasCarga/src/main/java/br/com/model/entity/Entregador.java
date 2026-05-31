package br.com.model.entity;

import java.time.LocalDate;

public class Entregador extends Funcionario{
    private double quantidadeEntregasMes;

    public Entregador(int id, String nome, String cpf, String email, String telefone, double salario, boolean ativo, LocalDate dataAdmissao, double quantidadeEntregasMes) {
        super(id, nome, cpf, email, telefone, salario, ativo, dataAdmissao);
        this.quantidadeEntregasMes = quantidadeEntregasMes;
    }

    public double getQuantidadeEntregasMes() {
        return quantidadeEntregasMes;
    }

    public void setQuantidadeEntregasMes(double quantidadeEntregasMes) {
        this.quantidadeEntregasMes = quantidadeEntregasMes;
    }
}
