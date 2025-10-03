package projDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aleen\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      
		WebDriver driver= new ChromeDriver();
      
		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("aleenac2002@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("aleena");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input")).click();
		

      
		
		
		
	}

}
