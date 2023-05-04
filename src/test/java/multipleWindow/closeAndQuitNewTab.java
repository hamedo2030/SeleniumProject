package multipleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class closeAndQuitNewTab {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
        String parent= driver.getWindowHandle();
        driver.findElement(By.linkText("Official Website")).click();
        Set<String> allWindows=driver.getWindowHandles() ;
        for (String window:allWindows)
        {
            if(!window.equalsIgnoreCase(parent))
            {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
               // driver.close();           close only new tab
                driver.quit();  // close all tab or browser


            }
        }
    }
}
