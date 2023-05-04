package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementByCss {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");
        String elementText=driver.findElement(By.cssSelector("#welcome")).getText();
        System.out.println(elementText);
        String elementText1=driver.findElement(By.cssSelector(".list1")).getText();
        System.out.println(elementText1);
        String elementText2=driver.findElement(By.cssSelector("[name=\"description\"]")).getText();
        System.out.println(elementText2);
               //driver.quit();


    }
}
