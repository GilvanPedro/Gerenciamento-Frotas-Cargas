package br.com.entity;

import java.time.LocalDate;

public class Entregador extends Funcionario{
    private int quantidadeEntregasMes;

    public Entregador(int id, String nome, String cpf, String email, String telefone, double salario, boolean ativo, LocalDate dataAdmicao, int quantidadeEntregasMes) {
        super(id, nome, cpf, email, telefone, salario, ativo, dataAdmicao);
        this.quantidadeEntregasMes = quantidadeEntregasMes;
    }

    public int getQuantidadeEntregasMes() {
        return quantidadeEntregasMes;
    }

    public void setQuantidadeEntregasMes(int quantidadeEntregasMes) {
        this.quantidadeEntregasMes = quantidadeEntregasMes;
    }
}
