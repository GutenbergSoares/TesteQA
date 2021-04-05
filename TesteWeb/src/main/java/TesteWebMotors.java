
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteWebMotors {
	
	 
	
	@Test
	public void teste()  {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
		System.getProperty("webdriver.gecko.driver","C:\\Users\\Guto Soares\\Downloads\\drive");
		driver.findElement(By.id("searchBar")).sendKeys("Honda");
		Assert.assertEquals("Honda", driver.findElement(By.id("searchBar")).getAttribute("value"));
			

		driver.get("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
		System.getProperty("webdriver.gecko.driver","C:\\Users\\Guto Soares\\Downloads\\drive");
		driver.findElement(By.id("searchBar")).sendKeys("City");
		Assert.assertEquals("City", driver.findElement(By.id("searchBar")).getAttribute("value"));
   
		
		driver.get("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
		System.getProperty("webdriver.gecko.driver","C:\\Users\\Guto Soares\\Downloads\\drive");
		driver.findElement(By.id("searchBar")).sendKeys("City 1.5 Automatico");
		Assert.assertEquals("City 1.5 Automatico", driver.findElement(By.id("searchBar")).getAttribute("value"));
 
       
		driver.get("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
		System.getProperty("webdriver.gecko.driver","C:\\Users\\Guto Soares\\Downloads\\drive");
		driver.findElement(By.id("searchBar")).sendKeys(" Honda " + " City " );
		
			
	}
}