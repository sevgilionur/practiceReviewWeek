package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Css_Webtables {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/web-tables");

        String trLocater = "//table[@class='SampleTable']//tr[4]/td";

        List<WebElement>  trAll= driver.findElements(By.xpath(trLocater));

        for (WebElement eachCell : trAll) {

            System.out.println("eachCell.getText() = " + eachCell.getText());


        }




    }





}
