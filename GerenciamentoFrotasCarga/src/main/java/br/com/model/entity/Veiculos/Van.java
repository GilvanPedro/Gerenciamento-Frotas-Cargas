package br.com.model.entity.Veiculos;

import br.com.model.enums.TamanhoVan;

import java.time.LocalDate;

public class Van extends  VeiculoCarga{
    private TamanhoVan tamanho;

    public Van(int id, String marca, String modelo, String placa, boolean ativo, double combustivelAtual, double quilometragemTotal, boolean veiculoAutomatico, LocalDate ultimaManutencao, String descricao, double combustivelMaximo, double peso, double quilometroPorLitro) {
        super(id, marca, modelo, placa, ativo, combustivelAtual, quilometragemTotal, veiculoAutomatico, ultimaManutencao, descricao, combustivelMaximo, peso, quilometroPorLitro);
        this.tamanho = TamanhoVan.gerarTamanho(peso);
    }

    public TamanhoVan getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoVan tamanho) {
        this.tamanho = tamanho;
    }
}
