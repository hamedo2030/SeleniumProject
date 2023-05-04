package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SendKey {
    public static void main(String[] args) {
       WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        //driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");

        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("engmostafa_hamido@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Mostafa@132030");
    }
}
