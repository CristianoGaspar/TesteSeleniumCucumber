# language: pt
Funcionalidade: Login com usuario valido
  Para logar no sistema

  Cenario: Login do usuario com email e senha validos
    Quando informo os campos email e senha com "cristiano_teste1@gmail.com" e "teste1234"
    Entao minhas credenciais são validas com sucesso
    E recebo a mensagem "Bem vindo, Teste1!"
