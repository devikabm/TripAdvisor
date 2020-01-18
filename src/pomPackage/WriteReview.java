package pomPackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class WriteReview {

	@FindBy(id="bubble_rating")
	private WebElement button;

	public WebElement getButton() {
		return button;
	}
	@FindBy(id="ReviewTitle")
	private WebElement reviewTitleBox;
	
	
	
	public WebElement getReviewTitleBox() {
		return reviewTitleBox;
	}

	@FindBy(id="ReviewText")
	private WebElement reviewTextBox;
	

	

	public WebElement getReviewTextBox() {
		return reviewTextBox;
	}


	@FindBy(id="qid12_bubbles")
	private WebElement finalratings;
	
	

	public WebElement getFinalratings() {
		return finalratings;
	}

	@FindBy(xpath="//span[text()='Submit your review ']")
			private WebElement submitButton;
	
	
	public WebElement getSubmitButton() {
				return submitButton;
			}

	
	public void writereview()
	{
				
		button.click();
		reviewTitleBox.sendKeys("good experience");
		reviewTextBox.sendKeys("must try for vacations");
		finalratings.click();
		submitButton.click();
		
		
	}
}
