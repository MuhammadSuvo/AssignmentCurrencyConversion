package currencyConversionPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class currenceyPages {
	
	WebDriver driver;
	
	public currenceyPages(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="(//input[contains(@type,'text')])[3]")
	@CacheLookup
	WebElement insert_buy_Value;
	
	@FindBy(how = How.XPATH, using="(//span[contains(@data-ng-bind,'$select.selected')])[2]")
	@CacheLookup
	WebElement select_currencey;
	
	@FindBy(how=How.XPATH, using="//span[@class='ui-select-choices-row-inner'][contains(.,'USD')]")
	@CacheLookup
	WebElement select_dropDown_currency;
	
	@FindBy(how = How.XPATH, using="//button[@class='btn ng-binding'][contains(.,'Filter')]")
	@CacheLookup
	WebElement click_Filter;
	
	
	public void currencyConversion() throws InterruptedException {
		
		insert_buy_Value.sendKeys("2000");
		Thread.sleep(2000);
	
	}
	
	public void currencyCalculation() throws InterruptedException {
		
		insert_buy_Value.sendKeys("2000");
		Thread.sleep(2000);
		select_currencey.click();
		Thread.sleep(500);
		select_dropDown_currency.click();
		Thread.sleep(500);
		click_Filter.click();
		Thread.sleep(1000);
		

	}

}
