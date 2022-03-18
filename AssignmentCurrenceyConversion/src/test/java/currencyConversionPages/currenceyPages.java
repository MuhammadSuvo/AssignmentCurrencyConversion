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
	
	
	public void currencyConversion() throws InterruptedException {
		
		insert_buy_Value.sendKeys("2000");
		Thread.sleep(3000);
		
	}

}
