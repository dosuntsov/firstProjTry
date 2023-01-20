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
    private By infoButton = By.xpath("//*[@id=\"root\"]/div/header/div[2]/div[2]/div[2]");
    private By manuals = By.xpath("//*[@id=\"root\"]/div/header/div[4]/div[2]/a[1]");
    private By tabC = By.id("t_C:1");
    private By tabCZ_1 = By.id("t_CZ1:2");
    private By tabINV = By.id("t_INV:3");
    private By tabOD_CCGCU = By.id("t_CGCU:4");
    private By tabN = By.id("t_N:5");
    private By tabGIS = By.id("t_GIS:6");
    private By tabKAD = By.id("t_KAD:7");
    private By tabCSS = By.id("t_CSS:8");
    private By tabINPP1 = By.className("Main__SubButton CINPP:1 ");
    private By tabINPP2 = By.className("Main__SubButton CINPP:2 ");
    private By tabINPP3 = By.className("Main__SubButton CINPP:3 ");

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean checkIfElementExist(){
       if(driver.findElement(tabCSS).getAttribute("class").contains("None")){
            return false;
       }
       else {
           return true;
       }

    }
    private boolean checkIfButtonExist(){
        boolean resultInfo = driver.findElement(infoButton).isDisplayed();
        return resultInfo;
    }
    private void clickInfoButton(){
        driver.findElement(infoButton).click();
    }

    private String getInfoText(){
        String textManual =  driver.findElement(manuals).getText();
        return textManual;
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

    public boolean checkInfoButtonExist(){
        pageWaiter0();
        return checkIfButtonExist();

    }

    public String getManualsNames(){
        pageWaiter0();
        clickInfoButton();
        return getInfoText();
    }


}
