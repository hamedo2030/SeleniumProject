package waitInSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWaitWithVisableAndUnvisableElement {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver() ;
        driver.manage().window().maximize();
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("primary")));
        driver.findElement(By.className("primary")).click();
        System.out.println("i found button one ");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cover")));
        System.out.println("i found cover ");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("secondary")));
        driver.findElement(By.className("secondary")).click();
        System.out.println("i found button two ");
    }
}
