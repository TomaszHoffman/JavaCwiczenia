import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "[data-testid='email-input']")
    private WebElement emailInput;

    @FindBy(css = "[data-testid='password-input']")
    private WebElement passwordInput;

    @FindBy(css = "[data-testid='login-submit']")
    private WebElement submitButton;

    @FindBy(css = "[data-testid='error-message']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        waitForElementVisible(emailInput);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public String getErrorMessage() {
        waitForElementVisible(errorMessage);
        return errorMessage.getText();
    }
}