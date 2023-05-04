package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class byContainsFunction {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");
        // String text = driver.findElements(By.cssSelector(".course-list li")).get(2).getText();
        // String text = driver.findElements(By.xpath("//input[contains(text(),'Get')]"));
        String text1=driver.findElement(By.xpath("//*[contains(text(),'Contact')]")).getText();
        System.out.println(text1);
        String text=driver.findElement(By.xpath("//*[contains(text(),'Get')]")).getText();
        System.out.println(text);
        //driver.quit();
    }
}
