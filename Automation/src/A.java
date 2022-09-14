import org.openqa.selenium.chrome.ChromeDriver;
public class A
{
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main (String[] args)
{
	ChromeDriver d= new ChromeDriver();
	d.get("https://www.google.co.in/");
	String tittle =d.getTitle();
	System.out.println(tittle);
}
}
