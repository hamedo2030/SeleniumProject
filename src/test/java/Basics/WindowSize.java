package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSize {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.get("https://www.facebook.com/");
      /*  Dimension IphoneXr=new Dimension(414,896);
        driver.manage().window().setSize(IphoneXr);*/

        Dimension Galaxy=new Dimension(500,400);
        driver.manage().window().setSize(Galaxy);



    }
}
