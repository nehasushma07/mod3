package neha;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Hashmap {
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
