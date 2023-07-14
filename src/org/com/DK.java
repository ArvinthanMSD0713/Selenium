package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DK {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Actions act=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//span[text()='Sign In']"));
		act.click(click).perform();
		WebElement login=driver.findElement(By.xpath("//a[text()='login']"));
		act.click(login).perform();
		Thread.sleep(4000);
		WebElement name=driver.findElement(By.id("userName"));
		name.sendKeys("9876545607");
	}
}
