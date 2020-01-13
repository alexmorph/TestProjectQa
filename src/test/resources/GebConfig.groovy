import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver
import geb.report.*
import geb.navigator.EmptyNavigator
import org.openqa.selenium.Dimension
import geb.Browser
import org.openqa.selenium.WebElement



System.setProperty("geb.build.baseUrl", System.getProperty("geb.build.baseUrl", "http://book.theautomatedtester.co.uk/"))
System.setProperty("webdriver.chrome.logfile", "./target/chromedriver.log")
System.setProperty("webdriver.chrome.driver", System.getProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe"))


//Default driver if the geb.env variable is not set
driver = {
	// Create chromePreferences for new capabilities that use maven's target directory as the download path
	def driver = new ChromeDriver()
	driver.manage().window().maximize()
	return driver
}
