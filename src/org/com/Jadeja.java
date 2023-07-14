package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Jadeja {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
//		WebElement interview=driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[1]"));
//		interview.click();
		WebElement interview=driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));
		interview.click();
		Actions act=new Actions(driver);
		WebElement ctsinterview=driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		act.contextClick(ctsinterview).perform();
	}
}
