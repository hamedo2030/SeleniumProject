package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getRectangle {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();

        Rectangle details= driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).getRect() ;
        System.out.println(details.x);
        System.out.println(details.y);
        System.out.println(details.height);
        System.out.println(details.width);




    }
}
