package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	private WebDriver driverFirefox;

	@Quando("^informo os campos email e senha com \"([^\"]*)\" e \"([^\"]*)\"$")
	public void informo_os_campos_email_e_senha_com_e(String arg1, String arg2) throws Throwable {

		System.setProperty("webdriver.gecko.driver", "C://selenium_driver//geckodriver.exe");
		driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://srbarriga.herokuapp.com/login");
		driverFirefox.findElement(By.id("email")).sendKeys("cristiano_teste1@gmail.com");
		driverFirefox.findElement(By.id("senha")).sendKeys("teste123");
		driverFirefox.findElement(By.xpath("//button[contains(text(),'Entrar')]")).click();
	}

	@Entao("^minhas credenciais são validas com sucesso$")
	public void minhas_credenciais_são_validas_com_sucesso() throws Throwable {

		driverFirefox.findElement(By.xpath("//div[@role='alert']")).getText();

	}

	@Entao("^recebo a mensagem \"([^\"]*)\"$")
	public void recebo_a_mensagem(String mensagemValidacao) throws Throwable {
		String mensagemTela = driverFirefox.findElement(By.xpath("//div[@role='alert']")).getText();
		assertEquals(mensagemValidacao, mensagemTela);

	}

}
