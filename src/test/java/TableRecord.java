import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TableRecord {

    private static WebDriver driver;

    static By tableColumn = By.xpath("//*[@id='example']/thead/tr/th");
    static By tableRecordsData = By.xpath("//*[@id='example']//tbody//tr");
    static By tableColumnsDataxPath = By.xpath("//*[@id='example']//tbody//tr[\"+i+\"]//td");

    public static void getDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //return driver;

    }

    public static void navigateURL(){

        driver.get("https://www.lambdatest.com/selenium-playground/");
    }

    public static void openLink(){
        driver.findElement(By.linkText("Table Data Download")).click();
    }
    public static void readingTableColumns(){

        List<WebElement> elements = driver.findElements(tableColumn);
        Set<String > columnNames = new LinkedHashSet<>();
        for (WebElement element: elements){

            if(!columnNames.add(element.getText())){
                System.out.println("Column name duplicated:" + element.getText());
                throw new IllegalArgumentException("Duplicate column Name:" +element.getText());
            }

        }
        columnNames.forEach(element->{
            System.out.println(element);
        });
    }

    public static void findingUserExperience(){

        List<WebElement> tableRecords = driver.findElements(tableRecordsData);

        System.out.println(tableRecords.size());
        //List<WebElement> tableColumnsData = driver.findElements(By.xpath("//*[@id='example']//tbody//tr[1]//td"));
       // System.out.println(tableColumnsData.size());

        for (int i=1; i<=tableRecords.size(); i++){
            //List<WebElement> tableRecords1 = driver.findElements(By.xpath("//*[@id='example']//tbody//tr[i+1]"));
            List<WebElement> tableColumnsData = driver.findElements(tableColumnsDataxPath);
            for (int j=0; j<tableColumnsData.size(); j++){
                String firstName = tableColumnsData.get(j).getText();
                System.out.println(firstName);
            }
        }
    }

    public static void tearDown(){
        driver.quit();
    }

    public static void main(String[] args) {

        getDriver();
        navigateURL();
        openLink();
        readingTableColumns();
        findingUserExperience();
        tearDown();
    }


}
