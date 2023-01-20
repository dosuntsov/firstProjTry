import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AuthPage;
import pageObject.MainPage;

public class TestInfoButton {
    private WebDriver driver;
    private String userName;
    private String userPassword;

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void checkIfButtonExist(){
        driver = new ChromeDriver();
        driver.get("http://dev-portal.ci-test.luxms.com/");

        String userName = "user_015";
        String userPassword = userName;

        AuthPage authPage = new AuthPage(driver);
        authPage.userAuth(userName, userPassword);

        MainPage mainPage = new MainPage(driver);
        mainPage.checkInfoButtonExist();

        Assert.assertFalse(mainPage.checkIfElementExist());
    }

    @Test
    public void checkIfManualNameIsCorrect(){
        driver = new ChromeDriver();
        driver.get("http://dev-portal.ci-test.luxms.com/");

        String userName = "user_015";
        String userPassword = userName;

        AuthPage authPage = new AuthPage(driver);
        authPage.userAuth(userName, userPassword);

        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals("СКИМ_Ц_Конструктор_2022_Руководство_пользователя", mainPage.getManualsNames());
    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.quit();
    }




}


