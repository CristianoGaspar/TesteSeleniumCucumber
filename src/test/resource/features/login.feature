Feature: Logar no sistema SrBarriga

  Scenario: Logar no sistema
    Given Logo no sistema com usuario e senha validos
    When usuario é autenticado
    Then usuario recebe mensagem de Bem vindo
