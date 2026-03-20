import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class sampleTest3 {
	@Test
	public void getURLEdge1() {
//		public static void main(String[] args) {
			WebDriver driver=new EdgeDriver();
			driver.get("https://rahulshettyacademy.com/");
			System.out.println(driver.getTitle()+ " from Edge");
System.out.println("Edge in test 3");
System.out.println("in develop3 branch");
			driver.close();
			}
	@Test
	public void getURLEdge2() {
//		public static void main(String[] args) {
			WebDriver driver=new EdgeDriver();
			driver.get("https://google.com/");
			System.out.println(driver.getTitle()+ " from Edge");
System.out.println("Edge in test 3");
System.out.println("in develop3 branch");
			driver.close();
			}
}
