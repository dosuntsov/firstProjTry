package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class MainPage {
    private WebDriver driver;
    // кнопка выхода
    private By exitButton = By.xpath(".//div[@class='ControllerBlock']");
    public MainPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean checkButtonExist() {
        List<WebElement> buttons = driver.findElements(exitButton);
        return buttons.size() != 0;
    }
}
