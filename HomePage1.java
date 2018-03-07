package neha;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage1 extends Group2Hashmap {
	    static WebDriver driver;
	    
		By search=By.xpath(".//*[@id='search']/input");
		By Searchbutton=By.xpath(".//*[@id='search']/span/button");
		By descriptions=By.cssSelector("#description");
		By DescriptionSearch=By.id("button-search");
		By ClickOnProduct=By.xpath(".//*[@id='content']/div[3]/div[1]/div/div[1]/a/img");
		By Radio=By.xpath(".//*[@id='product']/div[1]/label");
		By Checkbox=By.xpath(".//*[@id='product']/div[2]/label");
		By text=By.id("input-option208");
		By Select=By.id("input-option217");
		By textarea=By.className("form-control");
		By upload=By.xpath(".//*[@id='product']/div[6]/label");
		By date=By.className("control-label");
		By time=By.id("input-option221");
		By datetime=By.id("input-option220");
		By quantity=By.id("input-quantity");
		By AddToCart=By.cssSelector("#button-cart");
	
		
	//@DataProvider(name = "Authentication")    
	
	public HomePage1(WebDriver driver)
	{
	  HomePage1.driver=driver;
	}

	public void TypeSearch()
	{
		
		driver.findElement(search).sendKeys();
	}

	public void ClickOnSearchButton()
	{
		driver.findElement(Searchbutton).click();
	}

	public void DescriptionCheckBox()
	{
		driver.findElement(descriptions).click();
	}

	public void DescriptionSearch()
	{
		driver.findElement(DescriptionSearch).click();
	}

	public void ClickOnProduct()
	{
		driver.findElement(ClickOnProduct).click();
	}

	public void Radio()
	{
		   driver.findElement(By.xpath(".//*[@id='input-option218']/div[1]/label/input")).click();
	}
	
	public void Checkbox() 
	{
		   driver.findElement(By.xpath(".//*[@id='input-option223']/div[2]/label/input")).click();
	}
	 public void Text()
	 {
		 driver.findElement(text).sendKeys();
	 }
	 public void Select()
	 {
		 driver.findElement(Select).sendKeys(); 
		 Select drpdwn = new Select(driver.findElement(By.id("input-option217")));
		 drpdwn.selectByVisibleText("Red (+$4.80)");
	 }
	 public void textarea()
	 {
		 driver.findElement(textarea).sendKeys(); 
	 }
	 public void upload()
	 {
		 driver.findElement(upload).sendKeys();
	 }
	 public void date()
	 {
		 driver.findElement(date).sendKeys();
	 }
	 public void time()
	 {
		 driver.findElement(time).sendKeys();
	 }
	 public void datetime()
	 {
		 driver.findElement(datetime).sendKeys();
	 }
	 public void quantity()
	 {
		 driver.findElement(quantity).sendKeys();
	 }
	 public void ClickOnAddToCart()
	{
		driver.findElement(AddToCart).click();
	}

	}

