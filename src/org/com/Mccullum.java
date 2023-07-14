package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mccullum {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement from=driver.findElement(By.name("from_station"));
		from.sendKeys("Chennai");
		WebElement to=driver.findElement(By.name("to_station"));
		to.sendKeys("Coimbatore");
		Actions mov=new Actions(driver);
		WebElement click=driver.findElement(By.id("trainFormButton"));
		mov.doubleClick(click).perform();
	}
}
