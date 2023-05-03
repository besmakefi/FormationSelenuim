package TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;



public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chrome driver 
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome 
		WebDriver driver = new ChromeDriver();
		// maximiser l'ecran
		driver.manage().window().maximize();
		// ouvrir l'url 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// sleep
		Thread.sleep(5000);
		// identification de web lelement 
		WebElement user; 
		user = driver.findElement(By.name("username"));
		WebElement mdp;
		mdp = driver.findElement(By.name("password"));
		// action 
		user.sendKeys("admin");
		mdp.sendKeys("admin123");
		//identification boutton 
		WebElement boutton;
		boutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		boutton.click();
		
		Thread.sleep(5000);
		// verification du compte (ASSERT)
		// identification de l'element
		WebElement profil;
		profil = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text = profil.getText();
		Assert.assertEquals("Paul Collings",text);
		// affichage 
		System.out.println("test ok");
	}

}
