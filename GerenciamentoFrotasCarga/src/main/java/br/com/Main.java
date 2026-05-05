package br.com;

import br.com.model.entity.Caminhao;
import br.com.model.entity.Carro;
import br.com.model.entity.Entregador;
import br.com.model.entity.Moto;
import br.com.model.enums.TamanhoCarro;
import br.com.model.enums.TamanhoMoto;

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

        Carro carro = new Carro(
                1,
                "Toyota",
                "Corolla",
                "ABC1D23",
                true,
                50.0,
                1340.0,
                12.5
        );

        Moto moto = new Moto(
                2,
                "Honda",
                "CG 160",
                "XYZ9K88",
                false,
                15.0,
                120.0,
                35.0
        );

        Caminhao caminhao = new Caminhao(
                2,
                "Honda",
                "CG 160",
                "RBV8I82",
                false,
                15.0,
                15600,
                20.0
        );

        System.out.println(carro);
        System.out.println(moto);
        System.out.println(caminhao);
    }
}