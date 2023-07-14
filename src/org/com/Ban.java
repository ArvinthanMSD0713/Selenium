package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ban {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("arvinthanfearless@0713");
		WebElement txt1 = driver.findElement(By.xpath("//input[@type='password']"));
		txt1.sendKeys("123lkjb450713");
		WebElement txt2 = driver.findElement(By.xpath("//button[@value='1']"));
		txt2.click();
	}
}
