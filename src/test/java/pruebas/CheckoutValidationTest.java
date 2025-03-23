package pruebas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class CheckoutValidationTest {
    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/v1/");
    }

    @Test
    public void testCheckoutFirstNameRequired() {
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();
        driver.findElement(By.cssSelector("button.btn_inventory")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.className("checkout_button")).click();
        driver.findElement(By.id("last-name")).sendKeys("Test");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.className("btn_primary")).click();
        WebElement error = driver.findElement(By.cssSelector("h3[data-test='error']"));
        assertEquals("Error: First Name is required", error.getText());
        
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
