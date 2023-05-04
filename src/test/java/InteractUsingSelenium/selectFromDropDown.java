package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectFromDropDown {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
        Select elementDropDown= new Select(driver.findElement(By.id("dropdown-class-example")));
        //elementDropDown.selectByIndex(0);
        //elementDropDown.selectByValue("option2");
        elementDropDown.selectByVisibleText("Option3");
    }
}
