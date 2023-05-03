package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ExempleYouTube {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		
		WebElement champsDeTexte; 
		champsDeTexte = driver.findElement(By.name("search_query"));
		
		champsDeTexte.sendKeys("Tunisie");
		
		WebElement boutton;
		boutton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon"));
		boutton.click();
		
		Thread.sleep(5000);
		
		
		String URL;
		URL = driver.getCurrentUrl();
		Assert.assertEquals("https://www.youtube.com/results?search_query=Tunisie", URL);
		
		
		System.out.println("test ok");

	}

}
