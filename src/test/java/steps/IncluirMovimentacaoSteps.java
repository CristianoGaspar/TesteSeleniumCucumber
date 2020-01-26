package steps;

import org.openqa.selenium.WebDriver;

import Support.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.IncluirContas;
import pages.IncluirMovimentacao;
import pages.PaginaInicial;
import pages.PaginaLogin;

public class IncluirMovimentacaoSteps {

	private WebDriver browser;	
	IncluirMovimentacao incluirMovimentacao;
	PaginaInicial paginaInicial;
	PaginaLogin paginaLogin;
	
	
	@Before("@novaMovimentacao")
	public void setUp() {
		browser = Utils.abrirBrowser();
		paginaLogin = new PaginaLogin(browser);
		paginaInicial = new PaginaInicial(browser);
		incluirMovimentacao = new IncluirMovimentacao(browser);
		
	}
	
	@After("@novaMovimentacao")
	public void tearDown() {
		browser.quit();
	}
	

@Dado("^que estou na tela de Bem vindo$")
public void que_estou_na_tela_de_Bem_vindo() throws Throwable {
   System.out.println("step 01");
	paginaLogin.enderecoDoSistema();
	paginaLogin.preencherDadosUsuario("cristiano_teste1@gmail.com",  "teste123");
	paginaLogin.clicarBotaoEntrar();
}

@Então("^seleciono Criar uma movimentação$")
public void seleciono_Criar_uma_movimentação() throws Throwable {
	System.out.println("step 02");
}

@Quando("^seleciono o tipo de \"([^\"]*)\"$")
public void seleciono_o_tipo_de(String arg1) throws Throwable {
	System.out.println("step 03");
}

@Quando("^devo informar os campos  \"([^\"]*)\" e \"([^\"]*)\"$")
public void devo_informar_os_campos_e(String arg1, String arg2) throws Throwable {
	System.out.println("step 04");
}

@Quando("^informo os campos \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
public void informo_os_campos_e_e(String arg1, String arg2, String arg3) throws Throwable {
	System.out.println("step 05");
}

@Quando("^seleciono o tipo de \"([^\"]*)\" tipo de \"([^\"]*)\"$")
public void seleciono_o_tipo_de_tipo_de(String arg1, String arg2) throws Throwable {
	System.out.println("step 06");
}

@Quando("^clico no botão Salvar$")
public void clico_no_botão_Salvar() throws Throwable {
	System.out.println("step 07");
}
}
