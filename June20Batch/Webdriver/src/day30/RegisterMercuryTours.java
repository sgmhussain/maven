package day30;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMercuryTours {
	@FindBy(name="firstName")
	WebElement firstName;
	@FindBy(name="lastName")
	WebElement lastName;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(name="userName")
	WebElement email;
	@FindBy(name="address1")
	WebElement address1;
	@FindBy(name="city")
	WebElement city;
	@FindBy(name="state")
	WebElement state;
	@FindBy(name="postalCode")
	WebElement postalCode;
	@FindBy(name="country")
	WebElement country;
	@FindBy(name="email")
	WebElement userName;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	@FindBy(name="register")
	WebElement submit;
	public void contactInformation()
	{
		firstName.sendKeys("sai");
		lastName.sendKeys("krishna");
		phone.sendKeys("1234567890");
		email.sendKeys("krishna@gmail.com");
		address1.sendKeys("12-3-34-");
		city.sendKeys("hyd");
		state.sendKeys("TS");
		postalCode.sendKeys("1111111");
		country.sendKeys("INDIA");
		userName.sendKeys("tutorial");
		password.sendKeys("tutorial");
		confirmPassword.sendKeys("tutorial");
		submit.click();
		
	}
	

}
