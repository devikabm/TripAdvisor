package pomPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tripAdvisorReview.TripAdvisorReviewSubmit;

public class Home {

	/*search for the 'club mahindra'*/
	
	@FindBy(xpath="//span[@class='brand-global-nav-action-search-Search__label--3PRUD']")
	private WebElement searcheditBox;

	public WebElement getSearcheditBox() {
		return searcheditBox;
	}
	
	@FindBy(xpath="//input[@class='text' and @type='search']")
	private WebElement enetersearchbox;
	

	public WebElement getEnetersearchbox() {
		return enetersearchbox;
	}


	public void searchForReview()
	{
		searcheditBox.click();
		
		TripAdvisorReviewSubmit.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		enetersearchbox.sendKeys("Club mahindra",Keys.ENTER);
			
		
	}



		
	}

