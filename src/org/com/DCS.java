package org.com;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DCS {
	public static WebDriver driver;
	public static void screenshot(String name) {
		try {
			TakesScreenshot sc=(TakesScreenshot) driver;
			File source=sc.getScreenshotAs(OutputType.FILE);
			File target=new File("C:\\Users\\RAMESH\\OneDrive\\Pictures\\Camera imports\\" +name+ ".jpg");
			FileUtils.copyFile(source, target);
			} catch (Exception e) {
			}
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		screenshot("First");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("field-keywords"));
		search.sendKeys("One Plus11 5G", Keys.ENTER);
		WebElement Oneplus=driver.findElement(By.xpath("//span[text()='OnePlus 11 5G (Titan Black, 16GB RAM, 256GB Storage)']"));
		Oneplus.click();
		String CurrentWindowId=driver.getWindowHandle();
		System.out.println("Current Window Id is :" + CurrentWindowId);
		Set<String> allwindowsId1=driver.getWindowHandles();
		System.out.println("All Windows Id is :" + allwindowsId1);
		for (String x : allwindowsId1) {
			if(! CurrentWindowId.equals(x)) {
				driver.switchTo().window(x);
				System.out.println("1st Child Window Id is :" + x);
			}
		}
		WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		Thread.sleep(4000);
		screenshot("One plus11 5G");
		driver.switchTo().window(CurrentWindowId);
		Thread.sleep(2000);
		WebElement oneplus2=driver.findElement(By.xpath("//span[text()='OnePlus 11R 5G (Galactic Silver, 16GB RAM, 256GB Storage)']"));
		oneplus2.click();
		Set<String> allwindowsId2=driver.getWindowHandles();
		System.out.println(" All Windows Id 2 is :" + allwindowsId2);
		List<String> li=new LinkedList<String>();
		li.addAll(allwindowsId2);
		String secondchildWindowsId=li.get(2);
		System.out.println("Second Child Windows Id is :" +secondchildWindowsId);
		driver.switchTo().window(secondchildWindowsId);
		Thread.sleep(3000);
		WebElement addtocart2=driver.findElement(By.name("submit.add-to-cart"));
		addtocart2.click();
		Thread.sleep(3000);
		screenshot("One plus11R 5G");
	}
}
	
