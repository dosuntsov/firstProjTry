import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.AuthPage;
import pageObject.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Parameterized.class)

public class ExitButtonCheck {
    private WebDriver driver;
    private String userName;
    private String userPassword;


    public ExitButtonCheck(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;

    }

    @Parameterized.Parameters
    public static Object[][] getUserInfo() {
        return new Object[][]{
                {"test_top","test_top"},
                {"test_gis","test_gis"},
                {"user_001","user_001"},
                {"user_002","user_002"},
                {"user_003","user_003"},
                {"user_004","user_004"},
                {"user_005","user_005"},
                {"user_006","user_006"},
                {"user_007","user_007"},
                {"user_007","user_007"},
                {"user_008","user_008"},
                {"user_009","user_009"},
                {"user_010","user_010"},
                {"user_011","user_011"},
                {"user_012","user_012"},
                {"user_013","user_013"},
                {"user_014","user_014"},
                {"user_015","user_015"},

        };
    }

    @Test
    public void checkIfExitButtonIsEnabled(){
        driver = new ChromeDriver();

        driver.get("http://dev-portal.ci-test.luxms.com/");

        AuthPage objAuthPage = new AuthPage(driver);
        objAuthPage.userAuth(userName,userPassword);

        MainPage objMainPage = new MainPage(driver);
        objMainPage.checkButtonExist();

        Assert.assertFalse("Кнопка должна отсутствовать", objMainPage.checkButtonExist());

    }
    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }
}
