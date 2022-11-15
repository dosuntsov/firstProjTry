package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
public class MainPage {
    private WebDriver driver;
    // кнопка выхода
    private By exitButton = By.xpath(".//div[@class='ControllerBlock']");
    private By allHeaderButtons = By.className("Root__Header__Info__Controller");
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private void pageWaiter0() {
        new WebDriverWait(driver, 10).until(driver1 -> driver.findElement(allHeaderButtons).isDisplayed());
    }
    private void pageWaiter1() {
        new WebDriverWait(driver, 10).until(driver1 -> driver.findElement(allHeaderButtons).isDisplayed());
    }
    private void refresher() {
        driver.navigate().refresh();
    }
    public boolean checkButtonExist() {
        pageWaiter0();
        refresher();
        pageWaiter1();
        List<WebElement> buttons = driver.findElements(exitButton);
        return buttons.size() != 0;
    }
}
