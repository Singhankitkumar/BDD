package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBookingPage {


	@FindBy(name="txtFN")
	@CacheLookup
	WebElement FName;
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement loginBtn;
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement LName;
	
	@FindBy(id="txtEmail")
	@CacheLookup
	WebElement Email;
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[5]/td[2]/input")
	@CacheLookup
	WebElement Mobile;
	@FindBy(name="city")
	@CacheLookup
	WebElement City;
	@FindBy(name="state")
	@CacheLookup
	WebElement State;
	@FindBy(id ="txtGender1")
	@CacheLookup
	WebElement Gender1;
	@FindBy(id ="txtGender2")
	@CacheLookup
	WebElement Gender2;
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement Check1;
	
	@FindBy(xpath="/html/body/div/div/form/table/tbody/tr[12]/td[2]/input[2]")
	@CacheLookup
	WebElement Check2;
	
	@FindBy(id ="txtCardholderName")
	@CacheLookup
	WebElement CardName;
	
	@FindBy(id ="txtDebit")
	@CacheLookup
	WebElement CardNumber;
	
	@FindBy(id ="txtCvv")
	@CacheLookup
	WebElement CVV ;
	
	@FindBy(id ="txtMonth")
	@CacheLookup
	WebElement CardMonth;
	
	@FindBy(id ="txtYear")
	@CacheLookup
	WebElement CardYear;
	
	
	
	WebDriver driver;


	public HotelBookingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setFname(String fname) {
		FName.sendKeys(fname);
	}
	public void clickLoginButton() {
		loginBtn.click();
	}
	
	
	public void setLname(String lname) {
		LName.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		
		Email.sendKeys(email);
		
	}
	
	public void setMobile(String mobile) {
		Mobile.sendKeys(mobile);
	}
	public void setGender(String gen) {
		
		if(gen.equalsIgnoreCase("female"))
			Gender2.click();
		else
			Gender1.click();
		
	}
	
	public String getCity() {

		String name=City.getText();
		return name;


	}
	public void selectCity(String city) {
		City.sendKeys(city);
	}
	public String getState() {

		String name=State.getText();
		return name;


	}
	public void selectstate(String state) {
		State.sendKeys(state);
	}
	
public void setRoomtype(String rtp) {
		
		if(rtp.equalsIgnoreCase("ac"))
			Check1.click();
		else
			Check2.click();
	
	
}
public void setCardName(String cardname) {
	
	CardName.sendKeys(cardname);
	
}
public void setCardNumber(String cno) {
	
	CardNumber.sendKeys(cno);
	
}
public void setCVV(String cvv) {
	
	CVV.sendKeys(cvv);
	
}
public void setMonth(String mnth) {
	
	CardMonth.sendKeys(mnth);
	
}
public void setYear(String year) {
	
	CardYear.sendKeys(year);
	
}

}	

