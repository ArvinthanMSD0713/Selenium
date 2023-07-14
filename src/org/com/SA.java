package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SA {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("Arvinthan@0713");
		WebElement txt1 = driver.findElement(By.id("btn1"));
		txt1.click();
		WebElement txt2 = driver.findElement(By.id("btn2"));
		txt2.click();
	}
}
