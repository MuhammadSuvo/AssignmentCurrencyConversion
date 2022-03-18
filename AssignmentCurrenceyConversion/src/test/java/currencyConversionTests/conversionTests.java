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

	@Test(priority=1)
	public void currencyTests() throws InterruptedException {

		WebDriver driver = currencyBaseClass.openBrowser("chrome", "https://www.paysera.lt/v2/en-LT/fees/currency-conversion-calculator");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);

		currenceyPages currency_pages =  PageFactory.initElements(driver, currenceyPages.class);

		currency_pages.currencyConversion();
		
		js.executeScript("window.scrollBy(0,1800)", "");
		Thread.sleep(2000);
		
		selectFooterLan selectFooter_Lan =  PageFactory.initElements(driver, selectFooterLan.class);

		selectFooter_Lan.selectLanguage();
		
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);

		currenceyPages currency_page =  PageFactory.initElements(driver, currenceyPages.class);

		currency_page.currencyCalculation();
		
		logger.info("This is info message");

	}
	

}
