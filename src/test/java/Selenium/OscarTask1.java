package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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


        WebElement totalPrice = Driver.getDriver().findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']/span"));
        WebElement quantity = Driver.getDriver().findElement(By.xpath("//span[@class='a-dropdown-prompt']"));

        String expectedPrice = totalPrice.getText();
        String actualPrice = totalPrice.getText();

        String expectedQuantity = "2";
        String actualQuantity = quantity.getText();

        Assert.assertEquals(expectedPrice, actualPrice, "Price is wrong");
        Assert.assertEquals(expectedQuantity,actualQuantity, "Quantity is wrong");

        WebElement quantityButton2 = Driver.getDriver().findElement(By.xpath("//span[@class='a-button a-button-dropdown quantity']"));
        quantityButton2.click();

        WebElement selectQuantity = Driver.getDriver().findElement(By.xpath("//li[@aria-labelledby='quantity_1']"));
        selectQuantity.click();

        WebElement quantityReduce = Driver.getDriver().findElement(By.xpath("//span[@class='a-dropdown-prompt']"));

        String actualQuantity1 = "1";
        String expectedQuantity1 = quantityReduce.getText();

        Assert.assertEquals(actualQuantity1, expectedQuantity1, "Quantity is wrong");




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