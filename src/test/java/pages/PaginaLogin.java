package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin extends PaginaMestra{
	
	
	public PaginaLogin(WebDriver browser) {
		super(browser);		
	}
	
	
	public void enderecoDoSistema() {
		browser.get("https://srbarriga.herokuapp.com/login");
	}
	
	public void preencherDadosUsuario(String email, String senha) {
		browser.findElement(By.id("email")).sendKeys(email);
		browser.findElement(By.id("senha")).sendKeys(senha);
	}

	
	public PaginaInicial clicarBotaoEntrar() {
		browser.findElement(By.xpath("//button[contains(text(), 'Entrar')]")).click();
		
		return new PaginaInicial(browser);
	}
	
	
}
