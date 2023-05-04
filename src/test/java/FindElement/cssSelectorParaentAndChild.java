package FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelectorParaentAndChild {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver() ;
        driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");
        String elementTest =driver.findElement(By.cssSelector(".course-list .list1")).getText()  ;
        System.out.println(elementTest);
        String elementTest1 =driver.findElement(By.cssSelector(".course-list .list2")).getText()  ;
        System.out.println(elementTest1);
        String elementTest3 =driver.findElement(By.cssSelector(".country-list .list1")).getText()  ;
        System.out.println(elementTest3);
        String elementTest4 =driver.findElement(By.cssSelector(".country-list .list2")).getText()  ;
        System.out.println(elementTest4);

        String fruits =driver.findElement(By.cssSelector("#aboutPage")).getText()  ;
        System.out.println(fruits);
        String fruits1 =driver.findElement(By.cssSelector("[name='description']")).getText()  ;
        System.out.println(fruits1);
        String fruits2 =driver.findElement(By.cssSelector("[id='welcome']")).getText()  ;
        System.out.println(fruits2);


    }
}
