package JavaCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange {
	
	WebDriver driver;
	@Given("ouvrir le navigateur")
	public void ouvrir_le_navigateur() {
		
			System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("saisir l URL {string}")
	public void saisir_l_url(String string) {
		driver.get(string);
	   
	}
	@When("remplire le champs username {string}")
	public void remplire_le_champs_username(String string) {
		WebElement userName2 ;
		userName2 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName2.sendKeys(string);
	  
	}

	@When("remplire le champs password {string}")
	public void remplire_le_champs_password(String string) {
		WebElement passWord ;
		passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passWord.sendKeys(string);
	    
	}

	@Then("verifier le text {string}")
	public void verifier_le_text(String msg1) {
		WebElement element = driver.findElement(By.className("oxd-alert-content-text"));
		
		 String txte = element.getText();
		Assert.assertEquals(msg1,txte);
		System.out.println("test 1 ok  ");
	    
	}
	@Then("verifier le dashboard est ouvert")
	public void verifier_le_dashboard() {
		String urlAttendu = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String urlActuel = driver.getCurrentUrl();
		Assert.assertEquals(urlAttendu,urlActuel);
			
	}



	@When("cliquer sur le bouton login")
	public void cliquer_sur_le_bouton_login() {
	    
		WebElement bouttonlogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		Actions action1 = new Actions(driver);
		action1.click(bouttonlogin).perform();
		 
	}

	
	

	@Then("verifier le text Invalid credentials")
	public void verifier_le_text_invalid_credentials() {
		
		WebElement invalid1;
		invalid1 = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		String message1;
		message1 = invalid1.getText();
		Assert.assertEquals(message1 , "Invalid credentials");
		System.out.println("test 2 ok  ");
	}

	

	
}
