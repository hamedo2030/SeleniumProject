package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementByLinkText
{
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;

        driver.manage().window().fullscreen();
        driver.get("https://www.facebook.com/");
        String elementText=driver.findElement(By.linkText("Facebook Lite")).getText();
        System.out.println(elementText);



    }
}
