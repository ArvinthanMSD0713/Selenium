package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class JaspirtBumhraaa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		WebElement click=driver.findElement(By.xpath("//button[text()='✕']"));
		click.click();
		Actions ac=new Actions(driver);
		WebElement mov=driver.findElement(By.xpath("//div[text()='Home & Furniture']"));
		ac.moveToElement(mov).perform();
		WebElement act=driver.findElement(By.xpath("//a[text()='Furniture Studio']"));
		act.click();
	}
}
