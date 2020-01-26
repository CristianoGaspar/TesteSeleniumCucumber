# language: pt

@novoUsuario
Funcionalidade: Inserir novo usuário
  Para logar no sistema
  Ter acesso as funcionalidades

  Esquema do Cenario: Validar inserir usuario informando dados para os campos
    Dado que estou na tela de Noco Usuário
    Quando devo informar os campos "<nome>" e "<email>" e "<senha>"
    E clico no botão Cadastrar
    Então exibe a mensagem "<mensagem>"

    Exemplos: 
      | nome       | email                      | senha      | mensagem                     |
      | Fernando_6 | fernando_teste6@gmail.com  | teste123   | Bem vindo, Fernando_6!       |
      | Fernando_2 |                            | teste12356 | Email é um campo obrigatório |
      |            |                            | teste12356 | Nome é um campo obrigatório  |
      |            | cristiano_teste1@gmail.com |            | Senha é um campo obrigatório |
      | Fernando_3 | cristiano_teste1@gmail.com |            | Senha é um campo obrigatório |
