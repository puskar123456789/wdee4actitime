import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataDriven
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\91637\\OneDrive\\Desktop\\commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
