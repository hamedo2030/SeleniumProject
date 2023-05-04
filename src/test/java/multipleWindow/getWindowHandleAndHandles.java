package multipleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.compress.utils.OsgiUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;



public class getWindowHandleAndHandles {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
        String parent= driver.getWindowHandle();
        System.out.println(parent);
        driver.findElement(By.linkText("Official Website")).click();
        //System.out.println(driver.getWindowHandles());
        // or
        Set<String> allWindows=driver.getWindowHandles() ;
        System.out.println(allWindows);


    }
}
