package org.com;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Cheeka {
	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	Actions act=new Actions(driver);
	WebElement name=driver.findElement(By.name("firstName"));
	name.sendKeys("Arvinthan");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	WebElement month=driver.findElement(By.id("month"));
	Select s=new Select(month);
	s.selectByValue("1");
	WebElement day=driver.findElement(By.name("day"));
	day.sendKeys("26");
	WebElement year=driver.findElement(By.name("year"));
	year.sendKeys("2001");
	WebElement gender=driver.findElement(By.id("gender"));
	Select s1=new Select(gender);
	s1.selectByValue("1");
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	WebElement txt=driver.findElement(By.xpath("(//div[@class='enBDyd '])[3]"));
	act.click(txt).perform();
	WebElement name1=driver.findElement(By.name("Username"));
	name1.sendKeys("Arvinthanjoshna13");
}
}
