package neha;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Group2Hashmap extends Hashmap {
	
	public static void main(String[] args) throws IOException{
		Hashmap hp = new Hashmap();
		hp.dataSupplier();
		System.out.println(" From extended" + hp.dataSupplier());
	}
	
	  @Test(dataProvider = "data")
	  public  void integrationTest(Map<String, String> map) throws InterruptedException {
		  WebDriver driver;
		  driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.get("https://demo.opencart.com");
			
		  driver.findElement(By.xpath(".//*[@id='search']/input")).sendKeys(map.get("Search"));
			
		  //Press Button
		  driver.findElement(By.xpath(".//*[@id='search']/span/button")).click();
		  driver.findElement(By.id("input-option208")).sendKeys(map.get("text"));
		  driver.findElement(By.className("form-control")).sendKeys(map.get("textarea"));
		  driver.findElement(By.className("control-label")).sendKeys(map.get("date"));
		  driver.findElement(By.id("input-option221")).sendKeys(map.get("time"));
		  driver.findElement(By.id("input-option221")).sendKeys(map.get("datetime"));
	      driver.findElement(By.id("input-quantity")).sendKeys(map.get("quantity"));
		  driver.findElement(By.cssSelector("#button-cart")).click();
		  Thread.sleep(5000);
		  driver.close();
			
	    System.out.println("-------------Test case started ----------------");
	    System.out.println(map.get("Search"));
	    System.out.println(map.get("text"));
	    System.out.println(map.get("textarea"));
	    System.out.println(map.get("date"));
	    System.out.println(map.get("time"));
	    System.out.println(map.get("datetime"));
	    System.out.println(map.get("quantity"));
	    
	    System.out.println("-------------Test case Ended ----------------");
	}
	  @DataProvider(name = "data")
		 public Object[][] dataSupplier() throws IOException {
			  File file = new File("D://Users//ndondapa//Desktop//Book1.xlsx");
				FileInputStream fis = new FileInputStream(file);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheetAt(0);
				wb.close();
				int lastRowNum = sheet.getLastRowNum() ;
				System.out.println(lastRowNum);
				int lastCellNum = sheet.getRow(0).getLastCellNum();
				System.out.println(lastCellNum);
				Object[][] obj = new Object[lastRowNum][1];  
		    try {
				
				for (int i = 0; i < lastRowNum; i++) {
				  Map<Object, Object> datamap = new HashMap<>();
				  for (int j = 0; j < lastCellNum; j++) {
					  System.out.println(sheet.getRow(i).getCell(j).toString() + sheet.getRow(i+1).getCell(j).toString());
				    datamap.put(sheet.getRow(i).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
				  }
				  obj[i][0] = datamap;
				  System.out.println( obj[i][0]);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return  obj;
		  }
}

