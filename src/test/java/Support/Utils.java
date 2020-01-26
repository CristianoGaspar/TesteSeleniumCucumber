package Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utils {
		
	public static WebDriver abrirBrowser() {
		
		//inicio com a execução do browser
		System.setProperty("webdriver.gecko.driver", "C://selenium_driver//geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		browser.manage().window().maximize();
		
		return browser;
		
	}
	

}
