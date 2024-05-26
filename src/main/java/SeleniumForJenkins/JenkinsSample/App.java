package SeleniumForJenkins.JenkinsSample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver checkDriver = new ChromeDriver();
    	checkDriver.get("https://www.amazon.in/");
    	checkDriver.manage().deleteAllCookies();
    	checkDriver.manage().window().maximize();
    	checkDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	String getURLTitle = checkDriver.getTitle();
    	System.out.println(getURLTitle);
    	checkDriver.quit();
    }
}
