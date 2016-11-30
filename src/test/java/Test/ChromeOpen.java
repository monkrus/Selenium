package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by monk on 10/28/2016.
 */

public class ChromeOpen {
    private static WebDriver driver;

    @BeforeTest

    public void selectBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome_driver\\chromedriver.exe");
        driver = new ChromeDriver();


    }

    @Test

    public void runDriver() {
        driver.get("http://google.com");








        /*System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();*/
        /*driver.get("http://google.com");
*/


        /*ChromeDriver one = new ChromeDriver();
                .usingDriverExecutable(new File("C:\\Chrome_driver\\chromedriver.exe"))
                .usingAnyFreePort()
                .build();
                service.("http://www.google.com");
*/
    }

    @AfterTest
    public void closeDriver() {
        driver.quit();
    }
}

