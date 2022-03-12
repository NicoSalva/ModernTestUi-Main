package uiTest;

import io.github.bonigarcia.wdm.WebDriverManager; //I use this library for managing drivers!
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MainTest {

    private WebDriver driver;

    @BeforeAll
    public static void setupDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }


    @Test
    void  openGoogle(){
        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Nico Salvaneschi Primavera Alperte");

    }
}






