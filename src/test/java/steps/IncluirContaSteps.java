package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Support.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.IncluirContas;
import pages.PaginaInicial;
import pages.PaginaLogin;

public class IncluirContaSteps {
	
	private WebDriver browser;	
	IncluirContas incluirNovaConta;
	PaginaInicial paginaInicial;
	PaginaLogin paginaLogin;
	
	
	@Before("@incluirNovaConta")
	public void setUp() {
		browser = Utils.abrirBrowser();
		paginaLogin = new PaginaLogin(browser);
		paginaInicial = new PaginaInicial(browser);
		incluirNovaConta = new IncluirContas(browser);
		
	}
	
	@After("@incluirNovaConta")
	public void tearDown() {
		browser.quit();
	}
	
	@Dado("^estou logado no sistema$")
	public void estouLogadoNoSistema() throws Throwable {	    
		paginaLogin.enderecoDoSistema();
		paginaLogin.preencherDadosUsuario("cristiano_teste1@gmail.com",  "teste123");
		paginaLogin.clicarBotaoEntrar();
	}
	

@Dado("^acesso a tela para incluir conta$")
public void acesso_a_tela_para_incluir_conta() throws Throwable {
	browser.findElement(By.linkText("Contas")).click();
	browser.findElement(By.linkText("Adicionar")).click();
}

@Quando("^incluo uma conta \"([^\"]*)\"$")
public void incluo_uma_conta(String nomeConta) throws Throwable {
	incluirNovaConta.incluirNovaConta(nomeConta);
}

@Então("^exibe a \"([^\"]*)\"$")
public void exibe_a(String mensagemEsperada) throws Throwable {
	assertEquals(mensagemEsperada, paginaInicial.mensagem());
	   browser.quit();
}


}
