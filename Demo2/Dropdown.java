package Demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//* need to select a value from a dropdown*//
		//Select s= new Select();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.print(driver.findElement(By.id("divpaxinfo")).getText());
	/*t i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;	
		}*/
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 adult");
			
         System.out.print(driver.findElement(By.id("divpaxinfo")).getText());
	
	}

}
