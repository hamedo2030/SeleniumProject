package Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class SendKeyToAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/alert.html");
        driver.findElement(By.className("prompt")).click();
        System.out.println("1");
        Thread.sleep(5000);
        driver.switchTo().alert().sendKeys("scroll");
        System.out.println("2");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        System.out.println("3");
    }
}
