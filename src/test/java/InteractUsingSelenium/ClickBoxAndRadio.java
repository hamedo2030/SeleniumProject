package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ClickBoxAndRadio {

    public static void main(String[] args) {
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver=new FirefoxDriver();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");
//        driver.findElement(By.cssSelector("[id=\"Banana\" ]")).click();
//        driver.findElement(By.xpath("//*[@id=\"Nuts\"]")).click();
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();

//        driver.findElement(By.cssSelector("[id=\"Banana\" ]")).click();
       // driver.findElement(By.xpath("//*[text(),'option2']")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]")).click();
//
        driver.manage().window().maximize();
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
//        write xpath by me not by get from browser ...i can get it by value , text , area label , id , name

        driver.findElement(By.xpath("//input[@value='option3']")).click();
        driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        driver.findElement(By.xpath("//input[@value='radio2']")).click();
        driver.findElement(By.xpath("//input[@value='radio3']")).click();










    }

}
