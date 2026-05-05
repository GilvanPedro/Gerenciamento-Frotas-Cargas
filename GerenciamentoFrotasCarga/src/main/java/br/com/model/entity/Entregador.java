package br.com.model.entity;

public class Entregador extends Funcionario{
    private boolean emTreinamento;
    private boolean disponivel;
    private int quantidadeEntregasNoMes;

    public Entregador(int id, String nome, String cpf, String email, String telefone, double salario, boolean emTreinamento, boolean disponivel, int quantidadeEntregasNoMes) {
        super(id, nome, cpf, email, telefone, salario);
        this.emTreinamento = emTreinamento;
        this.disponivel = disponivel;
        this.quantidadeEntregasNoMes = quantidadeEntregasNoMes;
    }

    public boolean isEmTreinamento() {
        return emTreinamento;
    }

    public void setEmTreinamento(boolean emTreinamento) {
        this.emTreinamento = emTreinamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getQuantidadeEntregasNoMes() {
        return quantidadeEntregasNoMes;
    }

    public void setQuantidadeEntregasNoMes(int quantidadeEntregasMes) {
        this.quantidadeEntregasNoMes = quantidadeEntregasMes;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", salario=" + getSalario() +
                ", ativo=" + isAtivo() +
                ", dataAdmissao=" + getDataAdmissao() +
                ", emTreinamento=" + emTreinamento +
                ", disponivel=" + disponivel +
                ", quantidadeEntregasMes=" + quantidadeEntregasNoMes +
                '}';
    }
}
