package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ListOfWebElement {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");
        String text = driver.findElements(By.cssSelector(".course-list li")).get(2).getText();
        System.out.println(text);
        List<WebElement> courseList= driver.findElements(By.cssSelector(".course-list li")) ;
        WebElement css=courseList.get(1);
        System.out.println(css.getText());
        String test=css.getText();

        System.out.println("-----------------------------");

        List<WebElement> List =driver.findElements(By.cssSelector(".course-list li"));
        for (int i=0;i<List.size();i++)
        {
            System.out.println(List.get(i).getText());
        }
        System.out.println(List.size());




        //driver.quit();



    }
}
