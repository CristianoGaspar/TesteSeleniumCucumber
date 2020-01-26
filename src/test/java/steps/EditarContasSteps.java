package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Support.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.IncluirContas;
import pages.PaginaInicial;
import pages.PaginaLogin;

public class EditarContasSteps {


	private WebDriver browser;	
	IncluirContas incluirNovaConta;
	PaginaInicial paginaInicial;
	PaginaLogin paginaLogin;
	
	
	@Before("@editarConta")
	public void setUp() {
		browser = Utils.abrirBrowser();
		paginaLogin = new PaginaLogin(browser);
		paginaInicial = new PaginaInicial(browser);
		incluirNovaConta = new IncluirContas(browser);
		
	}
	
	@After("@editarConta")
	public void tearDown() {
		browser.quit();
	}
	
	@Dado("^acessei o sistema$")
	public void estouLogadoNoSistema() throws Throwable {	    
		paginaLogin.enderecoDoSistema();
		paginaLogin.preencherDadosUsuario("cristiano_teste1@gmail.com",  "teste123");
		paginaLogin.clicarBotaoEntrar();
	}
	

@Dado("^acesso a tela de Listar contas$")
public void acesso_a_tela_de_Listar_contas() throws Throwable {
	browser.findElement(By.linkText("Contas")).click();
	browser.findElement(By.linkText("Listar")).click();
}

@Quando("^seleciono uma conta \"([^\"]*)\"$")
public void seleciono_uma_conta(String arg1) throws Throwable {
   
}

@Quando("^clico na exclusão$")
public void clico_na_exclusão() throws Throwable {
   
}



}
