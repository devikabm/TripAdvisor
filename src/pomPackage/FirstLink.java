package pomPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tripAdvisorReview.TripAdvisorReviewSubmit;

public class FirstLink {

			@FindBy(xpath="//span[text()='Club Mahindra Madikeri, Coorg']")
			private WebElement FirstLink;
	
			public WebElement getFirstLink() {
				return FirstLink;
	}

public void clickFirstLink()
{
	FirstLink.click();
	
	TripAdvisorReviewSubmit.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	WebDriverWait wait = new WebDriverWait(TripAdvisorReviewSubmit.driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(FirstLink));
	
}
}