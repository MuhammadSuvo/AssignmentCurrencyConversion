package currencyConversionPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class currenceyPages {
	
	WebDriver driver;
	
	public currenceyPages(WebDriver driver) {
		
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using="(//input[contains(@type,'text')])[3]")
	WebElement insert_buy_Value;
	
	@FindBy(how = How.XPATH, using="(//span[contains(@data-ng-bind,'$select.selected')])[2]")
	WebElement select_currencey;
	
	@FindBy(how=How.XPATH, using="//span[@class='ui-select-choices-row-inner'][contains(.,'USD')]")
	WebElement select_dropDown_currency;
	
	@FindBy(how = How.XPATH, using="//button[@class='btn ng-binding'][contains(.,'Filter')]")
	WebElement click_Filter;
	
	public void currencyConversion() throws InterruptedException {
		
		insert_buy_Value.sendKeys("2000");
		Thread.sleep(2000);
	
	}
	
	public void currencyCalculation() throws InterruptedException {
		
		insert_buy_Value.sendKeys("2000");
		Thread.sleep(1000);
		insert_buy_Value.click();
		Thread.sleep(1000);
		select_dropDown_currency.click();
		Thread.sleep(1000);
		click_Filter.click();
		Thread.sleep(1000);

	}
}
