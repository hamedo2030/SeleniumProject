package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaxmizeAndFullScreen {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;

        driver.manage().window().fullscreen();
        driver.get("https://www.facebook.com/");
       //driver.manage().window().maximize();

    }

}
