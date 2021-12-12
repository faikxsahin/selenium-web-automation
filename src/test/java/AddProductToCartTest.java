import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AddProductToCartTest extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailsPage productDetailsPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void searchProduct() {
        homePage = new HomePage(webDriver);
        productsPage = new ProductsPage(webDriver);
        homePage.searchBox().search("pantolon");
    }

    @Test
    @Order(2)
    public void selectProduct() {
        productsPage.selectProduct(1);
    }

    @Test
    @Order(3)
    public void addProductToCart() {
        productDetailsPage = new ProductDetailsPage(webDriver);
        productDetailsPage.addToCart();
        Assertions.assertTrue(homePage.isSameProductCount(), "Product count is NOT same!");
    }

    @Test
    @Order(4)
    public void goToCart() {
        cartPage = new CartPage(webDriver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(), "Product was NOT added to the cart!");
    }

}
