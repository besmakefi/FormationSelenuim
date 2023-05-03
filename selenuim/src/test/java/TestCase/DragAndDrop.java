package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable/");
		
		
		WebElement from;
		from =driver.findElement(By.id("draggable")) ;
		
		WebElement To;
		To = driver.findElement(By.id("droppable"));
		
		Actions action= new Actions(driver);
		
		action.dragAndDrop(from, To).perform();
		
		String txt;
		txt=To.getText();
		Assert.assertEquals(txt,"Dropped!");
		System.out.print("Test Ok");
		
		driver.close();
		
		
		
		
		

	}

}
