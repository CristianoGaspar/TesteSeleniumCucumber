package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	browser.findElement(By.linkText("Criar Movimentação")).click();
	
}

@Quando("^seleciono o tipo de \"([^\"]*)\"$")
public void seleciono_o_tipo_de(String arg1) throws Throwable {
	System.out.println("step 03");
	WebElement comboboxElementTpMov = browser.findElement(By.id("tipo"));
	browser.findElement(By.xpath("//*[@id='tipo']")).click();
	Select tpMovimentacao = new Select(comboboxElementTpMov);
	tpMovimentacao.selectByValue("REC");
}

@Quando("^devo informar os campos  \"([^\"]*)\" e \"([^\"]*)\"$")
public void devo_informar_os_campos_e(String arg1, String arg2) throws Throwable {
	System.out.println("step 04");
	//refere-e ao campo data movimentação
	browser.findElement(By.id("data_transacao")).sendKeys("12/10/2000");
	//refere-e ao campo data pagamento
	browser.findElement(By.id("data_pagamento")).sendKeys("25/10/2001");
	
	
}

@Quando("^informo os campos \"([^\"]*)\" e \"([^\"]*)\" e \"([^\"]*)\"$")
public void informo_os_campos_e_e(String arg1, String arg2, String arg3) throws Throwable {
	System.out.println("step 05");
	//refere-e ao campo descricao
		browser.findElement(By.id("descricao")).sendKeys("ESTOU INSERINDO OS DADOS DA MOVIMENTACAO");
		
		//refere-e ao campo interessado
		browser.findElement(By.id("interessado")).sendKeys("PAULO FERNANDES DA ROSA SILVA");
		
		//refere-e ao campo valor
		browser.findElement(By.id("valor")).sendKeys("121,99");
}

@Quando("^seleciono o tipo de \"([^\"]*)\" tipo de \"([^\"]*)\"$")
public void seleciono_o_tipo_de_tipo_de(String arg1, String arg2) throws Throwable {
	System.out.println("step 06");
	WebElement comboboxElement = browser.findElement(By.id("conta"));
	browser.findElement(By.xpath("//*[@id='conta']")).click();
	Select combobox = new Select(comboboxElement);
            combobox.selectByValue("61874");
            
   browser.findElement(By.id("status_pago")).click();
            
}

@Quando("^clico no botão Salvar$")
public void clico_no_botão_Salvar() throws Throwable {
	System.out.println("step 07");
}
}
