package fundtransfer.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

/**
 * Created by tcbinh on 12/30/2015.
 */
public class Browser {

    private static String WINDOWS_DRIVER = "/chromedriver.exe";
    private WebDriver driver = setupChromeDriver();

    public WebDriver driver()
    {
        return driver;
    }

    public void close()
    {
        driver.quit();
    }

    private WebDriver setupChromeDriver()
    {
        String localFile = Browser.class.getResource(WINDOWS_DRIVER).getFile();
        System.setProperty("webdriver.chrome.driver", localFile);
        return  driver = new ChromeDriver();
    }
}
