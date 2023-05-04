package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementById {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");

        String elementText=driver.findElement(By.id("content")).getText();
        System.out.println(elementText);


        driver.quit();


       // driver.findElement(By.id());





    }


}
