package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) {

		// chemin chrome driver PATH
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouvrir chrome
		WebDriver driver = new ChromeDriver();
		// maximiser la fenetre
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		// ouvrir url
		driver.get("https://www.google.com/");
		// ou
		driver.navigate().to("https://www.google.com/");

	}

}
