package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class NewUserSteps {

	private WebDriver driverFirefox;

	@Dado("^que acesso a tela para novo usuário e informo os campos \"([^\"]*)\" , \"([^\"]*)\" e \"([^\"]*)\"$")
	public void que_acesso_a_tela_para_novo_usuário_e_informo_os_campos_e(String nome, String email, String senha)
			throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C://selenium_driver//geckodriver.exe");
		driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://srbarriga.herokuapp.com/login");
		driverFirefox.findElement(By.linkText("Novo usuário?")).click();
		driverFirefox.findElement(By.id("nome")).sendKeys(nome);
		driverFirefox.findElement(By.id("email")).sendKeys(email);
		driverFirefox.findElement(By.id("senha")).sendKeys(senha);
		driverFirefox.findElement(By.xpath("//input[@value='Cadastrar']")).click();

	}

	

	@Quando("^clico para salvar$")
	public void clico_para_salvar() throws Throwable {
		driverFirefox.findElement(By.xpath("//div[@role='alert']")).getText();		
		
	}

	@Então("^sistema exibe mensagem de \"([^\"]*)\"$")
	public void sistema_exibe_mensagem_de(String mensagemValidacao) throws Throwable {
		String mensagemTela = driverFirefox.findElement(By.xpath("//div[@role='alert']")).getText();
		assertEquals(mensagemValidacao, mensagemTela);
	}

}
