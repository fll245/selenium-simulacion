package pruebas;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiPrimeraPrueba {

    private WebDriver driver;

    @Before
    public void setUp() {
        try {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");

            // Ruta absoluta recomendada por ahora
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Personal\\eclipse-workspace\\Simulacion\\src\\test\\resources\\Driver\\chromedriver.exe");

            driver = new ChromeDriver(co);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/v1/");
        } catch (Exception e) {
            e.printStackTrace(); // 🔴 Esto imprimirá el error real en la consola
        }
    }

    @Test
    public void miPrimerTest() {
        System.out.println("Título de la página: " + driver.getTitle());
    }
}
