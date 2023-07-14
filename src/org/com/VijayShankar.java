package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VijayShankar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement login=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		login.sendKeys("8903641748");
		WebElement OTP=driver.findElement(By.xpath("//button[text()='Request OTP']"));
		OTP.click();
		WebElement txt=driver.findElement(By.xpath("//input[@value='8903641748']"));
		String text = txt.getText();
		System.out.println(text);
		Thread.sleep(2000);
		WebElement quit=driver.findElement(By.xpath("//button[text()='✕']"));
		quit.click();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
		search.sendKeys("Readmi note 7pro", Keys.ENTER);
		Thread.sleep(5000);
		WebElement bat=driver.findElement(By.xpath("//div[text()='Redmi Note 7 Pro (Space Black, 128 GB)']"));
		bat.click();
	}
}
