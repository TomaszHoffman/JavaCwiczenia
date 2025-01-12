import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);

    @FindBy(css = "[data-testid='start-free-button']")
    private WebElement startFreeButton;

    @FindBy(xpath = "//a[contains(@class, 'Header_loginButton__WkWFO')]")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(@class, 'MenuButton_item__Cl55b')]")
    private WebElement signUpButton;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement acceptCookiesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        try {
            waitForElementClickable(acceptCookiesButton);
            acceptCookiesButton.click();
            logger.info("Cookies accepted successfully");
        } catch (TimeoutException | NoSuchElementException e) {
            logger.debug("Cookie banner not present or already accepted");
        }
    }

    public void clickStartFree() {
        waitForElementClickable(startFreeButton);
        startFreeButton.click();
        logger.info("Clicked on Start Free button");
    }

    public void clickLogin() {
        waitForElementClickable(loginButton);
        loginButton.click();
        logger.info("Clicked on Login button");
    }

    public boolean isSignUpButtonDisplayed() {
        try {
            waitForElementVisible(signUpButton);
            return signUpButton.isDisplayed();
        } catch (TimeoutException e) {
            logger.warn("Signup button not visible after timeout");
            return false;
        }
    }
}