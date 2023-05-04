package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class moveToElement {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
        Actions action= new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement Button =driver.findElement(By.xpath("//*[@id=\"opentab\"]"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(Button).perform();
     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     //   WebElement Button1 =driver.findElement(By.xpath("//input[@value='Show']"));
     //   action.doubleClick(Button1).perform();

    }
}
