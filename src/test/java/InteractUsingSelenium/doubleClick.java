package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;

public class doubleClick {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

       // driver.get("https://www.facebook.com/");
       Actions action =new Actions(driver);
//        WebElement doubleClickButton = driver.findElement(By.cssSelector("[data-testid=\"royal_login_button\"]"));
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));
        action.doubleClick(doubleClickButton).perform();



    }
}
