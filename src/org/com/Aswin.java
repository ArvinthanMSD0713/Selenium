package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Aswin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		Actions act=new Actions(driver);
		WebElement login=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		login.sendKeys("8903641748");
		WebElement click=driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		act.click(click).perform();
	}
}
