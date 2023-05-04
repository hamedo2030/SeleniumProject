package waitInSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class disadvantageOfImplicitWait {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver() ;
        driver.manage().window().maximize();
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.className("primary")).click();
        System.out.println("i found button one ");
        driver.findElement(By.className("secondary")).click();
        System.out.println("i found button two ");


    }
}
