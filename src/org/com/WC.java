package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WC {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/login");
		WebElement txt = driver.findElement(By.id("userName"));
		txt.sendKeys("8903641748");
		WebElement txt1 = driver.findElement(By.id("checkUser"));
		txt1.click();
	}
}
