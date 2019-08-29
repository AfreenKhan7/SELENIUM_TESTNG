package testdata;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng<driver> {
	public WebDriver driver; 
	WebDriverWait wait;
	
  @Test(enabled = false)
  public void register() {
	  
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click(); 			   							//TO CLICK ON REGISTER LINK
	  driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();  											   				 			//TO SELECT GENDER IN RADIO BUTTONS
	  driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("akkk");																	//TO ENTER THE FIRST NAME
	  driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("khan");																	//TO ENTER LAST NAME
	  driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ak1234@gmail.com");															//TO ENTER EMAIL ID
	  driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("123456");																	//TO ENTER THE PASSWORD
	  driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("123456");															//TO CONFIRM THE PASSWORD
	  driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();																		//TO CLICK ON REGISTER BUTTON TO COMPLETE THE REGISTRATION
		
  }
  
  @Test(priority=1)
  public void login() {
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();											//CLICK ON LOGIN BUTTON
	  driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ak1234@gmail.com");															//TO ENTER LOGIN EMAIL
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("123456");																//TO ENTER LOGIN PASSWORD
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();  		//TO COMPLETE THE LOGIN

		
		
	  }
  
  @Test(priority=2)
  public void shop() {
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();									//TO CLICK ON COMPUTER BUTTON
	  driver.findElement(By.xpath(" /html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/a/img")).click();				//TO SELECT THE DESKTOP COMPUTER
	  driver.findElement(By.xpath(" /html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();				//TO SELECT THE TYPE OF DESKTOP COMPUTER 
	  driver.findElement(By.xpath(" //*[@id=\"product_attribute_72_5_18_52\"]")).click();														//TO SELECT PROCESSOR OPTION="SLOW"
	  driver.findElement(By.xpath(" //*[@id=\"product_attribute_72_6_19_91\"]")).click();														//TO SELECT RAM= "8GB"
	  driver.findElement(By.xpath("//*[@id=\"product_attribute_72_3_20_58\"]")).click();														//TO SELECT HDD= "320GB"
	  driver.findElement(By.xpath(" //*[@id=\"product_attribute_72_8_30_93\"]")).click();														//TO SELECT SOFTWARE= "IMAGE VIEVER"
	  driver.findElement(By.xpath("//*[@id=\"addtocart_72_EnteredQuantity\"]")).clear();														//TO CLEAR THE ALREADY DEFINED QUANTITY OF THE OBJECT
	  driver.findElement(By.xpath("//*[@id=\"addtocart_72_EnteredQuantity\"]")).sendKeys("4");													//TO INCREASE THE QUANTITY OF THE OBJECT
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-72\"]")).click();																//TO CLICK ON "ADD TO CART" BUTTON
	
  }
  
  
  @Test(priority=3)
  public void shippingcart() { 
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")).click(); 								//TO CLICK ON SHOPPING CART BUTTON
	  
	  Select Country = new Select(driver.findElement(By.id("CountryId")));  																	//TO SELECT THE OPTION FROM THE DROPDOWN BUTTON
	  Country.selectByVisibleText("India");
	  
	  driver.findElement(By.xpath(" //*[@id=\"ZipPostalCode\"]")).sendKeys("474011");															//TO ENTER THE PINCODE
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[2]/div/div[3]/div[4]/input")).click(); // TO CLICK ON ESTIMATE SHIPPING BUTTON
	  
	  driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();                                                                      //TO CHECKMARK ON TERMS OF SERVICES CHECKBOX
	  driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();																			//TO CLICK ON CHECKOUT BUTTON
  }
  
  @Test(priority=4)
  public void checkout() { 
	  Select Billingaddress = new Select(driver.findElement(By.id("billing-address-select")));  												//TO SELECT THE BILLING ADDRESS FORM DROPDOWN MENU
	  Billingaddress.selectByVisibleText("New Address");
	  
	  driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Company\"]")).sendKeys("abc"); 													//TO ENTER THE COMPANY NAME
	  
	  Select Country = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));  													//TO SELECT THE SHIPPING COUNTRY FROM DROPDOWN MENU
	  Country.selectByVisibleText("India");
	  
	  driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_City\"]")).sendKeys("Pune");														//TO ENTER THE SHIPPING CITY
	  driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address1\"]")).sendKeys("phase3");												//TO ENTER SHIPPING ADDRESS 1
	  driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_Address2\"]")).sendKeys("magarpatta");											//TO ENTER THE SHIPPING ADDRESS 2										
	  driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]")).sendKeys("474011");											//TO ENTER PIN CODE										
	  driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]")).sendKeys("9876543210");										//TO ENTER CONTACT NUMBER
	  driver.findElement(By.xpath("//*[@id=\"BillingNewAddress_FaxNumber\"]")).sendKeys("ABCDEF");												//TO ENTER FAX NUMBER
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[1]/div[2]/div/input")).click();							//TO PRESS CONTINUE BUTTON
	  driver.findElement(By.xpath("//*[@id=\"PickUpInStore\"]")).click();																		//TO CLICK ON PICKUPINSTORE CHECKBOX
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[2]/div[2]/div/input")).click();							//TO PRESS CONTINUE BUTTON
	  driver.findElement(By.xpath("//*[@id=\"paymentmethod_0\"]")).click();																		//TO SELECT PAYMENT METHOD TO COD
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[4]/div[2]/div/input")).click();							//TO PRESS CONTINUE BUTTON ON PAYMENT METHOD
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[5]/div[2]/div/input")).click();							//TO PRESS CONTINUE BUTTON ON PAYMENT INFORMATION
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/ol/li[6]/div[2]/div[2]/input")).click();     				    //TOCONFIRM THE ORDER
	
	  
  }
  
  @Test(priority=5)
  public void ordercomplete() { 
  String expectedTitle = "Demo Web Shop. Checkout";  		
	
	String actualTitle= driver.getTitle();																										//TO VERIFY IF THE ORDER IS PLACED OR NOT
	if(expectedTitle.contentEquals(actualTitle))
	{
		System.out.println("The order has been placed");
	}
	else
	{
		System.out.println("The order has not been placed, try again later.");
	}
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();										//LINK FOR ORDER DETAILS							
	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();											//CLICK ON LOGOUT BUTTON
	
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.ie.driver", "resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver,60);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
