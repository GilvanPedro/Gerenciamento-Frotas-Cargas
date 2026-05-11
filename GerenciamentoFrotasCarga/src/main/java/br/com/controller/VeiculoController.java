package br.com.controller;

import br.com.model.entity.*;
import br.com.model.enums.TipoVeiculo;
import br.com.util.ValidacaoPlaca;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    ValidacaoPlaca validacaoPlaca = new ValidacaoPlaca();
    private List<Veiculo> veiculos = new ArrayList<>();
    Veiculo novoVeiculo;

    // Adicionar Veiculo
    public String adicionarVeiculo(String marca, String modelo, String placa, boolean automatico, double combustivelMaximo, double peso, double kmPorLitro, TipoVeiculo tipoVeiculo){

        // Verificação da placa
        if(!validacaoPlaca.validarPlaca(placa)){
            return "Informe uma placa válida";
        }

        // Verificação de se as informações estão nulas
        if(!verificacaoNula(marca, modelo, placa, combustivelMaximo, kmPorLitro)){
            return "Verifique se as informações estão preenchidas corretamente";
        }

        // Verifica se o peso é válido
        if(peso<100){
            return "Adicione um peso válido";
        }

        // Valida se o Km/l é maior do que 0
        if(kmPorLitro<=0){
            return "Adicione uma quantidade de quilometros por litro válida";
        }

        switch (tipoVeiculo){
            case MOTO:
                novoVeiculo = new Moto(
                        marca,
                        modelo,
                        placa,
                        automatico,
                        combustivelMaximo,
                        peso,
                        kmPorLitro
                );
                break;
            case CARRO:
                novoVeiculo = new Carro(
                        marca,
                        modelo,
                        placa,
                        automatico,
                        combustivelMaximo,
                        peso,
                        kmPorLitro
                );
                break;
            case VAN:
                novoVeiculo = new Van(
                        marca,
                        modelo,
                        placa,
                        automatico,
                        combustivelMaximo,
                        peso,
                        kmPorLitro
                );
                break;
            case CAMINHAO:
                novoVeiculo = new Caminhao(
                        marca,
                        modelo,
                        placa,
                        automatico,
                        combustivelMaximo,
                        peso,
                        kmPorLitro
                );
                break;
            default:
                return "Tipo de veículo inválido";
        }

        veiculos.add(novoVeiculo);
        return "Veículo cadastrado com sucesso";
    }

    // Retornar a lista dos veículos
    public List<Veiculo> mostrarVeiculos(){
        return veiculos;
    }

    // Vai verificar algumas informações bases
    public boolean verificacaoNula(String marca, String modelo, String placa, double combustivelMaximo, double kmPorLitro){
        if (
                marca == null || marca.isBlank() ||
                modelo == null || modelo.isBlank() ||
                placa == null || placa.isBlank() ||
                combustivelMaximo <= 0 ||
                kmPorLitro <= 0
        ) return false;

        return true;
    }
}
