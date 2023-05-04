package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElementGetElementByIndex {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");
       String text = driver.findElements(By.cssSelector(".course-list li")).get(2).getText();
        System.out.println(text);

        int i =0 ;
        for(i=0;i<10;i++){
            String text1 = driver.findElements(By.cssSelector(".course-list li")).get(i).getText();
            System.out.println(text1);

        }

    }
}


