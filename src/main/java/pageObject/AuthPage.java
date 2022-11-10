package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthPage {
    private WebDriver driver;
    private By loginInput = By.xpath(".//input[@placeholder='Логин']");
    private By passwordInput = By.xpath(".//input[@placeholder='Пароль']");
    private By authButton = By.xpath(".//button[@class='AuthDlg__Content__Form__Button']");
    public AuthPage(WebDriver driver){
        this.driver = driver;
    }
    private void clickAuthButton(){
        driver.findElement(authButton).click();
    }
    private void enterLogin(String userName) {
        driver.findElement(loginInput).sendKeys(userName);
    }
    private void enterPassword(String userPassword){
        driver.findElement(passwordInput).sendKeys(userPassword);
    }
    public void userAuth(String userPassword, String userName){
        enterLogin(userName);
        enterPassword(userPassword);
        clickAuthButton();

    }
}
