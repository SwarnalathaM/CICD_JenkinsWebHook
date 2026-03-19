import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest {
	
	public WebDriver driver;
	public String browsername;
	@BeforeMethod
	public void getBrowserName() {
		ChromeOptions options=new ChromeOptions();
		
		browsername= System.getProperty("browser")!=null?System.getProperty("browser"):"Edge";
		if(browsername.contains("chrome")) {
			System.out.println("browser property = " + browsername);
			if(browsername.contains("headless"))
				options.addArguments("headless");
			driver=new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(1440,900));
		}
		else {
		   System.out.println("browser property = " + browsername);
		   driver=new EdgeDriver();
		}
		
//		System.out.println("browser property = " + browsername);
	}
	@Test
	public void getURLEdge1() {
//	public static void main(String[] args) {
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle()+ " from "+browsername);
		driver.close();
		}
	@Test
	   public void getURLEdge2() {
//		public static void main(String[] args) {
			driver.get("https://google.com/");
			System.out.println(driver.getTitle() + " from "+browsername);
			driver.close();
			}
}
