package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CSS_SelectorPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("http://practice.cybertekschool.com/dropdown");

        Select select = new Select(driver.findElement(By.cssSelector("select[id='state']")));
        select.selectByVisibleText("Illinois");

        Thread.sleep(2000);

        select.selectByValue("VA");

        Thread.sleep(2000);

        select.selectByIndex(5);







    }

}
/**
 TC #5: Selecting state from State dropdown and verifying result
 1. Open Chrome browser
 2. Go to http://practice.cybertekschool.com/dropdown
 3. Select Illinois
 4. Select Virginia
 5. Select California
 6. Verify final selected option is California.
 Use all Select options. (visible text, value, index)
 */