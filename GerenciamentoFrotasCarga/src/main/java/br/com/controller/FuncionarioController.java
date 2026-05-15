package br.com.controller;

import br.com.model.entity.Entregador;
import br.com.model.entity.Funcionario;
import br.com.util.ValidacaoEmail;
import br.com.util.VerificacaoCpf;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private List<Funcionario> funcionarios = new ArrayList<>();
    ValidacaoEmail validacaoEmail = new ValidacaoEmail();
    VerificacaoCpf verificacaoCpf = new VerificacaoCpf();

    // Adicionar Funcionario
    public String adicionarFuncionario(String nome, String cpf, String email, String telefone, double salario){
        if(!validacaoEmail.validarEmail(email)){
            return "Email inválido, siga o formato: exemplo@gmail.com";
        }
        if(!verificacaoCpf.verificarCpf(cpf)){
            return "Informe um CPF válido";
        }

        Funcionario funcionario = new Entregador(
                nome,
                cpf,
                email,
                telefone,
                salario
        );

        return "Funcionario adicionado com sucesso";
    }
}
