package automationframework;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import neha.HomePage1;

public class verifySearch  {
	
		@Test
		public verifySearch()
		{
			FirefoxDriver driver=new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/");
			
			HomePage1 homepage=new HomePage1(driver);
			homepage.TypeSearch();
			homepage.ClickOnSearchButton();
			homepage.DescriptionCheckBox();
			homepage.DescriptionSearch();
			homepage.ClickOnProduct();
			homepage.Radio();
			homepage.Checkbox();
			homepage.Text();
			homepage.Select();
			homepage.textarea();
			homepage.upload();
			homepage.date();
			homepage.time();
			homepage.datetime();
			homepage.quantity();
			homepage.ClickOnAddToCart();
			
			
			
		}

	}



