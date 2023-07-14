package org.com;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class BhuvaneshvarKumar {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		act.moveToElement(click).perform();
		WebElement mobile=driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		mobile.click();
		String CurrentWindowsid=driver.getWindowHandle();
		System.out.println("Current Windows Id is : " +CurrentWindowsid);
		Set <String> allWindowsId1=driver.getWindowHandles();
		System.out.println("All Windows Id is : " +allWindowsId1);
		for (String x : allWindowsId1) {
			if(! CurrentWindowsid.equals(x)) {
				driver.switchTo().window(x);
				System.out.println("Child Windows Id is : " +x);
			}
		}
		WebElement phone=driver.findElement(By.xpath("//span[text()='Nokia C01 Plus (Blue, 2GB RAM, 32GB ROM)']"));
		phone.click();
		Set<String> allWindowsId2=driver.getWindowHandles();
		System.out.println("All Windows Id 2 is : " +allWindowsId2);
		List<String> li=new LinkedList<String>();
		li.addAll(allWindowsId1);
		WebElement sports=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		act.moveToElement(sports).perform();
		WebElement gym=driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		gym.click();
	}
}
