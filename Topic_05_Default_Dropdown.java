package selenium;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_05_Default_Dropdown {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://daominhdam.github.io/basic-form/index.html");
		driver.manage().timeouts().implicitlyWait(330, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01() throws Exception {
		WebElement jobRoleDropdown = driver.findElement(By.xpath("//select[@id='job1']"));
		Select jobRole = new Select(jobRoleDropdown);
		Assert.assertFalse(jobRole.isMultiple());
		
		// Select Index: start by 0
	
		jobRole.selectByVisibleText("Automation Tester");
		Thread.sleep(3000);

		// Check input valid value
		Assert.assertEquals(jobRole.getFirstSelectedOption().getText(), "Automation Tester");

		// Chose Manual Tester by Select Value
		jobRole.selectByValue("manual");
		Thread.sleep(3000);
		Assert.assertEquals(jobRole.getFirstSelectedOption().getText(), "Manual Tester");

		// Chose Mobile Tester by Select Index
		jobRole.selectByIndex(3);
		Thread.sleep(3000);
		Assert.assertEquals(jobRole.getFirstSelectedOption().getText(), "Mobile Tester");

		// Check dropdown with 5 value
		Assert.assertEquals(jobRole.getOptions().size(), 5);
		System.out.println(jobRole.getOptions().size());

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}