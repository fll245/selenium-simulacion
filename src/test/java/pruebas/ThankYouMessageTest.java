package pruebas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class ThankYouMessageTest {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @Test
    public void testThankYouMessageDisplayed() {
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
        driver.findElement(By.cssSelector("button.btn_inventory")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.className("checkout_button")).click();
        driver.findElement(By.id("first-name")).sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("User");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.className("btn_primary")).click();
        driver.findElement(By.className("cart_button")).click();
        WebElement thankYou = driver.findElement(By.className("complete-header"));
        assertEquals("THANK YOU FOR YOUR ORDER", thankYou.getText());
        
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
