package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class ClubMahindraVirajpet {
	
	
	@FindBy(xpath="//span[contains(text(),'reviews')]")
	private WebElement reviewlink;
	
	
	public WebElement getReviewlink() {
		return reviewlink;
	}

	@FindBy(xpath="//a[@class='ui_button primary']")
	private WebElement reviewButton;
	
	
	public WebElement getReviewButton() {
		return reviewButton;
	}
	
	public void review()
	{
		reviewlink.click();
		reviewButton.click();

	}
	
	
	
	
	
	
	
	
	
}
