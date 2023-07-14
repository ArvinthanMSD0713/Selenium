package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WI {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement txt = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txt.sendKeys("Arvinthan@0713");
		WebElement txt1 = driver.findElement(By.xpath("//input[@type='tel']"));
		txt1.sendKeys("1234567890");
		WebElement txt3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		txt3.click();
		WebElement txt4 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		txt4.click();
	}
}
