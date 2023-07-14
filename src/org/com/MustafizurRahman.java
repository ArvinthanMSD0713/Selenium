package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MustafizurRahman {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		signin.click();
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("arvinthanjoshna13@gmail.com");
	}
}
