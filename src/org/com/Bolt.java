package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bolt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement login=driver.findElement(By.name("username"));
		login.sendKeys("arvinthanjoshna26@gmail.com");
		String attribute = login.getAttribute("value");
		System.out.println(attribute);
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("23rtj3rgtin@gmail.com");
		String attribute1 = pass.getAttribute("value");
		System.out.println(attribute1);
	}
}

