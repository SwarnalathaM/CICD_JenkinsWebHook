import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class sampleTest2 {
	@Test
	public void getURLEdge1() {
//		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://rahulshettyacademy.com/");
			System.out.println(driver.getTitle()+ " from Firefox");
System.out.println("Firefox in test 2");
			driver.close();
			}
	@Test
	public void getURLEdge2() {
//		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://google.com/");
			System.out.println(driver.getTitle()+ " from Firefox");
System.out.println("Firefox in test 2");
			driver.close();
			}
}
