package brosertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://www.barclays.co.uk/n";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get(baseurl);

        String pagesource = driver.getPageSource();
        System.out.println(pagesource);

        String title = driver.getTitle();
        boolean verifytitle = title.equals("Barclays: Personal banking");
        boolean verifytitlecontain = title.contains("Log In");
        System.out.println(title);
        System.out.println(verifytitle);
        System.out.println(verifytitlecontain);

        driver.close();

    }


}
