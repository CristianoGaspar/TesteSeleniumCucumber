package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Support.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.PaginaInicial;
import pages.PaginaLogin;

public class LoginSteps {

	private WebDriver browser;
	PaginaLogin paginaLogin;
	PaginaInicial paginaInicial;
	
	@Before("@logar")
	public void setUp() {
		browser = Utils.abrirBrowser();
		paginaLogin = new PaginaLogin(browser);
		paginaInicial = new PaginaInicial(browser);
		
	}
	

	@After("@logar")
	public void tearDown() {
		browser.quit();
		
	}
	
	
	

@Dado("^que estou logado no sistema$")
public void que_estou_logado_no_sistema() throws Throwable {

	paginaLogin.enderecoDoSistema();

}

@Quando("^informo os campos \"([^\"]*)\" e \"([^\"]*)\"$")
public void informo_os_campos_e(String email, String senha) throws Throwable {
	paginaLogin.preencherDadosUsuario(email, senha);
}

@Quando("^clico no botão Entrar$")
public void clico_no_botão_Entrar() throws Throwable {
	paginaLogin.clicarBotaoEntrar();
}

@Então("^recebo a mensagem \"([^\"]*)\"$")
public void recebo_a_mensagem(String mensagemEsperada) throws Throwable {
   assertEquals(mensagemEsperada, paginaInicial.mensagem());
}

}
