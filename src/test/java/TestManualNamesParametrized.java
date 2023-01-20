import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

@RunWith(Parameterized.class)

public class TestManualNamesParametrized {

    @Before
    public void startUp() {
        WebDriverManager.chromedriver().setup();
    }

    private WebDriver driver;
    private String userName;
    private String userPassword;


}
