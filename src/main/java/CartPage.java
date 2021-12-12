import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage {

    By cartProductNameLocator = By.className("rd-cart-item-title");

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0;
    }

    private List<WebElement> getProducts() {
        return findAll(cartProductNameLocator);
    }

}
