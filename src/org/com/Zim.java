package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zim {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txt= driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		String actualMsg=txt.getText();
		System.out.println(actualMsg);
		String expectedMsg="Facebook helps you connect and share with the people in your life.";
		System.out.println(expectedMsg);
		if(expectedMsg.equals(actualMsg)) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
		WebElement txt2= driver.findElement(By.xpath("//div[contains(text(),'for a celebrity, brand or business.')]"));
		String any = txt2.getText();
		System.out.println(any);
		
	}
}
