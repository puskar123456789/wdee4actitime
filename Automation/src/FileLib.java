import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib
{
	public static String getpropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String value= p.getProperty(key);
		return value;	
	}

	public static String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		String data = wb.getName(sheetname).getRow(row).getcell(cell).getStringcellValue();
		return data;
	}
	}


