package leiloesmvm;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteUsuarioPage {

		@Test
		public void deveAdicionar()	{

		// Optional, if not specified, WebDriver will search your path for
		// chromedriver.
		System.setProperty("webdriver.chrome.driver", "/home/samuel/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/leiloesmvm");
		WebElement abaUsuario = driver.findElement(By.xpath(".//*[@id='topmenu']/ul/li[2]/a"));
		abaUsuario.click();
	//	Thread.sleep(1000);
		WebElement linkNovoUsuario = driver.findElement(By.linkText("Novo Usuário"));
		linkNovoUsuario.click();
	//	Thread.sleep(1000);
		WebElement nome = driver.findElement(By.name("usuario.nome"));
		nome.sendKeys("novoUsuario");
		WebElement email = driver.findElement(By.name("usuario.email"));
		email.sendKeys("novo@novo.com");
	//	Thread.sleep(1000);

		WebElement salvar = driver.findElement(By.id("btnSalvar"));
		salvar.click();
		
		assertTrue(driver.getPageSource().contains("novoUsuario"));
		assertTrue(driver.getPageSource().contains("novo@novo.com"));
	}

	// Thread.sleep(5000); // Let the user actually see something!
	// WebElement searchBox = driver.findElement(By.name("q"));
	// searchBox.sendKeys("cachorro quente florianópolis");
	// searchBox.submit();
	// Thread.sleep(5000); // Let the user actually see something!
	// driver.quit();

}
