package brosertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://www.barclays.co.uk/n";
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title  = driver.getTitle();
        boolean verifytitle = title.equals("Barclays : Personals");
        boolean verifytitlecontains = title.contains("Log In");
        System.out.println(title);
        System.out.println(verifytitlecontains);
        System.out.println(verifytitlecontains);
        driver.close();

    }
}
