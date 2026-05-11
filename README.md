# Sistema de Gerenciamento de Frotas de Cargas

## Descrição do Projeto

Este software é uma solução estruturada para a gestão operacional e financeira de frotas de transporte de carga. Desenvolvido em Java, o sistema integra regras de domínio complexas para administrar veículos e motoristas, permitindo a simulação de operações logísticas com foco em rentabilidade e controle técnico.

A aplicação automatiza processos críticos como o cálculo de coeficientes de carga por categoria de veículo e a simulação detalhada de viagens, permitindo prever o consumo de combustível, gastos operacionais e a margem de lucro líquido.

---

## Funcionalidades Principais

### Gestão de Frota e Veículos
O sistema oferece controle completo sobre diferentes categorias de veículos (Motos, Carros, Vans e Caminhões), gerenciando:
* Status operacional do veículo.
* Especificações técnicas de combustível e capacidade.
* Cálculos automáticos de capacidade técnica baseados na categoria.

### Gestão de Condutores
* Diferenciação hierárquica entre motoristas ativos e condutores em período de treinamento.
* Sistema de folha de pagamento dinâmica que aplica bônus de produtividade e regras de remuneração específicas para trainees.

### Simulador Logístico
Módulo dedicado à validação de viabilidade de rotas:
* Verificação de conformidade de carga máxima e autonomia de combustível.
* Projeção de custos e análise financeira de lucro antes do início da operação.

### Controle Financeiro e Indicadores
* Registro centralizado de despesas: manutenção, combustível, impostos (IPVA) e multas.
* Módulo de análise de desempenho com ranking de quilometragem e performance por unidade.

---

## Regras de Negócio e Algoritmos

* **Coeficiente de Carga (K):** Implementação de cálculos específicos para determinar a carga útil máxima suportada por cada modal.
* **Validação de Segurança:** Bloqueio de simulações em cenários de excesso de peso ou combustível insuficiente para o trajeto.
* **Cálculos Financeiros:**
    * Gastos Operacionais (G): Baseados na distância, peso e consumo médio.
    * Lucro Líquido (L): Resultado da receita bruta subtraída de todos os custos variáveis e fixos.
* **Integridade de Dados:** Validação rigorosa de identificadores únicos e placas no padrão Mercosul.

---

## Especificações Técnicas

* **Linguagem:** Java
* **Interface:** Java Swing (Interface gráfica intuitiva com tempo de resposta otimizado)
* **Arquitetura:** Orientação a Objetos com aplicação de Herança, Polimorfismo e Encapsulamento.
* **Persistência:** Integração com Banco de Dados Relacional (SQL).

---

## Instruções de Instalação e Execução

1. Certifique-se de possuir o Java Development Kit (JDK) instalado.
2. Configure a base de dados SQL conforme as especificações do sistema.
3. Execute a classe principal para iniciar a aplicação via Java Swing.

---
**Autor:** Gilvan Pedro
Estudante de Engenharia de Software – SENAI Goiás
