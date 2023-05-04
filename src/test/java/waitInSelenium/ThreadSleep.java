package waitInSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreadSleep {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver() ;

        driver.manage().window().maximize();
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
        Thread.sleep(10000);
        driver.findElement(By.className("primary")).click();

    }
}
