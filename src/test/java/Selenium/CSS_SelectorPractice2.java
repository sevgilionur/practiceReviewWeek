package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CSS_SelectorPractice2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

        Select select = new Select(driver.findElement(By.cssSelector("select[name='Languages']")));
        select.isMultiple();
        select.selectByVisibleText("Java");
        Thread.sleep(2000);
        select.selectByVisibleText("JavaScript");
        Thread.sleep(2000);
        select.selectByVisibleText("C#");
        Thread.sleep(2000);
        select.selectByVisibleText("Python");
        Thread.sleep(2000);
        select.selectByVisibleText("Ruby");
        Thread.sleep(2000);
        select.selectByVisibleText("C");

        Thread.sleep(2000);

        select.deselectAll();

        

    }
}
/**
 * TC #8: Selecting value from multiple select dropdown
 * 1. Open Chrome browser
 * 2. Go to https://practice.cydeo.com/dropdown
 * 3. Select all the options from multiple select dropdown.
 * 4. Print out all selected values.
 * 5. Deselect all values.
 */