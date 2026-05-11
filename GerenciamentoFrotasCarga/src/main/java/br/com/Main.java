package br.com;

import br.com.controller.VeiculoController;
import br.com.model.entity.*;
import br.com.model.enums.TamanhoCarro;
import br.com.model.enums.TamanhoMoto;
import br.com.model.enums.TipoVeiculo;

public class Main {
    public static void main(String[] args) {

        Entregador entregador = new Entregador(
                1,
                "João Silva",
                "123.456.789-00",
                "joao@email.com",
                "11999999999",
                2500.0,
                false,
                true,
                20
        );

        System.out.println(entregador);

        entregador.setDisponivel(false);
        entregador.setQuantidadeEntregasNoMes(25);

        System.out.println("\nApós alterações:");
        System.out.println(entregador);

        VeiculoController veiculoController = new VeiculoController();

        veiculoController.adicionarVeiculo(
                "Honda",
                "CG 160",
                "XYZ9K88",
                false,
                15.0,
                120.0,
                35.0,
                TipoVeiculo.MOTO
        );


        veiculoController.mostrarVeiculo();
    }
}