package br.com.util;

import br.com.model.entity.Veiculo;

public class VerificacoesSimulacao {
    public boolean verificarCombustivel(double combustivelNecessario, Veiculo veiculo){
        if(veiculo.getCombustivelAtual() <= 0){
            veiculo.setCombustivelAtual(0);
            return false;
        }

        // Verifica se o combustivel necessário para fazer a simulacao é maior do que o combustivel atual
        if(combustivelNecessario>veiculo.getCombustivelAtual()) return false;
            
        return true;
    }

}
