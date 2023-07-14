package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Nattu {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.id("home-tab"));
		click.click();
		WebElement txt=driver.findElement(By.xpath("//p[text()='Velmurugan has a passion for teaching and has spent years speaking at conferences and delivering online learning content.']"));
		String text=txt.getText();
		System.out.println(text);
		WebElement txt1=driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]" + "\t"));
		String text1=txt1.getText();
		System.out.println(text1);
		WebElement txt2=driver.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[2]"));
		String text2=txt2.getText();
		System.out.println(text2);
	}
}
