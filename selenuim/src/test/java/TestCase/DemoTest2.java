package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoTest2 {
	WebDriver driver;

	@Given("ouvrir navigateur chrome")
	public void ouvrir_navigateur_chrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Given("saisir url")
	public void saisir_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("saisir mail")
	public void saisir_mail() {
		WebElement user;
		user = driver.findElement(By.name("username"));
		user.sendKeys("admin");

	}

	@When("saisir password")
	public void saisir_password() {
		WebElement mdp;
		mdp = driver.findElement(By.name("password"));
		mdp.sendKeys("admin123");

	}

	@When("cliquer sur connexion")
	public void cliquer_sur_connexion() {
		WebElement boutton;
		boutton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		boutton.click();

	}

	@Then("verifier la page home")
	public void verifier_la_page_home() {
		System.out.println("test ok");

	}
}