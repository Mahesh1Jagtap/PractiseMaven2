package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjioTest {

	@Test
	public void Perfume()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement searchtf = driver.findElement(By.name("searchVal"));
		searchtf.sendKeys("Perfume");
		searchtf.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("img[alt='Product image of Essenza Di Wills Inizio Aqua Homme Deodorant Spray']")).click();
		
	}
}
