package runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
		glue = "steps",
		features = "resources/features/incluir_nova_conta.feature"
		)
@RunWith(Cucumber.class)
public class Runner {
	
	
	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.gecko.driver", "C://selenium_driver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://srbarriga.herokuapp.com/login");
		driver.findElement(By.id("email")).sendKeys("cristiano_teste1@gmail.com");
		driver.findElement(By.id("senha")).sendKeys("teste123");
		driver.findElement(By.tagName("button")).click();
		//driver.findElement(By.linkText("sair")).click();
		driver.quit();
	}
	
	

}
