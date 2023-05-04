package OpenBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {
    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver() ;
        driver.navigate().to("https://www.youm7.com/");


    }
}
