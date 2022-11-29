package configurations;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase { @BeforeAll
static void configure() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("enableVNC", true);
    capabilities.setCapability("enableVideo", true);

    Configuration.browserCapabilities = capabilities;
    Configuration.baseUrl = "https://www.brainnest.consulting";

    String browser = System.getProperty("browser", "chrome");
    String browserSize = System.getProperty("browserSize", "1920x1080");
    String remoteUrl = System.getProperty("remoteUrl");

    Configuration.browser = browser;
    Configuration.browserSize = browserSize;
    if (remoteUrl != null) {
        Configuration.remote = remoteUrl;
    }
}

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}