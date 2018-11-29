package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.cg.model.LoginPageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefn {



	WebDriver driver;
	LoginPageFactory loginPage;




	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver=new FirefoxDriver();
		driver.get("file://localhost/D:/BDD/HotelBookingDemo/login.html");

		loginPage=new LoginPageFactory(driver); 

		System.out.println("page loaded in browser");

	}

	@When("^username password is blank$")
	public void username_password_is_blank() throws Throwable {
		loginPage.setUserName("");
		loginPage.setPassword("");
		loginPage.clickLoginButton();


	}

	@Then("^Display Error message'Please enter Username'$")
	public void display_Error_message_Please_enter_Username() throws Throwable {

		WebElement divEle=driver.findElement(By.id("userErrMsg"));
		String actualErrorMsg=divEle.getText();
		String expErrorMsg="* Please enter userName.";
		Assert.assertEquals(expErrorMsg, actualErrorMsg); 
		driver.close();

	}


	@When("^username is given but password is blank$")
	public void username_is_given_but_password_is_blank() throws Throwable {

		loginPage.setUserName("Yogini");
		loginPage.setPassword("");
		loginPage.clickLoginButton();


	}

	@Then("^Display Error message'Please enter password'$")
	public void display_Error_message_Please_enter_password() throws Throwable {

		WebElement divEle=driver.findElement(By.id("pwdErrMsg"));
		String actualErrorMsg=divEle.getText();
		String expErrorMsg="* Please enter password.";
		Assert.assertEquals(expErrorMsg, actualErrorMsg); 
		driver.close();
	}


	@When("^Invalid username and password entered$")
	public void invalid_username_and_password_entered() throws Throwable {

		loginPage.setUserName("pappu");
		loginPage.setPassword("yogini");
		loginPage.clickLoginButton();

	}

	@Then("^Display Alert'Invalid Login'$")
	public void display_Alert_Invalid_Login() throws Throwable {
		String expErrMsg="Invalid login! Please try again!";
		String actErrMsg= driver.switchTo().alert().getText();
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^username and password entered is correct$")
	public void username_and_password_entered_is_correct() throws Throwable {
		loginPage.setUserName("Yogini");
		loginPage.setPassword("Yogini");
		loginPage.clickLoginButton();


	}

	@Then("^Redirect the user to hotelbooking page$")
	public void redirect_the_user_to_hotelbooking_page() throws Throwable {

		driver.navigate().to("file://localhost/D:/BDD/HotelBookingDemo/hotelbooking.html");

	}


}
