import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTests {
    public WebDriver driver;

    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void amazonRangeTest1To50() {
        getAmazonProductByFilter(driver, "tennis", 25, 50);
    }

    @Test
    public void amazonRangeTest50To100() {
        getAmazonProductByFilter(driver, "tennis", 50, 100);
    }

    @Test
    public void amazonRangeTest100To150() {
        getAmazonProductByFilter(driver, "tennis", 100, 150);
    }

    @Test
    public void amazonRangeTest150To200() {
        getAmazonProductByFilter(driver, "tennis", 150, 200);
    }

    public static void getAmazonProductByFilter(WebDriver driver, String objet, int lower, int high) {
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(objet);
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.id("low-price")).sendKeys(Integer.toString(lower));
        driver.findElement(By.id("high-price")).sendKeys(Integer.toString(high));
        driver.findElement(By.id("a-autoid-1")).click();
        driver.findElement(By.id("a-autoid-0-announce")).click();
        //driver.findElement(By.name("s-result-sort-select_1")).click();
        //driver.findElement(By.id("s-result-sort-select_1")).click();
        //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[5]/div/span/div/div/div[4]/div/a/span/span[2]/span[2]")).getText();
       // File DestFile= new File("extractedFilePath");
        //FileUtils.writeStringToFile(DestFile, output);
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}
