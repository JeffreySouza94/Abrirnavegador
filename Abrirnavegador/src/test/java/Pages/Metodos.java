package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	
	public void AbrirNavegador(String appUrl, String passoApasso) {
		
		System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts();
		driver.quit();
	}
	
	
	}


