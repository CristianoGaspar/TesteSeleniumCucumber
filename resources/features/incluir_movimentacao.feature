# language: pt
@novaMovimentacao
Funcionalidade: Inserir uma movimentação de uma Conta
  Para gerar movimentações de Conta

  Esquema do Cenario: Validar inserir uma movimentação em uma Conta
    Dado que estou na tela de Bem vindo
    Então seleciono Criar uma movimentação
    Quando seleciono o tipo de "<movimentacao>"
    E devo informar os campos  "<dataMovimentacao>" e "<dataPagamento>"
    E informo os campos "<descricao>" e "<interessado>" e "<valor>"
    E seleciono o tipo de "<conta>" tipo de "<situacao>"
    E clico no botão Salvar
    Então exibe a mensagem "<mensagem>"

    Exemplos: 
      | movimentacao | dataMovimentacao | dataPagamento | descricao                   | interessado | valor  | conta    | situacaao |
      | Receita      | 01/10/2020       | 20/10/2020    | Movimentacao de extrato JAN | JOAO        | 150,00 | Telefone | Pago      |
