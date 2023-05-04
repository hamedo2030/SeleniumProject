package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrl {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver() ;
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String Url= driver.getCurrentUrl();
        System.out.println("++++++++++"+Url+"+++++++++++");

    }


}
