package currencyConversionTests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import currencyCalculations.currencyBaseClass;
import currencyCalculations.log4j2Class;
import currencyConversionPages.currenceyPages;
import currencyConversionPages.selectFooterLan;

public class conversionTests extends currencyBaseClass {

	WebDriver driver = null;

	private static Logger logger = LogManager.getLogger(log4j2Class.class);


	@Test(priority =1)
	public void currencyTests() throws InterruptedException { 


		WebDriver driver = currencyBaseClass.openBrowser("chrome", "https://www.paysera.lt/v2/en-LT/fees/currency-conversion-calculator");
		logger.debug("Application got opened");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);	

		currenceyPages currency_pages =  PageFactory.initElements(driver, currenceyPages.class);
		logger.debug("Creating page object by using the page factory");

		currency_pages.currencyConversion();
		logger.debug ("Call the main method");
		
		Thread.sleep(2000);
		logger.debug("2nd time call the windows scrolling");

		selectFooterLan selectFooter_Lan =  PageFactory.initElements(driver, selectFooterLan.class);
		selectFooter_Lan.selectLanguage();
		logger.debug("Clicked the select footer language by call the method");

		Thread.sleep(2000);
		logger.debug("3rd time call the window scrolling");

		currenceyPages currency_page =  PageFactory.initElements(driver, currenceyPages.class);
		currency_page.currencyCalculation();
		logger.debug("Calculation and verify the currency");

	}	

}
