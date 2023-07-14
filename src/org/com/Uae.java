package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Uae {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txt=driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		txt.click();
		Thread.sleep(2000);
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Joshna");
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("Arvinthan");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("arvinthanjoshna@098763");
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("erfgefgf234098763");
		WebElement date=driver.findElement(By.name("birthday_day"));
		Select s=new Select(date);
		s.selectByIndex(25);
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByIndex(0);
		WebElement year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2001");
		WebElement gender=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender.click();
	}
}
