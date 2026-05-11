package br.com.model.entity;

import java.time.LocalDate;

public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private String placa;
    private boolean ativo;
    private double combustivelAtual;
    private double quilometragem;
    private boolean veiculoAutomatico;
    private LocalDate ultimaManutenção;

    public Veiculo(int id, String marca, String modelo, String placa, boolean veiculoAutomatico) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ativo = true;
        this.combustivelAtual = 0;
        this.quilometragem = 0;
        this.veiculoAutomatico = veiculoAutomatico;
    }

    // Construtor padrão sem o id para gerar o veiculo inicial, posteriormente ele será adicionado no banco de dados, e pegará o id automático dele de lá
    public Veiculo(String marca, String modelo, String placa, boolean veiculoAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ativo = true;
        this.combustivelAtual = 0;
        this.quilometragem = 0;
        this.veiculoAutomatico = veiculoAutomatico;
        this.ultimaManutenção = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public boolean isVeiculoAutomatico() {
        return veiculoAutomatico;
    }

    public LocalDate getUltimaManutenção() {
        return ultimaManutenção;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        if (combustivelAtual < 0) {
            this.combustivelAtual = 0;
        } else {
            this.combustivelAtual = combustivelAtual;
        }
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setVeiculoAutomatico(boolean veiculoAutomatico) {
        this.veiculoAutomatico = veiculoAutomatico;
    }

    public void setUltimaManutenção(LocalDate ultimaManutenção) {
        this.ultimaManutenção = ultimaManutenção;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", ativo=" + ativo +
                ", combustivelAtual=" + combustivelAtual +
                ", quilometragem=" + quilometragem +
                ", veiculoAutomatico=" + veiculoAutomatico +
                ", ultimaManutenção=" + ultimaManutenção +
                '}';
    }
}
