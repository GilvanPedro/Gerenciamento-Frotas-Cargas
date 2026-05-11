# Sistema de Gerenciamento de Frotas de Cargas

## Sobre o Projeto

Este projeto é uma solução robusta para o controle operacional e financeiro de frotas de transporte. Desenvolvido em Java, o sistema integra regras de domínio complexas para gerenciar veículos, motoristas e simular operações logísticas com foco em rentabilidade.

O software visa facilitar o dia a dia de empresas de logística, permitindo desde o cadastro técnico de veículos, com cálculos automáticos de coeficientes de carga, até a simulação detalhada de viagens, prevendo consumo de combustível, gastos operacionais e lucro líquido.

---

# Principais Funcionalidades

## Gestão de Frota (CRUD)

Controle completo de:

- Motos
- Carros
- Vans
- Caminhões

Incluindo:

- Status de atividade
- Tipos de combustível
- Informações técnicas dos veículos

## Controle de Motoristas

Gestão de condutores com diferenciação entre:

- Motoristas ativos
- Motoristas em treinamento

## Simulador de Transporte

Módulo responsável por:

- Validar carga máxima suportada
- Verificar combustível disponível
- Calcular consumo automaticamente
- Avaliar viabilidade financeira da rota

## Cálculo Automatizado de Salários

Folha de pagamento dinâmica considerando:

- Bônus por produtividade
- Regras específicas para trainees

## Monitoramento de Gastos

Registro e visualização de despesas relacionadas a:

- Manutenção
- Combustível
- IPVA
- Multas

## Painel de Visualização

Funcionalidades disponíveis:

- Ranking de quilometragem
- Detalhamento de performance por veículo

# Regras de Negócio Implementadas

## Coeficiente de Carga (K)

Cálculos específicos para determinar a carga máxima suportada por categoria de veículo.

## Validação de Segurança

O sistema bloqueia simulações em casos de:

- Excesso de peso
- Combustível insuficiente

## Fórmulas Financeiras

Algoritmos responsáveis pelo cálculo de:

- Gastos operacionais (G)
- Lucro líquido (L)

Baseados em:

- Distância percorrida
- Peso da carga
- Consumo médio do veículo

## Integridade de Dados

Validações implementadas:

- Placas únicas no padrão brasileiro
- IDs exclusivos

# Tecnologias Utilizadas

## Linguagem

- Java

## Interface Gráfica

- Java Swing

## Arquitetura

- Orientação a Objetos
    - Herança
    - Polimorfismo
    - Encapsulamento

## Persistência

- Banco de Dados Relacional

## Padrão de Interface

- Interface intuitiva
- Tempo de resposta inferior a 2 segundos