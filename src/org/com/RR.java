package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RR {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://traininginchennai.in/selenium-training-in-chennai.html");
		Actions mov=new Actions(driver);
		WebElement course=driver.findElement(By.xpath("//div[text()='Courses ']"));
		mov.moveToElement(course).perform();
		WebElement program=driver.findElement(By.xpath("//span[text()='Master Program (8)']"));
		mov.moveToElement(program).perform();
	}
}
