package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementByClassName {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://chrome.google.com/webstore/category/extensions?hl=en");

        String elementText=driver.findElement(By.className("h-n-j-Z-ea-ha-K")).getText();
        System.out.println(elementText);
        //driver.quit();




    }
}
