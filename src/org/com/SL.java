package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SL {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("iphone");
		WebElement txt1 = driver.findElement(By.xpath("//input[@type='submit']"));
		txt1.click();
	}
}
