# TesteSeleniumCucumber



Tecnologias escolhidas:

Linguagem Java
Framework Selenium
Framework de testes automatizados: Selenium WebDriver + Cucumber
Framework de testes automatizados: JUnit
Padrão de escrita de código de testes: PageObjects
Arquitetura do projeto:
Classe filha -> Classe mãe herdada

Classe de Teste -> WebDriver

Classe de PageObject -> WebDriver

Features:
Editar Contas (Editar / Excluir)

Incluir Contas

Incluir Movimentações

Incluir novo Usuário

Logar no sistema


Passo a passo do projeto
1. Classe WebDriver
Instalar Jars: Selenium WebDriver, Cucumber
Criar pasta e incluir geckodriver (driver do navegador firefox utilizado neste exemplo)
Método SetUp: ações executada antes a cada teste iniciado
Método TearDown: últimas ações realizadas após o teste finalizar

3. Classe PageObjects
Instalar o Firebug
Fazer antes de criar os testes, para mapear os elementos da tela que será efetuado ações
Recomendo utilizar o navegador Mozilla Firefox e usar a extensão SeleniumIDE e Firebug para ajudar a mapear
Criar classe para cada página existente no sistema, neste projeto utilizaei o Package (Pages) para montar os formularios
Mapeie cada elemento: ajuda na hora da manutenção e fica mais legível
4. Classe Tests
Classe que representa uma suíte de testes que irão ser executados
Herdar classe WebDriver
Método de teste: método que insere informações na tela, navega no sistema e faz validações e verifica o resultado final
Crie método claros e intuitivos
Caso haja ações/métodos que podem ser reutilizadas, crie um método na classe de PageObject referente á tela
Sempre que for usar algum elemento da tela, crie um objeto da classe PageObjects e realize ações no método de teste
5. Executar testes criados
Executar o arquivo Runner , na packaage "runners"
Clique com o botão direito, selevione "Run As" e depois "JUnit Test" 
Será executado todos os testes descritos nas features conforme cenários multilines
Posterior a execução final os resultados são, na aba JUnit:
Verde -> Assert validado com sucesso
Vermelho -> Alguma ação não realizada ou Assert não validado

OBS: Testes de Movimentações ainda não estão totalmente conclusivos precisam ser finalizados