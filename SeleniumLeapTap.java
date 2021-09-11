package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLeapTap {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title = driver.getTitle();
		System.out.println("title:"+title);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Softwaresolns");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Deepika");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Murugan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deeps");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/6/95");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Basic Info");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1 lac");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("20");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("testleaf.com");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Profile Updates");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("To be filled by today");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("44");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Manager");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("123 abc");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Seattle");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("WA");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("98101");
		driver.findElement(By.linkText("Create Lead")).click();
		
	
	}

}
