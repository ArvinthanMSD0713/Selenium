package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DC {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//frame Value
		driver.switchTo().frame("login_page");
		
		//webElent For Login Page
		WebElement login=driver.findElement(By.name("fldLoginUserId"));
		driver.switchTo().frame(login);
	}
}
