package currencyConversionPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class selectFooterLan {
	
	 WebDriver driver;
	
	public selectFooterLan(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how=How.CSS, using=".flag-icon-small.flag-icon-lt")
	@CacheLookup
	WebElement select_Language;
	
	@FindBy(how = How.XPATH, using ="//button[contains(@id,'countries-dropdown')]")
	@CacheLookup
	WebElement click_countyDropdown;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Latvia']")
	@CacheLookup
	WebElement select_country;
	
	public void selectLanguage() throws InterruptedException {
		
		select_Language.click();
		Thread.sleep(500);
		click_countyDropdown.click();
		Thread.sleep(1000);
		select_country.click();
		Thread.sleep(3000);
	}

}
