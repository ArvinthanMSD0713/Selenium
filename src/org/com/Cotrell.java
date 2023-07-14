package org.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Cotrell {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver diver=new ChromeDriver();
		diver.get("https://www.facebook.com/");
		WebElement email=diver.findElement(By.name("email"));
		email.sendKeys("8903641748");
		Actions act=new Actions(diver);
		act.doubleClick(email).perform();
		act.contextClick(email).perform();
		Robot k=new Robot();
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_DOWN);
		k.keyRelease(KeyEvent.VK_DOWN);
		k.keyPress(KeyEvent.VK_ENTER);
		k.keyRelease(KeyEvent.VK_ENTER);
		k.keyPress(KeyEvent.VK_TAB);
		k.keyRelease(KeyEvent.VK_TAB);
		k.keyPress(KeyEvent.VK_CONTROL);
		k.keyPress(KeyEvent.VK_V);
		k.keyRelease(KeyEvent.VK_CONTROL);
		k.keyRelease(KeyEvent.VK_V);
	}
}
