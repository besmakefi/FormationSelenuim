package JavaCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDef {

	WebDriver driver;

	@Given("ouvrir navigateur")
	public void ouvrir_navigateur() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Given("saisir l adresse {string}")
	public void saisir_l_adresse(String string) {
		driver.get("https://www.facebook.com/");
	}


	@When("cliquer sur le bouton creer compte")
	public void cliquer_sur_le_bouton_creer_compte() {		
		WebElement bouttonCreer;
		bouttonCreer = driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		bouttonCreer.click();
	}

	@When("remplir le champ nom {string}")
	public void remplir_le_champ_nom(String var1) {
		WebElement NomDeFamille;
		NomDeFamille = driver.findElement(By.name("lastname"));
		NomDeFamille.sendKeys(var1);
	}

	@When("remplire le champ prenom  {string}")
	public void remplire_le_champ_prenom(String string) {
		WebElement Prenom;
		Prenom = driver.findElement(By.name("firstname"));
		Prenom.sendKeys(string);

	}

	@When("remlire l adresse email {string}")
	public void remlire_l_adresse_email(String string) {
		WebElement Email;
		Email = driver.findElement(By.name("reg_email__"));
		Email.sendKeys(string);

	}

	@When("remlire le mail de confirmation {string}")
	public void remlire_le_mail_de_confirmation(String string) {
		WebElement ConfirmEmail;
		ConfirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		ConfirmEmail.sendKeys(string);

	}

	@When("saisir le mot de passe {string}")
	public void saisir_le_mot_de_passe(String string) {
		WebElement MotDePasse;
		MotDePasse = driver.findElement(By.id("password_step_input"));

		MotDePasse.sendKeys("string");

	}

	

	@When("choisir le jour de naissance {string}")
	public void choisir_le_jour_de_naissance(String string) {
		WebElement listeJour = driver.findElement(By.id("day"));

		Select ListeJ = new Select(listeJour);
		ListeJ.selectByValue(string);
	}
	@When("choisir le mois de naissance {string}")
	public void choisir_le_mois_de_naissance(String string) {
		WebElement listeMois;
		listeMois = driver.findElement(By.id("month"));
		Select ListeM = new Select(listeMois);
		ListeM.selectByValue(string);
	}

	@When("choisir l annee de naissance {string}")
	public void choisir_l_annee_de_naissance(String string) {
		WebElement listeAnnee = driver.findElement(By.id("year"));
		Select ListeA = new Select(listeAnnee);
		ListeA.selectByValue(string);
	}

	@When("choisir le genre  {string}")
	public void choisir_le_genre(String string) {
		WebElement bouttonFemme;
		bouttonFemme = driver.findElement(By.xpath("//label[normalize-space()='Femme']"));
		//.....
		WebElement bouttonHomme;
		bouttonHomme = driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		if (string.equals("Homme")) {
			bouttonHomme.click();
		}
		else if (string.equals("femme")) {
			bouttonFemme.click();
		}
	}

	@When("cliquer sur s inscrire")
	public void cliquer_sur_s_inscrire() {
		WebElement bouttonInscrire = driver.findElement(By.name("websubmit"));
		Actions action4 = new Actions(driver);
		action4.click(bouttonInscrire).perform();
	}

	@Then("verifier la connexion")
	public void verifier_la_connexion() {
		System.out.println("test ok");

	}
	
	@When("choisir genre {string} et selectionner {string}")
	public void choisir_genre(String preso,String string2) {
		if (preso.equals("Personnalise")) {
		WebElement bouttonPerso;
		bouttonPerso = driver.findElement(By.xpath("//label[normalize-space()='Personnalisé']"));
		bouttonPerso.click();
		}
		
		WebElement listeperso = driver.findElement(By.name("preferred_pronoun"));
		Select select = new Select(listeperso);
		select.selectByValue(string2);
	    
	}
}
