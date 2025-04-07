package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelect {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		//launch browser
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//span[text()='Decline optional cookies'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("(//span[text()='Decline optional cookies'])[1]")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jack");
		
		WebElement Dob = driver.findElement(By.id("day"));
		new Select(Dob).selectByIndex(2);
		WebElement Month = driver.findElement(By.id("day"));
		new Select(Month).selectByValue("1");
		WebElement year = driver.findElement(By.id("year"));
		new Select(year).selectByValue("1999");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("raj@fdfsdfs.com");
		}

}
