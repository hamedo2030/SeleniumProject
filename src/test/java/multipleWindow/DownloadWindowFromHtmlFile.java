package multipleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DownloadWindowFromHtmlFile {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
       // driver.findElement(By.linkText("Official Website")).click();
        driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();




    }
}
