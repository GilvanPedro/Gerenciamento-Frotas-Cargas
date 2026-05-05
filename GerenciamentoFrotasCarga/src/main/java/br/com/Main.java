package br.com;

import br.com.model.entity.Carro;
import br.com.model.entity.Entregador;
import br.com.model.enums.TamanhoCarro;

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
        entregador.setQuantidadeEntregasMes(25);

        System.out.println("\nApós alterações:");
        System.out.println(entregador);

        Carro carro1 = new Carro(
                1,
                "Honda",
                "Civic",
                "XYZ-1234",
                TamanhoCarro.MEDIO,
                true,
                47.0,
                1250.0,
                13.5
        );

        Carro carro2 = new Carro(
                2,
                "Fiat",
                "Uno",
                "ABC-5678",
                TamanhoCarro.PEQUENO,
                false,
                40.0,
                900.0,
                15.0
        );

        Carro carro3 = new Carro(
                3,
                "Toyota",
                "Hilux",
                "DEF-9999",
                TamanhoCarro.GRANDE,
                true,
                80.0,
                2000.0,
                9.0
        );

        // Printando os carros
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

        // Teste extra
        System.out.println("\n=== TESTE DE AUTONOMIA ===");
        double autonomia = carro1.getCombustivelAtual() * carro1.getQuilometroPorLitro();
        System.out.println("Autonomia do Civic: " + autonomia + " km");
    }
}