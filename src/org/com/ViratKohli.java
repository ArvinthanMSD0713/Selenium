package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ViratKohli {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions act=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//div[@id='heading201']"));
		act.click(click).perform();
		WebElement click1=driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
		act.click(click1).perform();
	}
}
