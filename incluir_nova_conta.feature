# language: pt
Funcionalidade: Criar uma conta nova


  Cenario: Cadastrar usuário com dados validos
    Dado que acesso a tela para novo usuário e informo os campos  "cristiano_teste1@gmail.com" e "teste123"
    Quando crio uma conta noda de "agua3"
    Então recebo do sitema a mensagem de "Conta adicionada com sucesso!"
