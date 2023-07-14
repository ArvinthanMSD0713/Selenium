package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class India {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement txtElement=driver.findElement(By.tagName("h2"));
		String txt=txtElement.getText();
		System.out.println(txt);
		WebElement linktext=driver.findElement(By.linkText("Forgotten password?"));
		String txt1=linktext.getText();
		System.out.println(txt1);
		WebElement partial=driver.findElement(By.partialLinkText("Forgotten"));
		String txt2=partial.getText();
		System.out.println(txt2);
	}
}
