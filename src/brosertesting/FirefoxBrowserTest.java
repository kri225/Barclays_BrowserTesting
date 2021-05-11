package brosertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://www.barclays.co.uk/n";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title = driver.getTitle();
        boolean verifytitle = title.equals("Barclys : Personal banking");
        boolean verifytitlecontains = title.contains ("Log In");
        System.out.println(title);
        driver.close();



    }
}
