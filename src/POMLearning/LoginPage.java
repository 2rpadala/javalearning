package POMLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	//PAGE OBJECT MODEL LEARNING, CREATING LOGIN CLASS
	//DEFINE REPOSITORY
	
	@FindBy(xpath="//input[@id='email']")
	WebElement userid;
	@FindBy(id = "passContainer")
	WebElement pwd;
	@FindBy(id = "u_0_5_Kw")
	WebElement lgnbtn;
		
	public void VerifyLogin(String "userid1", String "pwd1")
	{
		userid.sendKeys(userid1);
		pwd.sendKeys(pwd1);
		lgnbtn.click();
		
	}
	
}
	
	
	

