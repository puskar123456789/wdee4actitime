import java.io.IOException;

public class Excelread 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException
		{
		FileLib f=new FileLib();
			
			String url = FileLib.getpropertyValue("url");
			String username=FileLib.getpropertyValue("username");
			String password=FileLib.getpropertyValue("password");
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
			
			String  e = FileLib.getExcelData("InvalidLogin",1,1);
			System.out.println(e);
			
		}

	}


