package org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Ire {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMESH\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement txt=driver.findElement(By.id("username"));
	txt.sendKeys("Joshna2613");
	WebElement txt1=driver.findElement(By.id("password"));
	txt1.sendKeys("Arvinthanjoshna26");
	WebElement txt2=driver.findElement(By.id("login"));
	txt2.click();
	WebElement location=driver.findElement(By.name("location"));
	Select s=new Select(location);
	s.selectByValue("Sydney");
	WebElement hotels=driver.findElement(By.name("hotels"));
	Select a=new Select(hotels);
	a.selectByValue("Hotel Creek");
	WebElement roomtype=driver.findElement(By.name("room_type"));
	Select j=new Select(roomtype);
	j.selectByValue("Super Deluxe");
	WebElement roomnos =driver.findElement(By.name("room_nos"));
	Select l=new Select(roomnos);
	l.selectByVisibleText("1 - One");
//	WebElement date=driver.findElement(By.name("datepick_in"));
//	Select a1=new Select(date);
//	a1.selectByIndex(16/05/2022);
//	WebElement pick=driver.findElement(By.name("datepick_out"));
//	Select j1=new Select(pick);
//	j1.selectByIndex(17/05/2022);
	WebElement adult=driver.findElement(By.name("adult_room"));
	Select a2=new Select(adult);
	a2.selectByVisibleText("2 - Two");
	WebElement child=driver.findElement(By.name("child_room"));
	Select j2=new Select(child);
	j2.selectByVisibleText("0 - None");
	WebElement submit=driver.findElement(By.name("Submit"));
	submit.click();
	WebElement click=driver.findElement(By.name("radiobutton_0"));
	click.click();
	WebElement cont=driver.findElement(By.name("continue"));
	cont.click();
	WebElement name=driver.findElement(By.name("first_name"));
	name.sendKeys("Arvinthan");
	WebElement lastname=driver.findElement(By.name("last_name"));
	lastname.sendKeys("Joshna");
	WebElement add=driver.findElement(By.name("address"));
	add.sendKeys("Chennai");
	WebElement num=driver.findElement(By.name("cc_num"));
	num.sendKeys("9087654321543765");
	WebElement type=driver.findElement(By.name("cc_type"));
	Select a3=new Select(type);
	a3.selectByValue("VISA");
	WebElement month=driver.findElement(By.name("cc_exp_month"));
	Select j3=new Select(month);
	j3.selectByValue("8");
	WebElement year=driver.findElement(By.name("cc_exp_year"));
	Select a4=new Select(year);
	a4.selectByValue("2030");
	WebElement cvv=driver.findElement(By.name("cc_cvv"));
	cvv.sendKeys("234");
	WebElement book=driver.findElement(By.name("book_now"));
	book.click();
	Thread.sleep(6000);
	WebElement my=driver.findElement(By.name("my_itinerary"));
	my.click();
	}
}
