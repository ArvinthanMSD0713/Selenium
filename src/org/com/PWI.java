package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class PWI {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		Actions mov=new Actions(driver);
		WebElement txt=driver.findElement(By.xpath("//input[@title='From station']"));
		txt.sendKeys("Chennai");
		WebElement txt1=driver.findElement(By.xpath("//input[@title='To station']"));
		txt1.sendKeys("Coimbatore");
		WebElement txt2=driver.findElement(By.id("trainFormButton"));
		mov.doubleClick(txt2).perform();
	}
}
