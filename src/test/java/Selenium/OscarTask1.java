package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.ConfigurationReader;
import utility.Driver;

public class OscarTask1 {

    @Test
    public void amazonTest(){

        Driver.getDriver().get("https://amazon.com");

        WebElement searchButton = Driver.getDriver().findElement((By.xpath("//input[@type='text']")));

        searchButton.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        WebElement firstElement = Driver.getDriver().findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//h2//a[1]"));

        firstElement.click();

        WebElement quantityButton = Driver.getDriver().findElement(By.xpath("//span[.='Qty:']"));

        quantityButton.click();

        WebElement select2 = Driver.getDriver().findElement(By.xpath("//a[.='2 ']"));

        select2.click();

        WebElement addToCartButton = Driver.getDriver().findElement(By.xpath("//input[@id='add-to-cart-button']"));

        addToCartButton.click();

        WebElement goToCartButton = Driver.getDriver().findElement(By.xpath("//a[@class='a-button-text']"));

        goToCartButton.click();


    }


}
/**
 For the Tasks bellow create a new Maven Project, use the latest topics you have learned, like Page Object Modeling, singleton Driver class.
 Share your project on GitHub, create a commit history. Also for each different task create a branch, then merge it when the task is over. (Optional; share you project Github Link at Tasks and Solutions Channel on Discord.)

 Task 1: The task consists on the next steps:
 1.	Go to https://www.amazon.com
 2.	Search for "hats for men" (Call from Configuration.properties file)
 3.	Add the first hat appearing to Cart with quantity 2
 4.	Open cart and assert that the total price and quantity are correct
 5.	Reduce the quantity from 2 to 1 in Cart for the item selected in the step 3
 6.	Assert that the total price and quantity has been correctly changed
 The goal of this test is to check if you are able to automate a test of a given website, but we'd like you to also demonstrate the coding quality, structure, and style of the deliverables.

 */