package hotelbooking;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import com.cg.model.HotelBookingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefn {
	
	WebDriver driver;
	HotelBookingPage hotelbooking;
	
	@Given("^User is on Booking page$")
	public void user_is_on_Booking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\BDD\\BDD Jar Files\\chromedriver_win32\\chromedriver.exe" ) ;
		driver=new ChromeDriver();
		driver.get("file:///D:/BDD/HotelBookingDemo/hotelbooking.html");
		hotelbooking=new HotelBookingPage(driver);
		System.out.println("page loaded in browser");
	}

	@When("^First name is blank$")
	public void first_name_is_blank() throws Throwable {
	   hotelbooking.setFname("");
	   hotelbooking.clickLoginButton();
	}

	@Then("^Display error message 'Please fill the First Name'$")
	public void display_error_message_Please_fill_the_First_Name() throws Throwable {
		
		String expErrMsg="Please fill the First Name";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Last name is blank$")
	public void last_name_is_blank() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("");
		   hotelbooking.clickLoginButton();  
	}

	@Then("^Display error message 'Please fill the Last Name'$")
	public void display_error_message_Please_fill_the_Last_Name() throws Throwable {
	
		String expErrMsg="Please fill the Last Name";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^Email is blank$")
	public void email_is_blank() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		
		   hotelbooking.setEmail("");
		   hotelbooking.clickLoginButton(); 
	   
	}

	@Then("^Display error message 'Please fill the Email'$")
	public void display_error_message_Please_fill_the_Email() throws Throwable {
		

		String expErrMsg="Please fill the Email";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	  
	}

	@When("^Email is invalid$")
	public void email_is_invalid() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("sjksadkj");
		   hotelbooking.clickLoginButton(); 
	   
	}

	@Then("^Display error message 'Please enter valid Email Id\\.'$")
	public void display_error_message_Please_enter_valid_Email_Id() throws Throwable {
		String expErrMsg="Please enter valid Email Id.";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}


	@When("^Phone number is blank$")
	public void phone_number_is_blank() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("");
		   hotelbooking.clickLoginButton(); 
	   
	}

	@Then("^Display error message 'Please enter phone number\\.'$")
	public void display_error_message_Please_enter_phone_number() throws Throwable {
		String expErrMsg="Please fill the Mobile No.";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}

	@When("^Phone number is invalid$")
	public void phone_number_is_invalid() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("gfdg54554");
		   hotelbooking.clickLoginButton(); 
	    
	}

	@Then("^Display error message 'Please enter valid Contact number'$")
	public void display_error_message_Please_enter_valid_Contact_number() throws Throwable {
		String expErrMsg="Please enter valid Contact no.";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}
	@When("^user not selected gender$")
	public void user_not_selected_gender() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   
		   hotelbooking.clickLoginButton(); 
	    
	}

	@Then("^Display alert for Gender Field$")
	public void display_alert_for_Gender_Field() throws Throwable {
		String expErrMsg="Please Select the Gender";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
		
	    
	}



	@When("^city is blank$")
	public void city_is_blank() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.clickLoginButton(); 
	   
	}

	@Then("^Display error message 'Please select city'$")
	public void display_error_message_Please_select_city() throws Throwable {
		String expErrMsg="Please select city";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}
	@When("^state is blank$")
	public void state_is_blank() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.clickLoginButton(); 
	}

	@Then("^Display error message 'Please select state'$")
	public void display_error_message_Please_select_state() throws Throwable {
		String expErrMsg="Please select state";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}
	@When("^user not selected Roomtype$")
	public void user_not_selected_Roomtype() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.selectstate("Maharashtra");
		   hotelbooking.clickLoginButton(); 
	   
	}

	@Then("^Display alert for Roomtype Field$")
	public void display_alert_for_Roomtype_Field() throws Throwable {
		String expErrMsg="Please select the Room type";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
		
		
	    
	}
	@When("^Cardholdername is empty$")
	public void cardholdername_is_empty() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.selectstate("Maharashtra");
		   hotelbooking.setRoomtype("ac");
		   hotelbooking.clickLoginButton(); 
	    
	}

	@Then("^Display alert for Cardholder Field$")
	public void display_alert_for_Cardholder_Field() throws Throwable {
		String expErrMsg="Please fill the Card holder name";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}

	@When("^DebitCard is empty$")
	public void debitcard_is_empty() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.selectstate("Maharashtra");
		   hotelbooking.setRoomtype("ac");
		   hotelbooking.setCardName("AnkitSingh");
		   hotelbooking.clickLoginButton(); 
	    
	    
	}

	@Then("^Display alert for Debitcard Field$")
	public void display_alert_for_Debitcard_Field() throws Throwable {
		String expErrMsg="Please fill the Debit card Number";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}

	@When("^CVV is empty$")
	public void cvv_is_empty() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.selectstate("Maharashtra");
		   hotelbooking.setRoomtype("ac");
		   hotelbooking.setCardName("AnkitSingh");
		   hotelbooking.setCardNumber("1234567890098765");
		   hotelbooking.clickLoginButton(); 
	    
	    
	}

	@Then("^Display alert for CVV Field$")
	public void display_alert_for_CVV_Field() throws Throwable {
		String expErrMsg="Please fill the CVV";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}

	@When("^Expiration Month is empty$")
	public void expiration_Month_is_empty() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.selectstate("Maharashtra");
		   hotelbooking.setRoomtype("ac");
		   hotelbooking.setCardName("AnkitSingh");
		   hotelbooking.setCardNumber("1234567890098765");
		   hotelbooking.setCVV("123");
		   hotelbooking.clickLoginButton(); 
	   
	}
	@Then("^Display alert for CardMonth Field$")
	public void display_alert_for_CardMonth_Field() throws Throwable {
		String expErrMsg="Please fill expiration month";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	   
	}

	@When("^Expiration year is empty$")
	public void expiration_year_is_empty() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.selectstate("Maharashtra");
		   hotelbooking.setRoomtype("ac");
		   hotelbooking.setCardName("AnkitSingh");
		   hotelbooking.setCardNumber("1234567890098765");
		   hotelbooking.setCVV("123");
		   hotelbooking.setMonth("12");
		   hotelbooking.clickLoginButton(); 
	   
	}

	@Then("^Display alert for CardYear Field$")
	public void display_alert_for_CardYear_Field() throws Throwable {
		String expErrMsg="Please fill the expiration year";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	    
	}
	@When("^All Details are correct$")
	public void all_Details_are_correct() throws Throwable {
		hotelbooking.setFname("Ankit");
		 hotelbooking.setLname("Singh");
		   hotelbooking.setEmail("ankit@gmail.com");
		   hotelbooking.setMobile("9791575147");
		   hotelbooking.setGender("male");
		   hotelbooking.selectCity("Pune");
		   hotelbooking.selectstate("Maharashtra");
		   hotelbooking.setRoomtype("ac");
		   hotelbooking.setCardName("AnkitSingh");
		   hotelbooking.setCardNumber("1234567890098765");
		   hotelbooking.setCVV("123");
		   hotelbooking.setMonth("12");
		   hotelbooking.setYear("2018");
		   hotelbooking.clickLoginButton(); 
	    
	}

	@Then("^Display Booking page$")
	public void display_Booking_page() throws Throwable {
		
		driver.navigate().to("file://localhost/D:/BDD/HotelBookingDemo/success.html");
	    
	}

}
