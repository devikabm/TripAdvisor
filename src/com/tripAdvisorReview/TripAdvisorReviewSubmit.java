package com.tripAdvisorReview;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pomPackage.ClubMahindraVirajpet;
import pomPackage.FirstLink;
import pomPackage.Home;
import pomPackage.WriteReview;

public class TripAdvisorReviewSubmit {

	public static WebDriver driver;
	
	@BeforeClass
	public void configBM()
	{
		System.out.println("===luanching the browser===");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.tripadvisor.in/");

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	@Test
	public void SumitReviewOnTrip()
	{
		/*step1: searching for the given details*/
	Home hp = PageFactory.initElements(driver,Home.class);	
	hp.searchForReview();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	/*step:2 click on first link*/
	FirstLink fl = PageFactory.initElements(driver,FirstLink.class);
	fl.clickFirstLink();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	/*step3: write review*/	
	ClubMahindraVirajpet cm = PageFactory.initElements(driver,ClubMahindraVirajpet.class);
	cm.review();
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


	/*step4:write the review and ratings */
	WriteReview wr = PageFactory.initElements(driver,WriteReview.class);
	wr.writereview();
	
	}
		
	//@AfterClass
	public void configAC()
	{
		System.out.println("===close the browser====");
		driver.close();
	}
	
	}


