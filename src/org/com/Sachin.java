package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Sachin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("hp core i7 11th gen",Keys.ENTER);
		WebElement hp=driver.findElement(By.xpath("//span[text()='HP Pavilion 14, 11Th Gen Intel Core I7-16Gb Ram/1Tb Ssd 14 Inches Laptop/Intel Iris Xe Graphics/Backlit Keyboard/Alexa/B&O Audio/Fast Charge/Fpr/Windows 11 Home/Ms Office, 14-Dv1029Tu,Natural Silver']"));
		hp.click();
	}
}
