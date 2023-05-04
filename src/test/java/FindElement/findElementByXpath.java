package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementByXpath {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.get("https://www.facebook.com/");
        String elementText=driver.findElement(By.xpath("//*[@id='email']")).getText();
        System.out.println(elementText);
        driver.quit();


    }

}
