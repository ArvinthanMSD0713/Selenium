package org.com;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VenkateshIyer {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		List<WebElement> tRow=driver.findElements(By.tagName("tr"));
		int size=tRow.size();
		System.out.println(size);
		for(int i=0; i<tRow.size(); i++) {
			WebElement webElement=tRow.get(i);
			String text=webElement.getText();
			System.out.println(text + "\n");
		}
		List<WebElement> tData=driver.findElements(By.tagName("td"));
		int size1=tData.size();
		System.out.println(size1);
		for(int i=0; i<tData.size(); i++) {
			WebElement webElement=tData.get(i);
			String text1=webElement.getText();
			System.out.println(text1);
		}
	}
}
