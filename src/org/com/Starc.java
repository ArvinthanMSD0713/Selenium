package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Starc {
	 public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("greens velmurugan", Keys.ENTER);
		WebElement click=driver.findElement(By.xpath("//h3[text()='Velmurugan K']"));
		click.click();
	}
}
