package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfcydX1H6E1XU66wn8fYtpbcCPCFF_YThK66c3gzAKd6sQcOrv3jSXDn3z0hwQQ1XKko-ay46lZzMsDsAmvsFOoCnocq3n_qgQBL3pGmcgsD3g&smuh=28278&lh=Ac_BJlLfVkVe3XHNvEw");

		
		WebElement bouttonCreer;
		bouttonCreer = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		bouttonCreer.click();
		Actions action = new Actions(driver);
		
		
		//................
		
		WebElement Prenom ; 
		Prenom = driver.findElement(By.name("firstname"));
		WebElement NomDeFamille;
		NomDeFamille = driver.findElement(By.name("lastname"));
		
		Prenom.sendKeys("besma");
		NomDeFamille.sendKeys("kefi");
		
		//............
		
		WebElement Email;
		Email = driver.findElement(By.name("reg_email__"));
		WebElement ConfirmEmail;
		ConfirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		
		Email.sendKeys("besmakefi51@gmail.com");
		ConfirmEmail.sendKeys("besmakefi51@gmail.com");
		
		
		//........
		 
		WebElement MotDePasse;
		MotDePasse = driver.findElement(By.id("password_step_input"));
		
		MotDePasse.sendKeys("ayet.hanine");
		
		//......
		
		
		WebElement listeJour;
		listeJour= driver.findElement(By.id("day"));
		
		Select ListeJ = new Select(listeJour); 
		ListeJ.selectByValue("14");
		//.........
		
		WebElement listeMois;
		listeMois= driver.findElement(By.id("month"));
		
		Select ListeM = new Select(listeMois); 
		ListeM.selectByValue("12");
		//........
		
		WebElement listeAnnee;
		listeAnnee= driver.findElement(By.id("year"));
		
		Select ListeA = new Select(listeAnnee); 
		ListeA.selectByValue("1990");
		
		//......
		
		WebElement bouttonFemme;
		bouttonFemme = driver.findElement(By.className("_58mt"));
		Actions action1 = new Actions(driver);
		
		action1.click(bouttonFemme).perform();
		
		//.....
		WebElement bouttonHomme;
		bouttonHomme = driver.findElement(By.className("_58mt"));
		Actions action2 = new Actions(driver);
		
		action2.click(bouttonHomme).perform();
		
		//.......
		WebElement bouttonPersonalisée;
		bouttonPersonalisée = driver.findElement(By.className("_58mt"));
		Actions action3 = new Actions(driver);
		
		action3.click(bouttonPersonalisée).perform();
		
		//........
		
		WebElement bouttonInscrire;
		bouttonInscrire = driver.findElement(By.name("websubmit"));
		
		Actions action4 = new Actions(driver);
		action4.doubleClick(bouttonCreer).perform();
	}

}
