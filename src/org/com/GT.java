package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class GT {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver txt=new ChromeDriver();
		txt.get("http://demo.guru99.com/test/drag_drop.html");
		Actions act=new  Actions(txt);
		WebElement source= txt.findElement(By.id("credit2"));
		WebElement target= txt.findElement(By.id("bank"));
		act.dragAndDrop(source, target).perform();
		WebElement source1= txt.findElement(By.id("fourth"));
		WebElement target1= txt.findElement(By.id("amt7"));
		act.dragAndDrop(source1, target1).perform();
		WebElement source2= txt.findElement(By.id("credit1"));
		WebElement target2= txt.findElement(By.id("loan"));
		act.dragAndDrop(source2, target2).perform();
		WebElement source3= txt.findElement(By.id("fourth"));
		WebElement target3= txt.findElement(By.id("amt8"));
		act.dragAndDrop(source3, target3).perform();
	}
}
