package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\PrachiWorkplace\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	//*	driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr/td/div/form/input"));
		driver.findElement(By.xpath("//input[@type='button']"));
     System.out.println(driver.switchTo().alert().getText());// it will display the text present in the alert box
		driver.switchTo().alert().accept();//accept= ok, done, yes(positive scenario case)
	//* driver.switchTo().alert().dismiss();// negative scenario
		
		
	}

}
