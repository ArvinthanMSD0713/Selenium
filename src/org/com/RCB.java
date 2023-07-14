package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RCB {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txt=driver.findElement(By.xpath("//span[text()='Account']"));
		txt.click();
		WebElement txt1=driver.findElement(By.xpath("//span[text()='Login/ Sign Up']"));
		txt1.click();
		Thread.sleep(8000);
		WebElement txt2=driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']"));
		txt2.sendKeys("8903654324");
	}
}

