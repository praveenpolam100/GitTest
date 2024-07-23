import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectclassExample {

    private static WebDriver driver;

    public static void getDriver(){

        driver = new ChromeDriver();
    }
    public static void selectdropdownExample(){

        WebElement dropdown = driver.findElement(By.xpath("test"));
        Select select = new Select(dropdown);
        List<WebElement> webElementList = select.getOptions();
        for (WebElement webElement : webElementList){
            System.out.println(webElement.getText());
        }
    }
}
