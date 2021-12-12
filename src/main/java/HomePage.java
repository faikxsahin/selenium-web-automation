import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    SearchBox searchBox;

    By cartCountLocator = By.id("spanCart");
    By cartContainerLocator = By.id("header-icon-label");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        searchBox = new SearchBox(webDriver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    public boolean isSameProductCount() {
        return getCartCount() > 0;
    }

    private int getCartCount() {
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
