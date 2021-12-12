import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage {

    By addToCartButtonLocator =By.id("pd_add_to_cart");

    public ProductDetailsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void addToCart() {
        click(addToCartButtonLocator);
    }

}
