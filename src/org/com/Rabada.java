package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Rabada {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		Actions act=new Actions(driver);
		WebElement not=driver.findElement(By.xpath("//button[text()='NOT NOW']"));
		not.click();
		WebElement mobile=driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		act.moveToElement(mobile).perform();
		WebElement cover=driver.findElement(By.xpath("//span[text()='Printed Back Covers']"));
		cover.click();
		WebElement home=driver.findElement(By.xpath("//span[text()='Home']"));
		home.click();
		Thread.sleep(3000);
		WebElement womens=driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		act.moveToElement(womens).perform();
		WebElement heals=driver.findElement(By.xpath("//span[text()='Heels']"));
		heals.click();
	}
}
