package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IncluirContas extends PaginaMestra{
		
	public IncluirContas(WebDriver browser) {
	super(browser);
}

	public IncluirContas incluirNovaConta(String nomeConta) {
		browser.findElement(By.id("nome")).sendKeys(nomeConta);
		browser.findElement(By.xpath("//button[contains(text(),'Salvar')]")).click();
		
		return this;
	}
	
	public String validarMensagem() {
		String mensagem = browser.findElement(By.xpath("//div[@role='alert']")).getText();
		
		return mensagem;
	}

}
