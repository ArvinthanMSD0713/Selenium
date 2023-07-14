package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrettLee {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		WebElement search=driver.findElement(By.id("autocomplete"));
		search.sendKeys("hp mouse", Keys.ENTER);
		WebElement click=driver.findElement(By.xpath("//h2[text()='Wired Mouse']"));
		click.click();
	}
}
