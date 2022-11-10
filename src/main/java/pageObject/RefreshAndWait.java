package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshAndWait {
    private WebDriver driver;

    public RefreshAndWait(WebDriver driver) {
        this.driver = driver;
    }

        private void pageWaiter() {
            new WebDriverWait(driver, 10);
        }
        private void refresher() {
            driver.navigate().refresh();
        }

        public void refreshAndWait() {
            refresher();
            pageWaiter();
        }
    }

