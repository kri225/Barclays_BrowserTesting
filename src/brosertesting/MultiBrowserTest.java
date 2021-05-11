package brosertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class MultiBrowserTest {


        static String baseurl1 = "https://www.barclays.co.uk/n";
        static String browser = "safari";
        static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
            
            }else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("Microsoft Edge")) {
                System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
                driver = new EdgeDriver();

            } else if (browser.equalsIgnoreCase("Internet Explorer")) {
                System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
                driver.close();
            } else {
                System.out.println("Wrong browser name");
            }

                driver.get(baseurl1);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
                driver.close();

    }
    
}










