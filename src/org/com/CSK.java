package org.com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CSK {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txt=driver.findElement(By.xpath("//a[text()='Create new account']"));
		txt.click();
		Thread.sleep(4000);
		WebElement txt1=driver.findElement(By.name("firstname"));
		txt1.sendKeys("Arvinthan");
		WebElement txt2=driver.findElement(By.name("lastname"));
		txt2.sendKeys("Joshna");
		WebElement txt3=driver.findElement(By.name("reg_email__"));
		txt3.sendKeys("Arvinthanjoshna@1-203487");
		WebElement txt4=driver.findElement(By.name("reg_passwd__"));
		txt4.sendKeys("987fghjkkjhg203487");
		WebElement year=driver.findElement(By.id("year"));
		Select a=new Select(year);
		a.selectByValue("2000");
		List <WebElement> options = a.getOptions();
		int size=options.size();
		System.out.println("Size of the list :" +size);
//		iterate
		for(int i=0; i<options.size(); i++) {
			WebElement aj=options.get(i);
			String text=aj.getText();
			System.out.println(text);
		}
//		enhaced loop
		for (WebElement msg:options) {
			String text=msg.getText();
			System.out.println();
		}
//		check multi choice
		boolean multi=a.isMultiple();
		System.out.println("Multi is possible :" +multi);
		driver.close();
		driver.quit();
	}
}
