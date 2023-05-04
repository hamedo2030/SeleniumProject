package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getAriaRole {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        String role =driver.findElement(By.xpath("//input[@id='autocomplete']")).getAriaRole();
        System.out.println(role);
        String role1 =driver.findElement(By.className("tableFixHead")).getAriaRole();
        System.out.println(role1);
        String role2 =driver.findElement(By.id("checkBoxOption1")).getAriaRole();
        System.out.println(role2);
    }
}
