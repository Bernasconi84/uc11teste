package site2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class site2 {
	 private WebDriver driver;
	 
	 @Before 
	 public void abrirNavegador() {
	 System.setProperty("webdriver.chromer,driver", "C:\\Program Files\\chromedriver\\chromedriver");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 }
	 @Test
	 public void testeNavegador() {
		 driver.get("https://ge.globo.com/");
		 driver.findElement(By.id("busca-campo")).sendKeys("São Paulo");
		 driver.findElement(By.id("search-button")).click();
		 }
}
