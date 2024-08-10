/*package maven1st_grp.maven1st_artifact;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
	 //@SuppressWarnings("deprecation")
	@Test
	  public void EdgeTest() throws InterruptedException {	 
	// System.setProperty("webdriver.edge.driver", "D:\\Selenium\\webdrivers\\chromedriver_win32\\msedgedriver.exe");
	//Initializing the firefox driver (Gecko)
		 System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		  driver = new InternetExplorerDriver();	  
		  driver.get("https://www.demoqa.com");
		  try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		  driver.quit();

	  }
	 
	 @Test
	 public void ChromeTest()
	 { 
	       //Initialize the chrome driver
		// System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\webdrivers\\chromedriver_win32\\chromedriver.exe");
	       System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	       driver = new ChromeDriver();
	       driver.get("https://www.demoqa.com"); 
	       driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	       driver.quit();
	 }
}
*/