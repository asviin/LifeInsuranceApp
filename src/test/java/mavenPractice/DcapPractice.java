package mavenPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DcapPractice {
	@Test
	public void simp() throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
		URL url = new URL("http://192.168.29.110:5555/wd/hub");
		DesiredCapabilities d = new DesiredCapabilities();
		d.setBrowserName("chrome");
		d.setPlatform(Platform.WINDOWS);
		RemoteWebDriver rm = new RemoteWebDriver(url, d);
		rm.get("https://www.google.com");
	}

}
