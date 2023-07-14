package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WTC23 {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.whatsapp.com/");
//		driver.navigate().to("https://www.instagram.com/"); // or driver.get("https://www.instagram.com/");
//		driver.navigate().to("https://www.snapchat.com");
//		driver.navigate().to("https://www.youtube.com");
		driver.get("https://www.facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		String title = driver.getTitle();
//		System.out.println(title);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		String pagesource = driver.getPageSource();
//		System.out.println(pagesource);
		WebElement txtUserName=driver.findElement(By.id("email"));
		txtUserName.sendKeys("arvinthan@0713");
		WebElement txtpassword=driver.findElement(By.id("pass"));
		txtpassword.sendKeys("0703131842");
		WebElement buttonlogin=driver.findElement(By.name("login"));
		buttonlogin.click();
//		WebElement txtElement=driver.findElement(By.tagName("h2"));
//		String txt=txtElement.getText();
//		System.out.println(txt);
//		WebElement linkText=driver.findElement(By.linkText("Forgotten password?"));
//		String txt1=linkText.getText();
//		System.out.println(txt1);
//		WebElement partialLinkText=driver.findElement(By.partialLinkText("Forgotten"));
//		String txt2=linkText.getText();
//		System.out.println(txt2);
//		driver.close();
	}
}
