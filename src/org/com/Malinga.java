package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Malinga {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		Actions act=new Actions(driver);
		WebElement shop=driver.findElement(By.xpath("//a[text()='All Departments']"));
		act.moveToElement(shop).perform();
		WebElement heat=driver.findElement(By.xpath("//a[text()='Heating, Cooling & Air Quality']"));
		act.moveToElement(heat).perform();
		WebElement air=driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		act.moveToElement(air).perform();
		WebElement portable=driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		portable.click();
		WebElement shop1=driver.findElement(By.xpath("//a[text()='All Departments']"));
		act.moveToElement(shop1).perform();
		WebElement paint=driver.findElement(By.xpath("//a[text()='Paint']"));
		act.moveToElement(paint).perform();
		WebElement inner=driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		act.moveToElement(inner).perform();
		WebElement cell=driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		cell.click();
	}
}
