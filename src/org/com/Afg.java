package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Afg {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//div[@id='heading20']"));
		txt.click();
		WebElement txt1 = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question')]"));
		txt1.click();
	}
}
