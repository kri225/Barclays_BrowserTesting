package brosertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeBrowserTest {
    public static void main(String[] args) {
        String baserurl = "https://www.barclays.co.uk/n";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baserurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title  = driver.getTitle();
        boolean verifytiltle = title.equals("Barclays: Personal");
        boolean verifytitlecontain = title.contains("Log In");
        System.out.println(title);
        System.out.println(verifytiltle);
        System.out.println(verifytitlecontain);
        driver.close();
    }
}
