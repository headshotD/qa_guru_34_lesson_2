package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {
    @BeforeAll
    static void browserConfiguration() {
        Configuration.browserSize = "1366x768";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
    }
    @AfterEach
    void closeChromeWebDriver() {
        Selenide.closeWebDriver();
    }
}
