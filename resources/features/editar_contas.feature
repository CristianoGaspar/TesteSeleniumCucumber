# language: pt
@editarConta
Funcionalidade: Editar uma conta existente
  Sou um usuario logado
  Posso manipular as contas

  Contexto: Acessar o sistema e editar uma conta existente
    Dado acessei o sistema
    E acesso a tela de Listar contas

  Esquema do Cenario: Validar editar ou excluir uma conta
    Quando seleciono uma conta "<conta>"
    E clico na exclusão
    Então exibe a "<mensagem>"

    Exemplos: 
      | conta    | mensagem                    |
      | Telefone | Conta removida com sucesso! |
