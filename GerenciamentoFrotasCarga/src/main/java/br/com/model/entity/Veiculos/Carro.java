package br.com.model.entity.Veiculos;

import br.com.model.enums.TamanhoCarro;

import java.time.LocalDate;

public class Carro extends VeiculoCarga {
    private TamanhoCarro tamanho;

    public Carro(int id, String marca, String modelo, String placa, boolean ativo, double combustivelAtual, double quilometragemTotal, boolean veiculoAutomatico, LocalDate ultimaManutencao, String descricao, double combustivelMaximo, double peso, double quilometroPorLitro) {
        super(id, marca, modelo, placa, ativo, combustivelAtual, quilometragemTotal, veiculoAutomatico, ultimaManutencao, descricao, combustivelMaximo, peso, quilometroPorLitro);
        this.tamanho = TamanhoCarro.gerarTamanho(peso);
    }

    public TamanhoCarro getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoCarro tamanho) {
        this.tamanho = tamanho;
    }
}
