package Docker.ParallelExecution;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest3 {
  
	@Test()
	public void Test1() throws Exception {

	DesiredCapabilities cap = DesiredCapabilities.chrome();
	
	
	URL url = new URL("http://localhost:4444/wd/hub");
	WebDriver driver = new RemoteWebDriver(url, cap);
	
	driver.get("https://mail.google.com/");
	System.out.println("Page Title is: "+ driver.getTitle());
	driver.quit();

}
}
