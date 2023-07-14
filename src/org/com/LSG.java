package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LSG {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		Thread.sleep(5000);
		WebElement frame=driver.findElement(By.name("a077aa5e"));		
		driver.switchTo().frame(frame);
		WebElement meter=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		meter.click();
	}
}
