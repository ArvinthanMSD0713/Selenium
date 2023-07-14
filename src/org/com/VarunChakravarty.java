package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VarunChakravarty {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		WebElement txt=driver.findElement(By.tagName("u"));
		String text=txt.getText();
		System.out.println(text);
		WebElement txt1=driver.findElement(By.xpath("(//p[@style='text-align:justify; font-size:18px;'])[2]"));
		String text1=txt1.getText();
		System.out.println(text1);
	}
}
