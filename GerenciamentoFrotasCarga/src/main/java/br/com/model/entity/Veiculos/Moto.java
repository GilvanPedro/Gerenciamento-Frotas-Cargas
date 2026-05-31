package br.com.model.entity.Veiculos;

import br.com.model.enums.TamanhoMoto;

import java.time.LocalDate;

public class Moto extends VeiculoCarga {
    private TamanhoMoto tamanho;

    public Moto(int id, String marca, String modelo, String placa, boolean ativo, double combustivelAtual, double quilometragemTotal, boolean veiculoAutomatico, LocalDate ultimaManutencao, String descricao, double combustivelMaximo, double peso, double quilometroPorLitro) {
        super(id, marca, modelo, placa, ativo, combustivelAtual, quilometragemTotal, veiculoAutomatico, ultimaManutencao, descricao, combustivelMaximo, peso, quilometroPorLitro);
        this.tamanho = TamanhoMoto.gerarTamanho(peso);
    }

    public TamanhoMoto getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoMoto tamanho) {
        this.tamanho = tamanho;
    }
}
