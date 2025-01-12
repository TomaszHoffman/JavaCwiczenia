import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageElements() {
        driver.get(BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        Assert.assertTrue(homePage.isSignUpButtonDisplayed(), "Menu button should be visible");
    }
}