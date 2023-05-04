package InteractUsingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class practiseOfDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Select optionSelect = new Select(driver.findElement(By.id("dropdown-class-example")));
        optionSelect.selectByIndex(1);
        Thread.sleep(2000);
        optionSelect.selectByValue("option2");
        Thread.sleep(2000);
        optionSelect.selectByVisibleText("Option3");
        Thread.sleep(5000);
        driver.findElement(By.id("checkBoxOption1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("checkBoxOption3")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        boolean enableText = driver.findElement(By.id("autocomplete")).isEnabled();

        if(enableText)
        {
            driver.findElement(By.id("autocomplete")).sendKeys("hello mostafa");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        boolean check1=driver.findElement(By.id("checkBoxOption1")).isSelected();
        boolean check2=driver.findElement(By.id("checkBoxOption2")).isSelected();
        boolean check3=driver.findElement(By.id("checkBoxOption3")).isSelected();

        if(check1&&check2&&check3 )
        {
            System.out.println("all selected ");
        }








    }
}
