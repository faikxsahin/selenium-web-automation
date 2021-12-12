import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {

    WebDriver webDriver;

    @BeforeAll
    public void setupClass() {

        WebDriverManager.edgedriver().setup();
        webDriver = new EdgeDriver();
        webDriver.get("https://www.lcwaikiki.com/tr-TR/TR");
        webDriver.manage().window().maximize();

    }

    // Home Screen and Login Test

    @Test
    public void TestHomePage() {

        WebElement signInButton = webDriver.findElement(By.className("dropdown-toggle"));
        signInButton.click();

        WebElement email = webDriver.findElement(By.id("inputEmailDiv"));
        email.click();
        email.sendKeys("Your Mail Adress");

        WebElement password = webDriver.findElement(By.id("Password"));
        password.click();
        password.sendKeys("Your Password");

        webDriver.findElement(By.id("loginLink")).click();
    }

    @AfterAll
    public void teardown() {
        webDriver.quit();
    }
}
