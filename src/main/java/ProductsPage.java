import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By productNameLocator = By.className("title");
    By moreItemsLocator = By.className("lazy-load-text");

    public ProductsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void selectProduct(int i) {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        click(moreItemsLocator);
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts() {
        return findAll(productNameLocator);
    }
    

}
