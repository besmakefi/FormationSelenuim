package JavaCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;


public class ornikar {
	WebDriver driver;
	
	@Given("ouvrir  chrome")
	public void ouvrir_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Given("acceder a l url {string}")
	public void acceder_a_l_url(String string) {
		driver.get(string);
	}
	
	@When("cliquer sur le bouton accepter tous les cookies")
	public void cliquer_sur_le_bouton_accepter_tous_les_cookies() {
		WebDriverWait wait = new WebDriverWait(driver,3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("axeptio_btn_acceptAll")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("axeptio_btn_acceptAll")));
				
		WebElement bouttoncookies = driver.findElement(By.id("axeptio_btn_acceptAll"));
		Actions action0 = new Actions(driver);
		action0.click(bouttoncookies).perform();
	    
	} 

	@When("cliquer sur le boutton j obtiens mon tarif")
	public void cliquer_sur_le_boutton_j_obtiens_mon_tarif() {
		
		WebElement bouttonjobtientmontarif = driver.findElement(By.xpath("//a[@class='button is-heroe w-button']"));
		//Actions action1 = new Actions(driver);
		//action1.click(bouttonjobtientmontarif).perform();
		bouttonjobtientmontarif.click();
	    
	}

	@When("cliquer sur le bouton non")
	public void cliquer_sur_le_bouton_non() {
		
		WebElement bouttonnon = driver.findElement(By.xpath("//div[contains(text(),'Non')]"));
		Actions action2 = new Actions(driver);
		action2.click(bouttonnon).perform();
	  
	}

	@When("cliquer sur le bouton rechercher par plaque")
	public void cliquer_sur_le_bouton_rechercher_par_plaque() {
		
		WebElement bouttonrechercheparplaque = driver.findElement(By.xpath("//div[normalize-space()='Rechercher par plaque']"));
		Actions action3 = new Actions(driver);
		action3.click(bouttonrechercheparplaque).perform();
	    
	}

	@When("remplir le champs plaque {string}")
	public void remplir_le_champs_plaque(String string) {
		
		WebElement plaque ;
		plaque = driver.findElement(By.xpath("//input[@placeholder='AA123AA']"));
		plaque.sendKeys(string);
	    
	}

	@When("cliquer sur le bouton confirmer")
	public void cliquer_sur_le_bouton_confirmer() {
		
		WebElement bouttonconfirmer = driver.findElement(By.xpath("//button[contains(@type,'submit')]//div[contains(@class,'kitt_Content_LGs5p')]"));
		Actions action4 = new Actions(driver);
		action4.click(bouttonconfirmer).perform();
	  		
	}

	@Then("verifier le nom du plaque")
	public void verifier_le_nom_du_plaque() {
		
		
		
		WebElement  nomdeplaque = driver.findElement(By.xpath("//h5[normalize-space()='SEAT LEON']"));
		String 	vrainom = nomdeplaque.getText();
		Assert.assertEquals(vrainom , "SEAT LEON");
		System.out.println("test ok  ");
		driver.close();
	   
	}

}
