package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class isDisplay {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
        boolean  check =driver.findElement(By.xpath("//input[@id='displayed-text']")).isDisplayed();
        System.out.println(check);
    }
}
