package org.com;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public interface ZaheerKhan {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		WebElement X=driver.findElement(By.xpath("//button[text()='✕']"));
		X.click();
		WebElement womens=driver.findElement(By.xpath("//div[text()='Fashion']"));
		act.moveToElement(womens).perform();
		WebElement womensfoot=driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		act.moveToElement(womensfoot).perform();
		WebElement womensfootwear=driver.findElement(By.xpath("//a[text()='Women Slipper Flip Flops']"));
		womensfootwear.click();
		Thread.sleep(3000);
		WebElement baby=driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		act.moveToElement(baby).perform();
		Thread.sleep(3000);
		WebElement toy=driver.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		toy.click();
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.xpath("//span[text()='Electronics']"));
		act.moveToElement(phone).perform();
		Thread.sleep(3000);
		WebElement realme=driver.findElement(By.xpath("//a[text()='Realme']"));
		realme.click();
		Thread.sleep(3000);
		WebElement realmi1=driver.findElement(By.xpath("//div[text()='realme C55 (Rainforest, 128 GB)']"));
		realmi1.click();
		String CurrentWindowsId=driver.getWindowHandle();
		System.out.println("Current Windows Id is : " +CurrentWindowsId);
		Set<String> AllWindowsId=driver.getWindowHandles();
		System.out.println("All Windows Id is : " +AllWindowsId);
		for(String a : AllWindowsId) {
			if(! CurrentWindowsId.equals(a)) {
				driver.switchTo().window(a);
				System.out.println("1St Child Windows Id is : " +a);
			}
		}
		WebElement tv=driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		act.moveToElement(tv).perform();
		Thread.sleep(3000);
		WebElement mi=driver.findElement(By.xpath("//a[text()='Mi']"));
		mi.click();
		Thread.sleep(3000);
		WebElement mitv=driver.findElement(By.xpath("//div[text()='MarQ by Flipkart by Flipkart 80 cm (32 inch) HD Ready LED TV']"));
		mitv.click();
	}
}
