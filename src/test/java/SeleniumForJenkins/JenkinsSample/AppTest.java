package SeleniumForJenkins.JenkinsSample;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void runSeleniumMethod()
    {
    	
    	WebDriver checkDriver = new ChromeDriver();
    	checkDriver.get("https://www.amazon.in/");
    	checkDriver.manage().deleteAllCookies();
    	checkDriver.manage().window().maximize();
    	checkDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	String getURLTitle = checkDriver.getTitle();
    	System.out.println(getURLTitle);
    	checkDriver.quit();
        assertTrue( true );
    }
}
