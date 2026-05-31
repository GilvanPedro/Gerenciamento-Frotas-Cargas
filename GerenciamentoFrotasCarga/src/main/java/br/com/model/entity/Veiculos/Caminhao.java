package br.com.model.entity.Veiculos;

import br.com.model.enums.TamanhoCaminhao;

import java.time.LocalDate;

public class Caminhao extends VeiculoCarga{
    private TamanhoCaminhao tamanho;

    public Caminhao(int id, String marca, String modelo, String placa, boolean ativo, double combustivelAtual, double quilometragemTotal, boolean veiculoAutomatico, LocalDate ultimaManutencao, String descricao, double combustivelMaximo, double peso, double quilometroPorLitro) {
        super(id, marca, modelo, placa, ativo, combustivelAtual, quilometragemTotal, veiculoAutomatico, ultimaManutencao, descricao, combustivelMaximo, peso, quilometroPorLitro);
        this.tamanho = TamanhoCaminhao.gerarTamanho(peso);
    }

    public TamanhoCaminhao getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoCaminhao tamanho) {
        this.tamanho = tamanho;
    }
}
