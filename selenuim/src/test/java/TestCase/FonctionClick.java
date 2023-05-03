package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class FonctionClick {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicity wait (remplace thread sleep) 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		
		WebElement boutton1;
		boutton1 = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(boutton1).perform();
		
		//Assert
		WebElement msg;
		msg = driver.findElement(By.id("doubleClickMessage"));
		String text;
		
		text = msg.getText();
		Assert.assertEquals(text, "You have done a double click");
		
		System.out.println("test ok boutton 1 ");
		
		//.............
		
		WebElement boutton2;
		boutton2 = driver.findElement(By.id("rightClickBtn"));
		Actions action2 = new Actions(driver);
		action2.contextClick(boutton2).perform();
		
		//Assert 
		WebElement msg2;
		msg2 = driver.findElement(By.id("rightClickMessage"));
		String texte;
		
		texte = msg2.getText();
		Assert.assertEquals(texte, "You have done a right click");
		
		System.out.println("test ok boutton 2 ");
		
		//...........
		
		WebElement boutton3;
		boutton3 = driver.findElement(By.xpath("//div[3]//button[1]"));
		Actions action3 = new Actions(driver);
		
		action3.click(boutton3).perform();
		
		WebElement msg3;
		msg3 = driver.findElement(By.id("dynamicClickMessage"));
		String txt;
		
		txt = msg3.getText();
		Assert.assertEquals(txt , "You have done a dynamic click"); 
		
		System.out.println("test ok boutton 3 ");
			

	}

}
