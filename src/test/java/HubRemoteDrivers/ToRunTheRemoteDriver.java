package HubRemoteDrivers;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ToRunTheRemoteDriver {
	public static void main(String[] args) throws Throwable {
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver remoteDriver = new RemoteWebDriver(url, cap);
		remoteDriver.get("https://www.facebook.com/");
	}
}
