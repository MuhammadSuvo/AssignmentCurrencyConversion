package currencyConversionTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import currencyCalculations.currencyBaseClass;
import currencyConversionPages.currenceyPages;

public class conversionTests extends currencyBaseClass {

	WebDriver driver = null;
	
	@Test
	public void currencyTests() throws InterruptedException {

		WebDriver driver = currencyBaseClass.openBrowser("chrome", "https://www.paysera.lt/v2/en-LT/fees/currency-conversion-calculator");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		currenceyPages currency_pages =  PageFactory.initElements(driver, currenceyPages.class);
		
		currency_pages.currencyConversion();

	}

}
