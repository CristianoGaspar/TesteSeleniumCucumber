# language: pt
Funcionalidade: Criar um novo usuário

  Cenario: Incluir uma nova conta
    Dado que estou logado
    Quando crio uma nova conta de "boleto_bancario"
    Então recebo a mensagem de "Conta adicionada com sucesso!"
