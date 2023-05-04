package multipleWindow;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class switchToParentWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
        String parent= driver.getWindowHandle();
        driver.findElement(By.linkText("Official Website")).click();
        Thread.sleep(2000);
        driver.switchTo().window(parent);
        Thread.sleep(2000);
        driver.findElement(By.linkText("Youtube")).click();
        Set<String> allWindows=driver.getWindowHandles() ;
        for (String window:allWindows)
        {
            if(!window.equalsIgnoreCase(parent))
            {
                System.out.println("hhhhhh");
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                Thread.sleep(2000);
                driver.close();          // close only new tab
                Thread.sleep(3000);

            }
        }
//        driver.switchTo().window(parent);
//        driver.findElement(By.linkText("Youtube")).click();
//        String you_tuble=driver.getWindowHandle();
//        driver.switchTo().window(you_tuble);
//        driver.close();





    }
}
