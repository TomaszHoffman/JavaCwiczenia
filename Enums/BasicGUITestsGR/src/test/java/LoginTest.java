import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() {
        driver.get(BASE_URL);
        HomePage homePage = new HomePage(driver);
        homePage.acceptCookies();
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("tomaszmhoffman@gmail.com", "invalidPassword");

        String errorMsg = loginPage.getErrorMessage();
        Assert.assertTrue(errorMsg.contains("Invalid credentials"),
                "Error message should indicate invalid credentials");
    }
}