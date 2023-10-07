package selenium_sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fristfile {

	public static void main(String[] args) throws InterruptedException {
		
      System.out.println("Welcome");
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
      //System.setProperty("webdriver.chrome.driver", "\\SeleniumProject\\Drivers\\ChromeSetup.exe");
      //Thread.sleep(5000);
      ChromeOptions options = new ChromeOptions();
      options.addArguments("incognito");	
//		options.addArguments("--kiosk");
		 WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		//log.info("Launched Chrome Browser:");
      //
      driver.get("https://jpetstore.aspectran.com/account/signonForm");
	}

}
