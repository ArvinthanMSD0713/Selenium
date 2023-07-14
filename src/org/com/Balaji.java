package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Balaji {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("arvinthanjoshna13@gmail.com");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("234tgfdsddb@gmail.com");
		WebElement print=driver.findElement(By.xpath("//div[@class='_8iep _8icy _9ahz _9ah-']"));
		String text=print.getText();
		System.out.println(text);
	}
}
