package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IncluirMovimentacao  extends PaginaMestra{
	
	public IncluirMovimentacao(WebDriver browser) {
		super(browser);
	}

		public IncluirMovimentacao incluirNovaMovimentacao(String tpMov2imentacao,String data_transacao, String data_pagamento,
				String descricao, String interessado, String valor) {
			
			
			
			//refere-e ao campo data movimentação
			browser.findElement(By.id("data_transacao")).sendKeys(data_transacao);
			
			//refere-e ao campo data pagamento
			browser.findElement(By.id("data_pagamento")).sendKeys(data_pagamento);
			
			//refere-e ao campo descricao
			browser.findElement(By.id("descricao")).sendKeys(descricao);
			
			//refere-e ao campo interessado
			browser.findElement(By.id("interessado")).sendKeys(interessado);
			
			//refere-e ao campo valor
			browser.findElement(By.id("valor")).sendKeys(valor);
			
			WebElement comboboxElement = browser.findElement(By.id("conta"));
			browser.findElement(By.xpath("//*[@id='conta']")).click();
			Select combobox = new Select(comboboxElement);
	                combobox.selectByValue("61874");
			
			//browser.findElement(By.xpath("//button[contains(text(),'Salvar')]")).click();
			
			return this;
		}
		
		public String validarMensagem() {
			String mensagem = browser.findElement(By.xpath("//div[@role='alert']")).getText();
			
			return mensagem;
		}

}
