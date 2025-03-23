package pruebas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class CartTest {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @Test
    public void testAddToCart() {
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
        driver.findElement(By.cssSelector("button.btn_inventory")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        WebElement cartItem = driver.findElement(By.className("inventory_item_name"));
        assertEquals("Sauce Labs Backpack", cartItem.getText());
        
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
