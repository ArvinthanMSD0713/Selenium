package org.com;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MSD {
	public static WebDriver driver;
	public static void screenshot(String name) {
		try {
			TakesScreenshot sc=(TakesScreenshot)driver;
			File source=sc.getScreenshotAs(OutputType.FILE);
			File target=new File("C:\\Users\\RAMESH\\OneDrive\\Pictures\\Camera imports\\" +name+ ".jpg");
			FileUtils.copyFile(source, target);
		} catch	(Exception e) {
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://traininginchennai.in/selenium-training-in-chennai.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement viewmore=driver.findElement(By.id("toggle-new"));
		js.executeScript("arguments[0].scrollIntoView(true)", viewmore);
		screenshot("Virat");
		Thread.sleep(3000);
		WebElement top=driver.findElement(By.xpath("//h1[text()='Selenium Training and Certification in Chennai']"));
		js.executeScript("arguments[0].scrollIntoView(false)", top);
		screenshot("MSD");
	}
}
