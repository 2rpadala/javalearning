package POMLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class learning {

	@FindBy(xpath="//yt-formatted-string[contains(text(),'Learning')]")
	WebElement learning;
	
	public void learning()
	{
		learning.click();
	}

}
