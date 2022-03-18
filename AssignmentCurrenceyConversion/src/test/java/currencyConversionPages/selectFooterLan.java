package currencyConversionPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class selectFooterLan {
	
	 WebDriver driver;
	
	public selectFooterLan(WebDriver driver) {
		this.driver =driver;
	}
	
	@FindBy(how=How.CSS, using=".flag-icon-small.flag-icon-lt")
	WebElement select_Language;
	
	@FindBy(how = How.XPATH, using ="//button[contains(@id,'countries-dropdown')]")
	WebElement click_countyDropdown;
	
	@FindBy(how=How.XPATH, using="//a[normalize-space()='Latvia']")
	WebElement select_country;
	
	public void selectLanguage() throws InterruptedException {
		
		select_Language.click();
		Thread.sleep(500);
		click_countyDropdown.click();
		Thread.sleep(1000);
		select_country.click();
		Thread.sleep(1000);
	}

}
