package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class KKR {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement name=driver.findElement(By.name("email"));
		//based on java
		js.executeScript("arguments[0].setAttribute('value','arvinthanjoshna13@gmail.com')", name);
		String attribute=name.getAttribute("value");
		System.out.println("email : " +attribute);
		//based on javascript
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", name);
		System.out.println("email : " +executeScript);
		WebElement pass=driver.findElement(By.name("pass"));
		js.executeScript("arguments[0].setAttribute('value','039rtuygffgfr')", pass);
		WebElement login=driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", login);
	}
}
