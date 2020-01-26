package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaInicial extends PaginaMestra{
	
	public PaginaInicial(WebDriver browser) {
		super(browser);
	}
	
	
	public String mensagem() {
		String mensagem = browser.findElement(By.xpath("//div[@role='alert']")).getText();
		
		return mensagem;
	}
	
	
	public IncluirContas chamarTelaIncluirConta() {
		
		browser.findElement(By.linkText("Contas")).click();
		browser.findElement(By.linkText("Adicionar")).click();
		
		return new IncluirContas(browser);
		
	}
	

}
