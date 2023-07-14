package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Eng {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		WebElement txt = driver.findElement(By.name("username"));
		txt.sendKeys("Arvinthan@0713");
		WebElement txt1 = driver.findElement(By.name("password"));
		txt1.sendKeys("12345bzxcvb0713");
	}
}
