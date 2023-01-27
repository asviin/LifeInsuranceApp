package mavenPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RunSeleniumGrid {
	
	@Test
	public void runScript() throws MalformedURLException, InterruptedException {
		
		URL url = new URL("http://192.168.0.205:4800/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.close();
	}

}
