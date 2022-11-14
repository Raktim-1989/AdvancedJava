package JenkinsDemo.demoJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.*;

public class OpenBrowser {
	
	static WebDriver driver;
	
	@BeforeTest
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}
	
	
	@Test
	public void getTitle()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "T20 World Cup Cricket Score, Schedule, Latest News, Stats & Videos | Cricbuzz.com");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}

}
