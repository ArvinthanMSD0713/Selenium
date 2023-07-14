package org.com;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class JofraArcher {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Actions act=new Actions(driver);
		WebElement course=driver.findElement(By.xpath("//div[text()='Courses ']"));
		act.click(course).perform();
		WebElement test=driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		act.click(test).perform();
		WebElement test1=driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		test1.click();
		String CurrentWindowsId=driver.getWindowHandle();
		System.out.println("Current Windows Id is : " +CurrentWindowsId);
		Set<String> AllWindowsId=driver.getWindowHandles();
		System.out.println("All Windows Id is : " +AllWindowsId);
		for(String a : AllWindowsId) {
			if(! CurrentWindowsId.equals(a)) {
				driver.switchTo().equals(a);
				System.out.println("1st Child Window Id is : " +a);
			}
			WebElement course1=driver.findElement(By.xpath("//div[text()='Courses ']"));
			act.click(course1).perform();
			WebElement oracle=driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
			act.click(oracle).perform();
			WebElement oracle1=driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
			oracle1.click();
		}
		Set<String> AllWindowsId1=driver.getWindowHandles();
		System.out.println("All Windows Id 1 is : " +AllWindowsId1);
		List<String> aj=new LinkedList<String>();
		aj.addAll(AllWindowsId1);
		WebElement course2=driver.findElement(By.xpath("//div[text()='Courses ']"));
		act.click(course2).perform();
		WebElement data=driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		act.click(data).perform();
		WebElement IT=driver.findElement(By.xpath("//span[text()='Informatica Certification Training']"));
		IT.click();
		Set<String> AllWindowsId2=driver.getWindowHandles();
		System.out.println("All Windows Id 2 is : " +AllWindowsId2);
		List<String> ja=new LinkedList<String>();
		ja.addAll(AllWindowsId2);
		WebElement course3=driver.findElement(By.xpath("//div[text()='Courses ']"));
		act.click(course3).perform();
		WebElement rpa=driver.findElement(By.xpath("//span[text()='RPA (6)']"));
		act.click(rpa).perform();
		WebElement blue=driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
		blue.click();
		Set<String> AllWindowsId3=driver.getWindowHandles();
		System.out.println("All Windows Id 3 is : " +AllWindowsId3);
		List<String> jla=new LinkedList<String>();
		jla.addAll(AllWindowsId3);
		WebElement course4=driver.findElement(By.xpath("//div[text()='Courses ']"));
		act.click(course4).perform();
		WebElement msbi=driver.findElement(By.xpath("//span[text()='MSBI (8)']"));
		act.click(msbi).perform();
	}
}
