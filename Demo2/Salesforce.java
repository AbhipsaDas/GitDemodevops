package Demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://login.salesforce.com");//url in the browser
	driver.findElement(By.id("username")).sendKeys("hellologin");
	driver.findElement(By.name("pw")).sendKeys("Secret");
  //      driver.findElement(By.className("button r4 wide primary")).click();//it will throw error as it will throw error as compund class names not selected
	driver.findElement(By.xpath("//*[@id='Login']")).click();
System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());//it will display the message on the output.Get text will grab the text
	
	
		
		
		
		
	}

}
