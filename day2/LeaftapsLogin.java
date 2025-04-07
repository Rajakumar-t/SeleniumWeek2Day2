package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapsLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		//launch browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//login
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//navigating to account name
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Democsr");
		//seleting induetry 
		WebElement industryDropdown=driver.findElement(By.name("industryEnumId"));
		Select dropdown = new Select(industryDropdown);
		dropdown.selectByVisibleText("Computer Software");
		//seleting ownership
		WebElement ownershipDropdown=driver.findElement(By.name("ownershipEnumId"));
		Select dropdown1 = new Select(ownershipDropdown);
		dropdown1.selectByVisibleText("S-Corporation");
		//seleting Source
		WebElement SourceDropdown=driver.findElement(By.name("dataSourceId"));
		Select dropdown2 = new Select(SourceDropdown);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		//marketingCampaign
		WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
        new Select(marketingDropdown).selectByIndex(6);
        //state 
        WebElement stateProvince = driver.findElement(By.id("generalStateProvinceGeoId"));
        new Select(stateProvince).selectByValue("TX");
       //click submit
       driver.findElement(By.className("smallSubmit")).click();
       
       
       String Name = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
       System.out.println(Name);
       if (Name.contains("Democsr")) {
       System.out.println("Verify that the account name is displayed correctly");
       } else {
		System.out.println("False");
	}
       driver.close();
	
       
	}
	}
