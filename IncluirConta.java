package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class IncluirConta {
	
	private WebDriver driverFirefox;
	
	
	@Dado("^que acesso a tela para novo usuário e informo os campos  \"([^\"]*)\" e \"([^\"]*)\"$")
	public void que_acesso_a_tela_para_novo_usuário_e_informo_os_campos_e(String email, String senha) throws Throwable {

		System.setProperty("webdriver.gecko.driver", "C://selenium_driver//geckodriver.exe");
		driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://srbarriga.herokuapp.com/login");
		driverFirefox.findElement(By.id("email")).sendKeys(email);
		driverFirefox.findElement(By.id("senha")).sendKeys(senha);
		driverFirefox.findElement(By.xpath("//button[contains(text(),'Entrar')]")).click();
	}


	@Quando("^crio uma conta noda de \"([^\"]*)\"$")
	public void crio_uma_conta_noda_de(String nomeConta) throws Throwable {
	    System.out.println("ENTREI NO SEGUNDO PASSO");
		driverFirefox.findElement(By.linkText("Contas")).click();
		driverFirefox.findElement(By.linkText("Adicionar")).click();
		driverFirefox.findElement(By.id("nome")).sendKeys(nomeConta);
		driverFirefox.findElement(By.xpath("//button[contains(text(),'Salvar')]")).click();
		
		
	}

	@Então("^recebo do sitema a mensagem de \"([^\"]*)\"$")
	public void recebo_do_sitema_a_mensagem_de(String mensagemValidacao) throws Throwable {
	   
		String mensagemTela = driverFirefox.findElement(By.xpath("//div[@role='alert']")).getText();
		assertEquals(mensagemValidacao, mensagemTela);
	}
	

}
