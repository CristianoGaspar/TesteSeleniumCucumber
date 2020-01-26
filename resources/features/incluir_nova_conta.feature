# language: pt
@incluirNovaConta
Funcionalidade: Inclir uma nova conta
  Sou um usuario logado
  Posso incluir novas contas

  Contexto: Acessar o sistema e incluir nova conta
    Dado estou logado no sistema
    E acesso a tela para incluir conta

  Esquema do Cenario: Validar incluir uma nova conta
    Quando incluo uma conta "<conta>"
    Então exibe a "<mensagem>"

    Exemplos: 
      | conta    | mensagem                           |
      | Telefone | Conta adicionada com sucesso!      |
      | Telefone | Já existe uma conta com esse nome! |
      |          | Informe o nome da conta            |
