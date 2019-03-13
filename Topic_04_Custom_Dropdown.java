package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Topic_04_Custom_Dropdown {
	//Declare a driver
	WebDriver driver;
	//Information Exercise 03
	//Xpath control
	//URL
	String Ex03_URL = "http://demo.guru99.com/v4";
	//Login Form
	String Ex03_Txtbox_UserId = "//input[@type = 'text']";
	String Ex03_Txtbox_Pass = "//input[@type = 'password']";
	String Ex03_btn_Login = "//input[@type = 'submit']";
	//Main homepage
	String Ex03_txt_Welcome = "//marquee[text() = \"Welcome To Manager's Page of Guru99 Bank\"]";
	String Ex03_txt_Edit_Customer = "//a[text() = 'Edit Customer']";
	String Ex03_txt_New_Customer = "//a[text() = 'New Customer']";
	//New Customer form
	String Ex03_txt_Add_New_Customer = "//p[text() = 'Add New Customer']";
	String Ex03_txt_Customer_Name= "//input[@onblur='validatecustomername();']";
	String Ex03_radio_Male = "//input[@value = 'm']";
	String Ex03_txt_DateOfBirth = "//input[@id='dob']";
	String Ex03_txt_Address = "//textarea[@onblur='validateAddress();']";
	String Ex03_txt_City = "//input[@onblur='validateCity();']";
	String Ex03_txt_State = "//input[@onblur='validateState();']";
	String Ex03_txt_PIN = "//input[@onblur='validatePIN();']";
	String Ex03_txt_Mobile_Number = "//input[@onblur='validateTelephone();']";
	String Ex03_txt_Email = "//input[@onblur='validateEmail();']";
	String Ex03_txt_Password = "//input[@type = 'password']";
	String Ex03_btn_Submit = "//input[@type = 'submit']";
	//Register successfully screen
	String Ex03_txt_Reg_Success = "//p[text() = 'Customer Registered Successfully!!!']";
	String Ex03_tbl_CustomerID = "//td[text() = 'Customer ID']/following-sibling::td";
	//Login Edit Customer
	String Ex03_txt_Edit_Form = "//p[text() = 'Edit Customer Form']";
	String Ex03_txt_CustomerId_Edit = "//input[@type = 'text']";
	//Edit Customer screen
	String Ex03_txt_EditCustomer_Title = "//p[text() = 'Edit Customer']";
	String Ex03_txt_EditCustomer_Name= "//input[@name = 'name']";
	String Ex03_txt_EditGender = "//input[@name = 'gender']";
	String Ex03_txt_EditDateOfBirth = "//input[@name = 'dob']";
	String Ex03_txt_EditAddress = "//textarea[@name = 'addr']";
	String Ex03_txt_EditCity = "//input[@name = 'city']";
	String Ex03_txt_EditState = "//input[@name = 'state']";
	String Ex03_txt_EditPIN = "//input[@name = 'pinno']";
	String Ex03_txt_EditMobile_Number = "//input[@name = 'telephoneno']";
	String Ex03_txt_EditEmail = "//input[@name = 'emailid']";
	//Updated successfully screen
	String Ex03_txt_Customer_Update_Success = "//p[text() = 'Customer details updated Successfully!!!']";
	String Ex03_tbl_Customer_Name = "//td[text() = 'Customer Name']/following-sibling::td";
	String Ex03_tbl_Gender = "//td[text() = 'Gender']/following-sibling::td";
	String Ex03_tbl_Birthdate = "//td[text() = 'Birthdate']/following-sibling::td";
	String Ex03_tbl_Address = "//td[text() = 'Address']/following-sibling::td";
	String Ex03_tbl_City = "//td[text() = 'City']/following-sibling::td";
	String Ex03_tbl_State = "//td[text() = 'State']/following-sibling::td";
	String Ex03_tbl_PIN = "//td[text() = 'Pin']/following-sibling::td";
	String Ex03_tbl_Mobile = "//td[text() = 'Mobile No.']/following-sibling::td";
	String Ex03_tbl_Email = "//td[text() = 'Email']/following-sibling::td";
	
	//Content input
	String Ex03_User_Login = "mngr155533";
	String Ex03_Password_Login = "aqAtAda";
	String Ex03_Customer_Name = "Pham Ngan";
	String Ex03_DateOfBirth = "26/04/1991";
	String Ex03_Gender = "female";
	String Ex03_Address = "56 Ha Noi";
	String Ex03_Address_Edit = "56 Ha Noi Edit";
	String Ex03_City = "HN";
	String Ex03_City_Edit = "HN Edit";
	String Ex03_State = "Five";
	String Ex03_State_Edit = "Five Edit";
	String Ex03_PIN = "660000";
	String Ex03_PIN_Edit = "666000";
	String Ex03_MobileNumber = "0983612137";
	String Ex03_MobileNumber_Edit = "0919011995";
	String Ex03_Email = "auto" + RandomNumber() + "@selinium.com";
	String Ex03_Email_Edit = "auto_edit" + RandomNumber() + "@selinium.com";
	String Ex03_Password = "123123";
	
	//Get data
	String Ex03_Get_CustomerId;
	String Ex03_Get_Customer_Name;
	String Ex03_Get_DOB;
	String Ex03_Get_Address;
	String Ex03_Get_City;
	String Ex03_Get_State;
	String Ex03_Get_PIN;
	String Ex03_Get_Mobile;
	String Ex03_Get_Email;
	
	@BeforeClass
  public void beforeClass() {
		driver = new FirefoxDriver();
			
	  }
	@Test(enabled = true)
  public void Exercise_01_Html_Dropdown_list() {
		
   }
	@Test(enabled = true)
  public void Exercise_02_Custom_Dropdown_List() {
		
	}
	@Test(enabled = true)
	public void Exercise_03_Textbox_TextArea() {
		//Step 1
		//Open URL http://daominhdam.890m.com/
		driver.get(Ex03_URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Step 02
		//Login
		Enter(Ex03_User_Login, Ex03_Txtbox_UserId);
		Enter(Ex03_Password_Login, Ex03_Txtbox_Pass);
		Click(Ex03_btn_Login);
		//Verify to meet the target page
		IsDisplay(Ex03_txt_Welcome);
		//Step 03
		//Click Customer text on the left panel
		Click(Ex03_txt_New_Customer);
		//Step 04
		//Input all information for all field
		Enter(Ex03_Customer_Name, Ex03_txt_Customer_Name);
		Click(Ex03_radio_Male);
		Enter(Ex03_DateOfBirth, Ex03_txt_DateOfBirth);
		Enter(Ex03_Address, Ex03_txt_Address);
		Enter(Ex03_City, Ex03_txt_City);
		Enter(Ex03_State, Ex03_txt_State);
		Enter(Ex03_PIN, Ex03_txt_PIN);
		Enter(Ex03_MobileNumber, Ex03_txt_Mobile_Number);
		Enter(Ex03_Email, Ex03_txt_Email);
		Enter(Ex03_Password, Ex03_txt_Password);
		Click(Ex03_btn_Submit);
		//Validate to meet the target page
		IsDisplay(Ex03_txt_Reg_Success);
		//Step 05
		//Get Customer ID
		Ex03_Get_CustomerId = GetText(Ex03_tbl_CustomerID);
		//Step 06
		//Click Edit Menu
		Click(Ex03_txt_Edit_Customer);
		//Verify to meet the target page
		IsDisplay(Ex03_txt_Edit_Form);
		//Enter Customer ID
		Enter(Ex03_Get_CustomerId, Ex03_txt_CustomerId_Edit);
		Click(Ex03_btn_Submit);
		//Verify to meet the target page
		IsDisplay(Ex03_txt_EditCustomer_Title);
		//Step 07
		//Assert Customer Name  == Pham Ngan
		Ex03_Get_Customer_Name = GetAttribute(Ex03_txt_EditCustomer_Name,"value");
		Assert.assertEquals(Ex03_Get_Customer_Name, Ex03_Customer_Name);
		//Assert Address  == 56 Ha Noi
		Ex03_Get_Address = GetAttribute(Ex03_txt_EditAddress,"value");
		Assert.assertEquals(Ex03_Get_Address, Ex03_Address);
		//Clear value for enabled textbox
		Clear(Ex03_txt_EditAddress);
		Clear(Ex03_txt_EditCity);
		Clear(Ex03_txt_EditState);
		Clear(Ex03_txt_EditPIN);
		Clear(Ex03_txt_EditMobile_Number);
		Clear(Ex03_txt_EditEmail);
		//Edit value for enabled textbox
		Enter(Ex03_Address_Edit, Ex03_txt_EditAddress);
		Enter(Ex03_City_Edit, Ex03_txt_EditCity);
		Enter(Ex03_State_Edit, Ex03_txt_EditState);
		Enter(Ex03_PIN_Edit, Ex03_txt_EditPIN);
		Enter(Ex03_MobileNumber_Edit, Ex03_txt_EditMobile_Number);
		Enter(Ex03_Email_Edit, Ex03_txt_EditEmail);
		Click(Ex03_btn_Submit);
		//Verify to meet the target page
		IsDisplay(Ex03_txt_Customer_Update_Success);
		//Verify value all field is match with edited value and remained field
		Ex03_Get_Customer_Name = GetText(Ex03_tbl_Customer_Name);
		Ex03_Get_Address = GetText(Ex03_tbl_Address);
		Ex03_Get_City = GetText(Ex03_tbl_City);
		Ex03_Get_State = GetText(Ex03_tbl_State);
		Ex03_Get_PIN = GetText(Ex03_tbl_PIN);
		Ex03_Get_Mobile = GetText(Ex03_tbl_Mobile);
		Ex03_Get_Email = GetText(Ex03_tbl_Email);
		
		Assert.assertEquals(Ex03_Get_Customer_Name, Ex03_Customer_Name);
		Assert.assertEquals(Ex03_Get_Address, Ex03_Address_Edit);
		Assert.assertEquals(Ex03_Get_City, Ex03_City_Edit);
		Assert.assertEquals(Ex03_Get_State, Ex03_State_Edit);
		Assert.assertEquals(Ex03_Get_PIN, Ex03_PIN_Edit);
		Assert.assertEquals(Ex03_Get_Mobile, Ex03_MobileNumber_Edit);
		Assert.assertEquals(Ex03_Get_Email, Ex03_Email_Edit);
		//Finish ^^
		}
	
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  public void IsDisplay(String locator ) {
	  driver.findElement(By.xpath(locator)).isDisplayed();
  }
  
  public void Enter(String text,String locator) {
	  driver.findElement(By.xpath(locator)).sendKeys(text);
  }
  public void Clear(String locator) {
	  driver.findElement(By.xpath(locator)).clear();
  }
  public void Click(String locator) {
	  driver.findElement(By.xpath(locator)).click();
  }
  public void IsEnabled(String locator ) {
	  if(driver.findElement(By.xpath(locator)).isEnabled())
		  System.out.println("Element is enabled");
  }
  public void IsDisabled(String locator ) {
	  if(!(driver.findElement(By.xpath(locator)).isEnabled()))
		  System.out.println("Element is disabled");
  }
  public void IsSelected(String locator ) {
	  if(driver.findElement(By.xpath(locator)).isSelected())
		  System.out.println("Element is selected");
	  else driver.findElement(By.xpath(locator)).click();
  }
  public int RandomNumber() {
	  Random random = new Random();
	  int RNumber = random.nextInt(9999999);
	  return RNumber;
  }
  public String GetAttribute(String locator, String property) {
	  String Get_Attribue = driver.findElement(By.xpath(locator)).getAttribute(property);
	  return Get_Attribue;
  }
  public String GetText(String locator) {
	  String Get_txt = driver.findElement(By.xpath(locator)).getText();
	  return Get_txt;
  }
}