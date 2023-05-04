package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver() ;
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String title= driver.getTitle();
        System.out.println("++++++++++"+title+"+++++++++++");
    }

}
