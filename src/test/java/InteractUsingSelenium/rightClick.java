package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        Actions action =new Actions(driver);
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));
        action.contextClick(doubleClickButton).perform();
    }
}
