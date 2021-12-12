import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage {

    By searchBoxLocator = By.id("search_input");
    By searchButtonLocator = By.className("search-box__button");

    public SearchBox(WebDriver webDriver) {
        super(webDriver);
    }

    public void search(String text) {
        type(searchBoxLocator, text);
        click(searchButtonLocator);
    }

}
