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

        // Verificação das informações principais
        if(!verificacoes(marca, modelo, placa, combustivelMaximo, kmPorLitro, peso)){
            return "Verifique se as informações estão preenchidas corretamente";
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

    // Edição de um veículo
    public String editarVeiculo(int id, String marca, String modelo, String placa, boolean automatico, double kmPorLitro, double combustivelMaximo, double peso){

        // Faz as principais verificações
        if(!verificacoes(marca, modelo, placa, combustivelMaximo, kmPorLitro, peso)){
            return "Verifique se as informações estão preenchidas corretamente";
        }

        // Edição do veículo
        for(Veiculo v: veiculos){
            if(id == v.getId()){
                v.setMarca(marca);
                v.setModelo(modelo);
                v.setPlaca(placa);
                v.setVeiculoAutomatico(automatico);

                if (v instanceof VeiculoCarga) {
                    VeiculoCarga carga = (VeiculoCarga) v;
                    carga.setQuilometroPorLitro(kmPorLitro);
                    carga.setCombustivelMaximo(combustivelMaximo);
                    carga.setPeso(peso);
                }

                return "veiculo editado com sucesso";
            }
        }

        return "Algo deu errado, verifique novamente as informaões e tente de novo";
    }

    // Excluir um Veiculo
    public String excluirVeiculo(int id){
        for(Veiculo v : veiculos){
            if(v.getId() == id){
                veiculos.remove(v);

                return "Veiculo removido com sucesso";
            }
        }
        return "Veiculo não encontrado";
    }

    // Retornar a lista dos veículos (temporário)
    public List<Veiculo> mostrarVeiculos(){
        return veiculos;
    }

    // Vai verificar algumas informações bases
    public boolean verificacoes(String marca, String modelo, String placa, double combustivelMaximo, double kmPorLitro, double peso){
        // Verifica se tem informação nula ou vazia
        if (
                marca == null || marca.isBlank() ||
                modelo == null || modelo.isBlank() ||
                placa == null || placa.isBlank() ||
                combustivelMaximo <= 0 ||
                kmPorLitro <= 0
        ) return false;

        // Verifica o km por litro
        if(kmPorLitro<=0) return false;

        // Verifica se o peso é maior que 0
        if(peso<=0) return false;

        // Verifica a placa
        if(!validacaoPlaca.validarPlaca(placa))return false;

        return true;
    }
}
