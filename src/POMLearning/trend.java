package POMLearning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class trend {
	
	@FindBy(xpath="//yt-formatted-string[contains(text(),'Trending')]")
	WebElement trending;
	
	public void trending()
	{
		trending.click();
	}

}
