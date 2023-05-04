package OpenBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openHtmlFile {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver() ;

        driver.navigate().to("file://C:/Users/Lenovo/IdeaProjects/Automation_Test/src/test/resources/index.html");

    }
}
