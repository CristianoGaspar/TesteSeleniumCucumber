# language: pt

@logar
Funcionalidade: Login com usuario valido
  Para logar no sistema
  Ter acesso as funcionalidades

  Contexto: Pagina Inicial
    Dado que estou logado no sistema

  Esquema do Cenario: Valida acesso de usuario e senha
    Quando informo os campos "<email>" e "<senha>"
    E clico no botão Entrar
    Então recebo a mensagem "<mensagem>"

    Exemplos: 
      | email                      | senha      | mensagem                         |
      | cristiano_teste1@gmail.com | teste123   | Bem vindo, Teste1!    |
      | cristiano_teste1@gmail.com | teste12356 | Problemas com o login do usuário |
      |                            | teste12356 | Email é um campo obrigatório     |
      | cristiano_teste1@gmail.com |            | Senha é um campo obrigatório     |

