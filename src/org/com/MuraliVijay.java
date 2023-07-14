package org.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MuraliVijay {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Actions act=new Actions(driver);
		WebElement signin=driver.findElement(By.xpath("//a[text()='Sign up']"));
		act.click(signin).perform();
		WebElement mobile=driver.findElement(By.name("mobile"));
		mobile.sendKeys("8903641748");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys("arvinthan");
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("arvinthan1234@gmail.com");
		WebElement click=driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		act.click(click).perform();
	}
}
